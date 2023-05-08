package BridgePattern;

public class questionFormat extends questionManager {
    public questionFormat(String catalog) {
        super(catalog);
    }

    public void displayAll() {
        System.out.println("\n---------------------------------------------------------");
        super.displayAll();
        System.out.println("-----------------------------------------------------------");
    }
}
