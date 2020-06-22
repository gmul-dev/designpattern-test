package practice.creational.factoryMethod;

import java.util.logging.Logger;

public class App {

    private final Blacksmith blacksmith;

    public App(Blacksmith blacksmith) {
        this.blacksmith = blacksmith;
    }

    public static void main(String[] args) {
        // Lets go to war with Orc weapons
        var app = new App(new OrcBlacksmith());
        app.manufactureWeapons();

        // Lets go to war with Elf weapons
        app = new App(new ElfBlacksmith());
        app.manufactureWeapons();
    }

    private void manufactureWeapons() {
        var spear = blacksmith.manufactureWeapon(WeaponType.SPEAR);
        System.out.println(spear.toString());
        var axe = blacksmith.manufactureWeapon(WeaponType.AXE);
        System.out.println(axe.toString());
    }
}
