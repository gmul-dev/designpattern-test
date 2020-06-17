package practice.creational.singleton;

public class IvoryTower {
    // default
    private IvoryTower() {}

    private static final IvoryTower INSTANCE = new IvoryTower();

    public static IvoryTower getInstance() {
        return INSTANCE;
    }
}
