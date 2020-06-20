package practice.creational.prototype;

public abstract class Warlord implements Prototype{

    public Warlord() {}

    public Warlord(Warlord source) {}

    @Override
    public abstract Warlord copy();

    @Override
    public boolean equals(Object obj) {
        if(this == obj) {
            return true;
        }
        if(obj == null) {
            return false;
        }
        return this.getClass() == obj.getClass();
    }
}
