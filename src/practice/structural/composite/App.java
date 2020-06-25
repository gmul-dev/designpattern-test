package practice.structural.composite;

public class App {

    public static void main(String[] args) {
        System.out.println("Message from the orcs: ");

        var orcMessage = new Messeger().messageFromOrcs();
        orcMessage.print();

        System.out.println("\nMessage from the elves: ");

        var elfMessage = new Messeger().messageFromElves();
        elfMessage.print();

    }
}
