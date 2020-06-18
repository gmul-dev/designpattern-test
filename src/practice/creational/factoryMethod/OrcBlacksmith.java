package practice.creational.factoryMethod;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class OrcBlacksmith implements Blacksmith{
    private static Map<WeaponType, OrcWeapon> ORCARSENAL;

    static {
        ORCARSENAL = new HashMap<>(WeaponType.values().length);
        Arrays.stream(WeaponType.values()).forEach(weaponType -> ORCARSENAL.put(weaponType, new OrcWeapon(weaponType)));
    }
    @Override
    public Weapon manufactureWeapon(WeaponType weaponType) {
        return ORCARSENAL.get(weaponType);
    }
}
