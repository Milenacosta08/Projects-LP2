interface CakeFactory {
    Cake createCake(String cakeName);
}

class ButterCakeFactory implements CakeFactory {
    public Cake createCake(String cakeName) {
        switch (cakeName) {
            case "chocolate":
                return new ChocolateButterCake();
            case "Orange":
                return new OrangeButterCake();
            default:
                throw new IllegalArgumentException("Unknown cake type.");
        }
    }
}

class ButterlessCakeFactory implements CakeFactory {
    public Cake createCake(String cakeName) {
        switch (cakeName) {
            case "chocolate":
                return new ChocolateButterlessCake();
            case "orange":
                return new OrangeButterlessCake();
            default:
                throw new IllegalArgumentException("Unknown cake type.");
        }
    }
}

interface Cake {
    void recipe();

    void comments();

    void aboutCake();
}

class ChocolateButterCake implements Cake {
    private final String name = "Chocolate Butter Cake";
    private final String type = "Butter";
    private final double price = 30.0;

    public void recipe() {
        System.out.println("Recipe of Chocolate Butter Cake");
        // ...
    }

    public void comments() {
        System.out.println("Comments on Chocolate Butter Cake");
        // ...
    }

    public void aboutCake() {
        System.out.println("Name: " + name);
        System.out.println("Type: " + type);
        System.out.println("Price: " + price);
    }
}

class OrangeButterCake implements Cake {
    private final String name = "Orange Butter Cake";
    private final String type = "Butter";
    private final double price = 25.0;

    public void recipe() {
        System.out.println("Recipe of Orange Butter Cake");
        // ...
    }

    public void comments() {
        System.out.println("Comments on Orange Butter Cake");
        // ...
    }

    public void aboutCake() {
        System.out.println("Name: " + name);
        System.out.println("Type: " + type);
        System.out.println("Price: " + price);
    }
}

class ChocolateButterlessCake implements Cake {
    private final String name = "Chocolate Butterless Cake";
    private final String type = "Butterless";
    private final double price = 35.0;

    public void recipe() {
        System.out.println("Recipe of Chocolate Butterless Cake");
        // ...
    }

    public void comments() {
        System.out.println("Comments on Chocolate Butterless Cake");
        // ...
    }

    public void aboutCake() {
        System.out.println("Name: " + name);
        System.out.println("Type: " + type);
        System.out.println("Price: " + price);
    }
}

class OrangeButterlessCake implements Cake {
    private final String name = "Orange Butterless Cake";
    private final String type = "Butterless";
    private final double price = 20.0;

    public void recipe() {
        System.out.println("Recipe of Orange Butterless Cake");
        // ...
    }

    public void comments() {
        System.out.println("Comments on Vanilla Butterless Cake");
        // ...
    }

    public void aboutCake() {
        System.out.println("Name: " + name);
        System.out.println("Type: " + type);
        System.out.println("Price: " + price);
    }
}

public class CakeFactoryTest {
    public static void main(String[] args) {
        CakeFactory butterFactory = new ButterCakeFactory();
        CakeFactory butterlessFactory = new ButterlessCakeFactory();

        Cake chocolateButterCake = butterFactory.createCake("chocolate");
        Cake vanillaButterCake = butterFactory.createCake("vanilla");
        Cake chocolateButterlessCake = butterlessFactory.createCake("chocolate");
        Cake vanillaButterlessCake = butterlessFactory.createCake("vanilla");

        System.out.println("Butter cakes:");
        chocolateButterCake.aboutCake();
        chocolateButterCake.recipe();
        chocolateButterCake.comments();
        vanillaButterCake.aboutCake();
        vanillaButterCake.recipe();
        vanillaButterCake.comments();

        System.out.println("Butterless cakes:");
        chocolateButterlessCake.aboutCake();
        chocolateButterlessCake.recipe();
        chocolateButterlessCake.comments();
        vanillaButterlessCake.aboutCake();
        vanillaButterlessCake.recipe();
        vanillaButterlessCake.comments();
    }
}
