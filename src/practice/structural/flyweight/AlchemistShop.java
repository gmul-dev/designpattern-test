package practice.structural.flyweight;

import java.util.LinkedList;
import java.util.List;

public class AlchemistShop {
    private List<Potion> topShelf;
    private List<Potion> bottomShelf;

    public AlchemistShop() {
        var factory = new PotionFactory();
        topShelf = List.of(
            factory.createPotion(PotionType.INVISIBILITY),
            factory.createPotion(PotionType.INVISIBILITY),
            factory.createPotion(PotionType.STRENGTH),
            factory.createPotion(PotionType.HEALING),
            factory.createPotion(PotionType.INVISIBILITY),
            factory.createPotion(PotionType.STRENGTH),
            factory.createPotion(PotionType.HEALING),
            factory.createPotion(PotionType.HEALING)
        );
        bottomShelf = List.of(
            factory.createPotion(PotionType.POISON),
            factory.createPotion(PotionType.POISON),
            factory.createPotion(PotionType.POISON),
            factory.createPotion(PotionType.HOLY_WATER),
            factory.createPotion(PotionType.HOLY_WATER)
        );
    }

    public final List<Potion> getTopShelf() { return List.copyOf(this.topShelf); }

    public final List<Potion> getBottomShelf() { return List.copyOf(this.bottomShelf); }

    public void enumerate() {
        System.out.println("Enumerating top shelf potions\n");
        topShelf.forEach(Potion::drink);
        System.out.println("Enumerating bottom shelf potions\n");
        bottomShelf.forEach(Potion::drink);
    }
}
