package modernJavaInAction.observer;

import java.util.ArrayList;
import java.util.List;

public interface Subject {
    void registerObserver(Observer o);
    void notifyObservsers(String tweet);
}

