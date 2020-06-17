package practice.creational.singleton;

public class ThreadSafeLazyLoadedIvoryTower {

    // Thread-safe Singleton class.
    // The instance is lazily initialized and thus needs synchronization mechanism
    private static volatile ThreadSafeLazyLoadedIvoryTower instance;

    private ThreadSafeLazyLoadedIvoryTower() {
        if(instance == null) {
            instance = this;
        } else {
            throw new IllegalStateException("Already initialized.");
        }
    }

    //The instance doesn't get created until the method is called for the first time.
    public static synchronized ThreadSafeLazyLoadedIvoryTower getInstance() {
        if(instance == null) {
            synchronized (ThreadSafeLazyLoadedIvoryTower.class) {
                if(instance == null) {
                    instance = new ThreadSafeLazyLoadedIvoryTower();
                }
            }
        }
        return instance;
    }
}
