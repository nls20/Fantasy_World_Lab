package characters;

import Item.CharacterType;
import Item.WeaponType;
import behaviours.IAttack;


public class Knight extends Player implements IAttack{

//    private int armourPoints;

    public Knight(String name, int healthPoints, CharacterType characterType) {
        super(name, healthPoints, characterType);
//        this.armourPoints = armourPoints;

    }


//    public int takeDamage(int damage){
//        return this.addArmourToHealth() - damage;
//    }
//
//    public int addArmourToHealth(){
//        return this.armourPoints + this.getHealthPoints();
//    }
//
//    public int getArmourPoints() {
//        return armourPoints;
//    }

    public WeaponType getWeaponType(WeaponType weaponType) {
        return weaponType;
    }

    public int attack(WeaponType weaponType) {
        return weaponType.getDamage();
    }

}
