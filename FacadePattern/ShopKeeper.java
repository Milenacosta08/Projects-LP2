package FacadePattern;

public class ShopKeeper {
    private MobileShop iphone;
    private MobileShop samsung;
    private MobileShop blackberry;

    public ShopKeeper() {
        iphone = new Iphone();
        samsung = new Samsung();
        blackberry = new Blackberry();
    }

    public void iphoneSale() {
        System.out.println("\n" + iphone.modelNo());
        System.out.println("R$ " + iphone.price());
    }

    public void samsungSale() {
        System.out.println("\n" + samsung.modelNo());
        System.out.println("R$ " + samsung.price());
    }

    public void blackberrySale() {
        System.out.println("\n" + blackberry.modelNo());
        System.out.println("R$ " + blackberry.price());
    }
}
