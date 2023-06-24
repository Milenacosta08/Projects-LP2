package TemplateMethod;

public class Main {
    public static void main(String[] args) {
        House glassHouse = new GlassWallHouse();
        House concreteHouse = new ConcreteWallHouse();

        glassHouse.buildHouse();
        concreteHouse.buildHouse();

        System.out.println(glassHouse);
        System.out.println(concreteHouse);
    }
}