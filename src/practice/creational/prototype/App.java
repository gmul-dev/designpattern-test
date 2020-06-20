package practice.creational.prototype;

public class App {

    public static void main(String[] args) {
        var factory = new HeroFactoryImpl(
                new ElfMage("cooking"),
                new ElfWarlord("cleaning"),
                new ElfBeast("protecting")
        );
        var mage = factory.createMage();
        var warlord = factory.createWarlord();
        var beast = factory.createBeast();
        System.out.println(mage.toString());
        System.out.println(warlord.toString());
        System.out.println(beast.toString());

        factory = new HeroFactoryImpl(
                new OrcMage("axe"),
                new OrcWarlord("sword"),
                new OrcBeast("laser")
        );
        mage = factory.createMage();
        warlord = factory.createWarlord();
        beast = factory.createBeast();
        System.out.println(mage.toString());
        System.out.println(warlord.toString());
        System.out.println(beast.toString());
    }
}
