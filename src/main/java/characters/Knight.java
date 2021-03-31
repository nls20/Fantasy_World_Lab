package characters;

import Item.CharacterType;
import Item.WeaponType;
import behaviours.IAttack;


public class Knight extends Player implements IAttack{


    public Knight(String name, int healthPoints, CharacterType characterType) {
        super(name, healthPoints, characterType);

    }


    public WeaponType getWeaponType(WeaponType weaponType) {
        return weaponType;
    }

    public int attack(WeaponType weaponType) {
        return weaponType.getDamage();
    }

}
