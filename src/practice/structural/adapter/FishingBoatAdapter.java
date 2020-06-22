package practice.structural.adapter;

public class FishingBoatAdapter implements RowingBoat{
    /**
     * Adapter class. Adapts the interface of the device ({@link FishingBoat}) into {@link RowingBoat}
     * interface expected by the client ({@link Captain}).
     */

    private FishingBoat boat;

    public FishingBoatAdapter() { boat = new FishingBoat(); }

    @Override
    public final void row() {
        boat.sail();
    }
}
