package practice.creational.prototype;

public abstract class Mage implements Prototype, Cloneable{

    public Mage() {}

    public Mage(Mage source) {}

    @Override
    public abstract Mage copy();

    @Override
    public Object clone() {
        Object clone = null;
        try {
            clone = super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return clone;
    }

    @Override
    public boolean equals (Object obj) {
        if(this == obj) {
            return true;
        }
        if(obj == null) {
            return false;
        }
        return this.getClass() == obj.getClass();
    }
}
