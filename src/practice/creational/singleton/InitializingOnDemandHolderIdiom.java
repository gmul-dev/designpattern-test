package practice.creational.singleton;

public class InitializingOnDemandHolderIdiom {
    private InitializingOnDemandHolderIdiom() {}

    public static InitializingOnDemandHolderIdiom getInstance() {
        return HelperHolder.INSTANCE;
    }

    // lazy-loaded Singleton instance
    private static class HelperHolder {
        private static final InitializingOnDemandHolderIdiom INSTANCE =
                new InitializingOnDemandHolderIdiom();
    }
}
