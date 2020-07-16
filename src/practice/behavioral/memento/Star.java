package practice.behavioral.memento;

public class Star {

    private StarType type;
    private int ageYears;
    private int massTons;

    public Star(StarType starType, int startAge, int startMass) {
        this.type = starType;
        this.ageYears = startAge;
        this.massTons = startMass;
    }

    public void timePasses() {
        ageYears *= 2;
        massTons *= 8;
        switch (type) {
            case RED_GIANT:
                type = StarType.WHITE_DWARF;
                break;
            case SUN:
                type = StarType.RED_GIANT;
                break;
            case SUPERNOVA:
                type = StarType.DEAD;
                break;
            case WHITE_DWARF:
                type = StarType.SUPERNOVA;
                break;
            case DEAD:
                ageYears *= 2;
                massTons = 0;
                break;
            default:
                break;
        }
    }

    StarMemento getMemento() {
        StarMementoInternal state = new StarMementoInternal();
        state.setAgeYears(ageYears);
        state.setMassTons(massTons);
        state.setType(type);
        return state;
    }

    void setMemento(StarMemento memento) {
        StarMementoInternal state = (StarMementoInternal) memento;
        this.type = state.getType();
        this.ageYears = state.getAgeYears();
        this.massTons = state.getMassTons();
    }

    @Override
    public String toString() {
        return String.format("%s age: %d years mass: %d tons", type.toString(), ageYears, massTons);
    }

    private static class StarMementoInternal implements StarMemento {

        private StarType type;
        private int ageYears;
        private int massTons;

        public void setAgeYears(int ageYears) {
            this.ageYears = ageYears;
        }

        public int getAgeYears() {
            return ageYears;
        }

        public void setMassTons(int massTons) {
            this.massTons = massTons;
        }

        public int getMassTons() {
            return massTons;
        }

        public void setType(StarType type) {
            this.type = type;
        }

        public StarType getType() {
            return type;
        }
    }
}
