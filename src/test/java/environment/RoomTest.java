package environment;

import Item.CharacterType;
import Item.SpellType;
import Item.WeaponType;
import characters.*;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class RoomTest {

    Knight knight;
    Witch witch;
    Healer healer;


    Orc orc;

    WeaponType weaponType;
    Room room;

    @Before
    public void setUp(){
        knight = new Knight("David", 100, CharacterType.KNIGHT);
        healer = new Healer("John", 50,  CharacterType.HEALER);
        witch = new Witch("Amy", 200,  CharacterType.WITCH);
        orc = new Orc("James", 150,  CharacterType.ORC);

//        weaponType = new WeaponType(weaponType.getDamage());

        room = new Room("Dungeon", knight, witch, healer, orc);
    }

    @Test
    public void canAttackOrc(){
        room.knightCanAttackOrc(WeaponType.SWORD);
        room.knightCanAttackOrc(WeaponType.SWORD);
        assertEquals(50, orc.getHealthPoints());
    }


    @Test
    public void witchCanAttackOrc () {
        room.witchCanAttackOrc(SpellType.FIRE);
        room.witchCanAttackOrc(SpellType.FROST);
        assertEquals(110, orc.getHealthPoints());
    }

    @Test
    public void canKillOrc(){
        room.knightCanAttackOrc(WeaponType.SWORD);
        room.knightCanAttackOrc(WeaponType.SWORD);
        room.witchCanAttackOrc(SpellType.FROST);
        room.witchCanAttackOrc(SpellType.LIGHTNING);
        assertEquals("Orc is dead", room.killOrc());
    }

    @Test
    public void orcCanAttackWitch(){
        room.orcCanAttackWitch(WeaponType.CLUB);
        room.orcCanAttackWitch(WeaponType.AXE);
        assertEquals(125, witch.getHealthPoints());
    }

    @Test
    public void orcCanAttackKnight(){
        room.OrcCanAttackKnight(WeaponType.CLUB);
        room.OrcCanAttackKnight(WeaponType.AXE);
        assertEquals(25, knight.getHealthPoints());
    }




}