package FacadePattern;

public class Iphone implements MobileShop {

    @Override
    public String modelNo() {
        return "IPHONE 6";
    }

    @Override
    public float price() {
        return 65000;
    }

}
