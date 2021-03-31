package characters;

import Item.CharacterType;

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
}
