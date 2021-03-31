package environment;

import Item.CharacterType;
import Item.WeaponType;
import characters.*;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class RoomTest {

    Player player;
    Enemy enemy;

    Knight knight;
    Witch witch;
    Healer healer;

    Orc orc;

    Room room;

    @Before
    public void setUp(){
        knight = new Knight("David", 100, 50, CharacterType.KNIGHT);
        healer = new Healer("John", 50,  CharacterType.HEALER);
        witch = new Witch("Jenny", 200,  CharacterType.WITCH);
        orc = new Orc("Andrew", 150,  CharacterType.ORC);

        room = new Room("Dungeon", knight, witch, healer, orc);
    }

    @Test
    public void canAttackOrc(){
        room.attackOrc(WeaponType.SWORD);
        System.out.println(room.attackOrc(WeaponType.SWORD));
        room.attackOrc(WeaponType.SWORD);
        System.out.println(room.attackOrc(WeaponType.SWORD));
        assertEquals(0, room.attackOrc(WeaponType.SWORD));
    }

    @Test
    public void canKillOrc(){
        room.attackOrc(WeaponType.SWORD);
        room.attackOrc(WeaponType.SWORD);
        room.attackOrc(WeaponType.SWORD);
        assertEquals("Orc is dead", room.killOrc());
    }


}