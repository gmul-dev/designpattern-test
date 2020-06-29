package practice.structural.decorator;

public class App {
    public static void main(String[] args) {
        var troll = new SimpleTroll();
        troll.attack();
        troll.fleeBattle();
        System.out.println("Simple troll power " + troll.getAttackPower() + "\n");

        var clubbedTroll = new ClubbedTroll(troll);
        clubbedTroll.attack();
        clubbedTroll.fleeBattle();
        System.out.println("Clubbed troll power " + clubbedTroll.getAttackPower());
    }
}