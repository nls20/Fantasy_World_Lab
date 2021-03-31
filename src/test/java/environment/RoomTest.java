package environment;

import Item.CharacterType;
import Item.HealType;import Item.SpellType;
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
    Room room;
    tressure.Treasure treasure;

    @Before
    public void setUp(){
        knight = new Knight("David", 100, CharacterType.KNIGHT);
        healer = new Healer("John", 50,  CharacterType.HEALER);
        witch = new Witch("Amy", 200,  CharacterType.WITCH);
        orc = new Orc("James", 150,  CharacterType.ORC);

        treasure = new tressure.Treasure("Gold");


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

    @Test
    public void canKillOrcLeve1(){
        room.knightCanAttackOrc(WeaponType.SWORD);
        room.knightCanAttackOrc(WeaponType.SWORD);
        room.witchCanAttackOrc(SpellType.FROST);
        room.witchCanAttackOrc(SpellType.LIGHTNING);
        assertEquals("Orc is dead move to next level", room.killOrc());
    }


    @Test
    public void canKillOrcLeve2(){
        room.knightCanAttackOrc(WeaponType.SWORD);
        room.knightCanAttackOrc(WeaponType.SWORD);
        room.witchCanAttackOrc(SpellType.FROST);
        assertEquals("keep fighting 20 left they are nearly dead", room.killOrc());
        room.orcCanAttackWitch(WeaponType.AXE);
        room.orcCanAttackWitch(WeaponType.AXE);
        room.orcCanAttackWitch(WeaponType.CLUB);
        assertEquals("Witch is hit 85 left be careful", room.killWitch());
        room.knightCanAttackOrc(WeaponType.SWORD);
        assertEquals("Orc is dead move to next level", room.killOrc());
    }



    @Test
    public void canKillOrcLeve3(){
        room.knightCanAttackOrc(WeaponType.SWORD);
        room.knightCanAttackOrc(WeaponType.SWORD);
        room.witchCanAttackOrc(SpellType.FROST);
        assertEquals("keep fighting 20 left they are nearly dead", room.killOrc());
        room.OrcCanAttackKnight(WeaponType.AXE);
        room.OrcCanAttackKnight(WeaponType.AXE);
        assertEquals("Knight is hit 20 left be careful", room.killKnight());
        healer.healKnight(HealType.MIND, knight);
        assertEquals(60, knight.getHealthPoints());
        room.witchCanAttackOrc(SpellType.FROST);
        assertEquals("Orc is dead move to next level", room.killOrc());
        assertEquals("Well done you win hear is your: Gold", room.canReceiveTreasure());
    }





}