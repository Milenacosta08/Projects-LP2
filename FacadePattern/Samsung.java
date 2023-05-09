package FacadePattern;

public class Samsung implements MobileShop {
    @Override
    public String modelNo() {
        return "SAMSUNG GALAXY TAB 3";
    }

    @Override
    public float price() {
        return 45000;
    }
}