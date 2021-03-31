package characters;

import Item.CharacterType;
import Item.WeaponType;
import behaviours.IAttack;
import behaviours.IHeal;
import behaviours.ISpell;

public abstract class Player {

    private String name;
    private int healthPoints;

    CharacterType characterType;


    public Player(String name, int healthPoints, CharacterType characterType){
        this.name = name;
        this.healthPoints = healthPoints;
        this.characterType = characterType;
    }


    public int getHealthPoints() {
        return healthPoints;
    }

    public String getName() {
        return name;
    }

    public CharacterType getCharacterType() {
        return characterType;
    }

    public void setHealthPoints(int healthPoints) {
        this.healthPoints = healthPoints;
    }
}

