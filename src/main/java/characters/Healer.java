package characters;

import Item.CharacterType;
import Item.HealType;
import behaviours.IHeal;

public class Healer extends Player implements IHeal {
    public Healer(String name, int healthPoints, CharacterType characterType) {
        super(name, healthPoints, characterType);
    }

    public int heal(HealType healType) {
        return healType.getHealed();
    }
}
