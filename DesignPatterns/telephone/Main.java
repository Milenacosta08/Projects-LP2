package telephone;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        final int NUM_DIGITS = 10;

        // Build the object graph
        PhoneModel model = new PhoneModel();
        KeyPad keyPad = new KeyPad(model);
        Screen screen = new Screen(model);

        // Register the observer
        model.addObserver(screen);

        // Run the program
        keyPad.simulateKeyPresses(NUM_DIGITS);
        List<Integer> phoneNumber = model.getDigits();
        model.setPhoneNumber(phoneNumber);
    }
}