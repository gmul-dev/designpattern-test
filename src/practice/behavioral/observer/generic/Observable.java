package practice.behavioral.observer.generic;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 * Generic observer inspired by Java Generics and Collection by {@literal Naftalin & Wadler}.
 *
 * @param <S> Subject
 * @param <O> Observer
 * @param <A> Argument type
 */
public class Observable<S extends Observable<S, O, A>, O extends Observer<S, O, A>, A> {
    protected List<O> observers;

    public Observable() {
        this.observers = new CopyOnWriteArrayList<>();
    }

    public void addObserver(O observer) {
        this.observers.add(observer);
    }

    public void removeObserver(O observer) {
        this.observers.remove(observer);
    }

    public void notifyObservers(A argument) {
        for(var observer : observers) {
            observer.update((S) this, argument);
        }
    }
}
