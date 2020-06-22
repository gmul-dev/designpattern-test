package practice.structural.adapter;

public class Captain {
    /**
     * The Captain uses {@link RowingBoat} to sail. <br> This is the client in the pattern.
     */

    private RowingBoat rowingBoat;

    public Captain() {}

    public Captain(final RowingBoat boat) { // final parameter : it means that the value of this variable cannot be changed anywhere in the function
        this.rowingBoat = boat;
    }

    void setRowingBoat(final RowingBoat boat) {
        this.rowingBoat = boat;
    }

    void row() {
        rowingBoat.row();
    }
}
