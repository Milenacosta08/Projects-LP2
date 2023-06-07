package telephone;

import java.util.List;

public class Screen implements Observer {
    private final PhoneModel model;

    public Screen(PhoneModel model) {
        this.model = model;
    }

    @Override
    public void update(int newDigit) {
        System.out.println(newDigit);
    }

    @Override
    public void update(List<Integer> phoneNumber) {
        StringBuilder sb = new StringBuilder("Now dialing ");
        for (Integer digit : phoneNumber) {
            sb.append(digit);
        }
        sb.append("...");
        System.out.println(sb.toString());
    }
}