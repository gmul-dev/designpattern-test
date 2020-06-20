package practice.creational.prototype;

public class ElfWarlord extends Warlord{
    private String helpType;

    public ElfWarlord(String helpType) {
        this.helpType = helpType;
    }

    public ElfWarlord(ElfWarlord elfWarlord) {
        super(elfWarlord);
        this.helpType = elfWarlord.helpType;
    }

    @Override
    public ElfWarlord copy() {
        return new ElfWarlord(this);
    }

    @Override
    public String toString() {
        return "Elven warlord helps in " + helpType;
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
        var other = (ElfWarlord) obj;
        if(helpType == null) {
            return other.helpType == null;
        }
        return helpType.equals(other.helpType);
    }
}
