package telephone;

import java.util.ArrayList;
import java.util.List;

/**
 * Store a phone number, digit-by-digit
 */
public class PhoneModel {
    private List<Integer> digits = new ArrayList<>();
    private List<Observer> observers = new ArrayList<>();

    public void addDigit(int newDigit) {
        digits.add(newDigit);
        notifyObservers(newDigit);
    }

    public void setPhoneNumber(List<Integer> phoneNumber) {
        digits = phoneNumber;
        notifyObservers(phoneNumber);
    }

    public List<Integer> getDigits() {
        return digits;
    }

    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    private void notifyObservers(int newDigit) {
        for (Observer observer : observers) {
            observer.update(newDigit);
        }
    }

    private void notifyObservers(List<Integer> phoneNumber) {
        for (Observer observer : observers) {
            observer.update(new ArrayList<>(phoneNumber));
        }
    }
}
