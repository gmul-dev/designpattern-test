package practice.creational.prototype;

public class ElfMage extends Mage{

    private String helpType;

    public ElfMage(String helpType) {
        this.helpType = helpType;
    }

    public ElfMage(ElfMage elfMage) {
        super(elfMage);
        this.helpType = elfMage.helpType;
    }

    @Override
    public ElfMage copy() {
        return new ElfMage(this);
    }

    @Override
    public Mage clone() {
        return this.clone();
    }

    @Override
    public String toString() {
        return "Elven mage helps in " + helpType;
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj) {
            return true;
        }
        if(!super.equals(obj)) {
            return false;
        }
        if(getClass() != obj.getClass()) {
            return false;
        }
        var other = (ElfMage) obj;
        if(helpType == null) {
            return other.helpType == null;
        }
        return helpType.equals(other.helpType);
    }
}
