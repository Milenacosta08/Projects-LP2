package FacadePattern;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class client {
    private static int choice;

    public static void main(String args[]) throws NumberFormatException, IOException {
        do {
            System.out.print("\n========= Mobile Shop ============ \n");
            System.out.print("            1. IPHONE.              \n");
            System.out.print("            2. SAMSUNG.              \n");
            System.out.print("            3. BLACKBERRY.            \n");
            System.out.print("            4. Exit.                     \n");
            System.out.print("Enter your choice: ");

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            choice = Integer.parseInt(br.readLine());
            ShopKeeper sk = new ShopKeeper();

            switch (choice) {
                case 1: {
                    sk.iphoneSale();
                }
                    break;
                case 2: {
                    sk.samsungSale();
                }
                    break;
                case 3: {
                    sk.blackberrySale();
                }
                    break;
                case 4: {
                    System.out.println("Exit. Thank you for visiting our shop.");
                }
                    break;
                default: {
                    System.out.println("Nothing You purchased");
                    break;
                }
            }

        } while (choice != 4);
    }
}
