package characters;

import Item.CharacterType;
import Item.HealType;
import Item.WeaponType;
import behaviours.IHeal;

public class Healer extends Player implements IHeal {

    public Healer(String name, int healthPoints, CharacterType characterType) {
        super(name, healthPoints, characterType);

    }


    public int canHeal(HealType healType) {
        return healType.getHealed();
    }

    public void healKnight(HealType healType, Knight knight){
        knight.setHealthPoints(knight.getHealthPoints() + this.canHeal(healType));
    }
    public void healWitch(HealType healType, Witch witch){
        witch.setHealthPoints(witch.getHealthPoints() + this.canHeal(healType));
    }

}
