package characters;

import Item.CharacterType;
import Item.WeaponType;
import behaviours.IAttack;

public class Orc extends Enemy implements IAttack {

    public Orc(String name, int healthPoints, CharacterType characterType) {
        super(name, healthPoints, characterType);
    }

    public int attack(WeaponType weaponType) {
        return weaponType.getDamage();
    }
}
