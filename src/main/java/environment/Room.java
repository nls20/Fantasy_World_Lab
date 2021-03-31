package environment;

import Item.SpellType;
import Item.WeaponType;
import characters.*;
import com.sun.tools.corba.se.idl.constExpr.Or;

import java.util.SplittableRandom;

public class Room {

    private Knight knight;
    private Witch witch;
    private Healer healer;

    private Orc orc;

    private String name;

    public Room(String name, Knight knight, Witch witch, Healer healer, Orc orc){
        this.name = name;
        this.knight = knight;
        this.witch = witch;
        this.healer = healer;
        this.orc = orc;
    }

    public void knightCanAttackOrc(WeaponType weaponType){
      int org = this.orc.getHealthPoints();
      this.orc.setHealthPoints(org - this.knight.attack(weaponType));
    }

    public void witchCanAttackOrc(SpellType spellType){
        int org = this.orc.getHealthPoints();
        this.orc.setHealthPoints(org - this.witch.attack(spellType));
    }

    public String killOrc(){
        int orc = this.orc.getHealthPoints();
        if(orc == 0){
            return "Orc is dead";
        }else{
            return "Orc is not dead";
        }
    }

    public void OrcCanAttackKnight(WeaponType weaponType){
        int knight = this.knight.getHealthPoints();
        this.knight.setFullHealth(knight - this.orc.attack(weaponType));
    }

    public void orcCanAttackWitch(WeaponType weaponType){
        int witch = this.witch.getHealthPoints();
        this.witch.setHealthPoints(witch - this.orc.attack(weaponType));
    }

}
