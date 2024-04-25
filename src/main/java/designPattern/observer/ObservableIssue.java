package designPattern.observer;

import java.util.Observable;
import java.util.Observer;

public class ObservableIssue {
    private Observable observable;

    public ObservableIssue() {
        observable = new Observable() {
            public void setChanged() {
                super.setChanged(); // Now we can call the protected method
            }
        };
    }

    public void addObserver(Observer observer) {
        observable.addObserver(observer);
    }

    public void removeObserver(Observer observer) {
        observable.deleteObserver(observer);
    }

    public void notifyObservers(Object arg) {
//        observable.setChanged(); // Call the protected method through composition
        observable.notifyObservers(arg);
    }
}
