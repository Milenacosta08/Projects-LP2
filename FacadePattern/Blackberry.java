package FacadePattern;

public class Blackberry implements MobileShop {

    @Override
    public String modelNo() {
        return "BLACKBERRY Z10";
    }

    @Override
    public float price() {
        return 55000;
    }

}
