package practice.structural.adapter;

public class App {
    // client  adapter   adaptee
    //   <<      <]        ]]
    // captain   F.B.A  FishingBoat
    //RowingBoat

    // adapteeAdapter implements client
    // client의 메서드에 adaptee의 기능을 넣는다
    public static void main(String[] args) {
        var captain = new Captain(new FishingBoatAdapter());
        captain.row();
    }
}
