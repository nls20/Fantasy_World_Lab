package characters;

import Item.CharacterType;
import Item.SpellType;
import behaviours.ISpell;

public class Witch extends Player implements ISpell {
    public Witch(String name, int healthPoints,  CharacterType characterType) {
        super(name, healthPoints, characterType);
    }

    public int attack(SpellType spellType) {
        return spellType.getDamage();
    }
}
