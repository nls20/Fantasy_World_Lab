package environment;

import Item.WeaponType;
import characters.*;
import com.sun.tools.corba.se.idl.constExpr.Or;

import java.util.SplittableRandom;

public class Room {

    private Player player;
    private Enemy enemy;

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

    public int attackOrc(WeaponType weaponType){
        int orc = this.orc.getHealthPoints();
        return orc -= this.knight.attack(weaponType);
    }

    public String killOrc(){
        int orc = this.orc.getHealthPoints();
        if(orc == 0){
            return "Orc is dead";
        }else{
            return "Orc is not dead";
        }
    }

//
//    public int getOrcHealthPoints() {
//        return this.orc.getHealthPoints();
//    }
}
