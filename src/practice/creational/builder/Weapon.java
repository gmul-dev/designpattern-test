package practice.creational.builder;

public enum Weapon {
    DAGGER, SWORD, AXE, WARHAMMER, BOW;

    @Override
    public String toString() { return name().toString(); }
}
