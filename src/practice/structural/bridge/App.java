package practice.structural.bridge;

public class App {

    public static void main(String[] args) {

        // Weapon : 기능부, Enchantment : 구현부
        // 기능과 구현을 분리해서 커플링 약화 -> 서로에 영향을 주지 않으며 변경 가능
        System.out.println("The knight receives an enchanted sword.");
        var enchantedSword = new Sword(new SoulEatingEnchantment());
        enchantedSword.wield();
        enchantedSword.swing();
        enchantedSword.unwield();

        System.out.println("The valkyrie receives an enchanted hammer.");
        var hammer = new Hammer(new FlyingEnchantment());
        hammer.wield();
        hammer.swing();
        hammer.unwield();
    }
}
