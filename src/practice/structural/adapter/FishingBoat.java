package practice.structural.adapter;

final class FishingBoat {
    /**
     * Device class (adaptee in the pattern). We want to reuse this class. Fishing boat moves by
     * sailing.
     */

    void sail() { System.out.println("The fishing boat is sailing"); }
}
