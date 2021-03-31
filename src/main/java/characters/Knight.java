package characters;

import Item.CharacterType;
import Item.WeaponType;
import behaviours.IAttack;


public class Knight extends Player implements IAttack {

    private int armourPoints;
    private WeaponType weaponType;

    public Knight(String name, int healthPoints, int armourPoints, CharacterType characterType) {
        super(name, healthPoints, characterType);
        this.armourPoints = armourPoints;

    }


    public int getArmourPoints() {
        return armourPoints;
    }

    public WeaponType getWeaponType(WeaponType weaponType) {
        return weaponType;
    }

    public int attack(WeaponType weaponType) {
        return weaponType.getDamage();
    }

}
