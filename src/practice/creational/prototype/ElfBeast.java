package practice.creational.prototype;

public class ElfBeast extends Beast {

    private String helpType;

    public ElfBeast(String helpType) { this.helpType = helpType; }

    public ElfBeast(ElfBeast elfBeast) {
        super(elfBeast);
        this.helpType = elfBeast.helpType;
    }

    @Override
    public ElfBeast copy() {
        return new ElfBeast(this);
    }

    @Override
    public String toString() {
        return "Elven eagle helps in " + helpType;
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj) {
            return true;
        }
        if(!super.equals(obj)){
            return false;
        }
        if(getClass() != obj.getClass()) {
            return false;
        }
        var other = (ElfBeast) obj;
        if(helpType == null) {
            return other.helpType == null;
        }
        return helpType.equals(other.helpType);
    }
}
