package practice.creational.builder;

public enum Profession {
    WARRIOR, THIEF, MAGE, PRIEST;

    @Override
    public String toString() { return name().toString(); }
}
