package practice.creational.singleton;

public enum EnumIvoryTower {
    // enum 방식
    // 이 구현은 스레드 안전하지만, 이 밖에 추가되는 메서드들에 대한 스레드 안전성은 개발자가 구현해줘야..
    INSTANCE;

    @Override
    public String toString() {
        return getDeclaringClass().getCanonicalName() + "@" + hashCode();
    }
}
