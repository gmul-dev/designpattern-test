package modernJavaInAction.observer;

import java.util.ArrayList;
import java.util.List;

public class Feed implements Subject {
    private final List<Observer> observers = new ArrayList<>();

    @Override
    public void registerObserver(Observer o) {
        this.observers.add(o);
    }

    @Override
    public void notifyObservsers(String tweet) {
        observers.forEach(o -> o.notify(tweet));
    }

    public static void main(String[] args) {
        Feed f = new Feed();
        f.registerObserver(new NYTimes());
        f.registerObserver(new Guardian());
        f.registerObserver(new LeMonde());

        //observer 구현체 -> lambda
        f.registerObserver((String tweet) -> {
            if(tweet != null && tweet.contains("queen")) {
                System.out.println("lambda queen : " + tweet);
            }
        });
        f.notifyObservsers("The queen said her favorite book is Modern java in action");
    }
}
