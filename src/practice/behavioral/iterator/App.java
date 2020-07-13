package practice.behavioral.iterator;

import practice.behavioral.iterator.bst.BstIterator;
import practice.behavioral.iterator.bst.TreeNode;
import practice.behavioral.iterator.list.ItemType;
import practice.behavioral.iterator.list.TreasureChest;

public class App {

    private static final TreasureChest TREASURE_CHEST = new TreasureChest();

    private static void demonstrateTreasureChestIteratorForType(ItemType type) {
        System.out.println("---------------------");
        System.out.println("Item Iterator for ItemType " + type + ": ");
        var itemIterator = TREASURE_CHEST.iterator(type);
        while (itemIterator.hasNext()) {
            System.out.println(itemIterator.next().toString());
        }
    };


    private static void demonstrateBstIterator() {
        System.out.println("---------------------");
        System.out.println("BST Iterator: ");
        var root = buildIntegerBst();
        var bstIterator = new BstIterator<Integer>(root);
        while (bstIterator.hasNext()) {
            System.out.println("Next node: " + bstIterator.next().getVal());
        }
    }

    private static TreeNode<Integer> buildIntegerBst() {
        var root = new TreeNode<>(8);

        root.insert(3);
        root.insert(10);
        root.insert(1);
        root.insert(6);
        root.insert(14);
        root.insert(4);
        root.insert(7);
        root.insert(13);

        return root;
    }

    public static void main(String[] args) {
        demonstrateTreasureChestIteratorForType(ItemType.RING);
        demonstrateTreasureChestIteratorForType(ItemType.POTION);
        demonstrateTreasureChestIteratorForType(ItemType.WEAPON);
        demonstrateTreasureChestIteratorForType(ItemType.ANY);

        demonstrateBstIterator();
    }
}
