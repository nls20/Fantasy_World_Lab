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

    private tressure.Treasure treasure;

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
    public void OrcCanAttackKnight(WeaponType weaponType){
        this.knight.setHealthPoints(this.knight.getHealthPoints() - this.orc.attack(weaponType));
    }

    public void orcCanAttackWitch(WeaponType weaponType){
        int witch = this.witch.getHealthPoints();
        this.witch.setHealthPoints(witch - this.orc.attack(weaponType));
    }


    public String killOrc(){
        int orc = this.orc.getHealthPoints();
        if(orc <= 0){
            return "Orc is dead move to next level";
        }else{
            return "keep fighting " + this.orc.getHealthPoints() + " left they are nearly dead";
        }
    }

     public String killWitch() {
        int witch = this.witch.getHealthPoints();
        if(witch <= 0 ){
            return "Witch is dead ";
        }else{
         return "Witch is hit " + this.witch.getHealthPoints() + " left be careful";
        }
    }

    public String killKnight(){
        int knight = this.knight.getHealthPoints();
        if(knight <= 0){
            return "Knight is dead";
        }else{
            return "Knight is hit " + this.knight.getHealthPoints() + " left be careful";
        }
    }


    public String canReceiveTreasure(){
        if(this.killOrc() == "Orc is dead move to next level"){
            return "Well done you win hear is your: Gold";
        }else{
            return "Don't give up keep going";
        }
    }


}
