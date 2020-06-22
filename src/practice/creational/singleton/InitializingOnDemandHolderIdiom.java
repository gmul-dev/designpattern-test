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

    /**
     * 가장 많이 사용하는 방식
     * singleton helper 클래스는 singleton클래스가 로드될 때도 로드되지 않다가
     * getInstance를 호출하면 그때서야 jvm에 로드, 인스턴스를 생성
     * synchronized 를 사용하지 않기 때문에 성능저하 해결
      */
}
