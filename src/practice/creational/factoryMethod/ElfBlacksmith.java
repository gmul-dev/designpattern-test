package practice.creational.factoryMethod;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class ElfBlacksmith implements Blacksmith{

    private static Map<WeaponType, ElfWeapon> ELFARSENAL;

    static {
        ELFARSENAL = new HashMap<>(WeaponType.values().length);
        Arrays.stream(WeaponType.values()).forEach(weaponType -> ELFARSENAL.put(weaponType, new ElfWeapon(weaponType)));
    }

    @Override
    public Weapon manufactureWeapon(WeaponType weaponType) {
        return ELFARSENAL.get(weaponType);
    }
}
