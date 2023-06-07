package telephone;

import java.util.List;

public interface Observer {
    void update(int newDigit);

    void update(List<Integer> phoneNumber);
}