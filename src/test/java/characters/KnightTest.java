package characters;

import Item.CharacterType;
import Item.WeaponType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class KnightTest {

    Knight knight;


    @Before
    public void setUp(){
        knight = new Knight("David", 100, 50, CharacterType.KNIGHT);
    }

    @Test
    public void hasHealth(){
        assertEquals(100, knight.getHealthPoints());
    }
    @Test
    public void hasArmour(){
        assertEquals(50, knight.getArmourPoints());
    }
    @Test
    public void hasCharacter(){
        assertEquals(CharacterType.KNIGHT, knight.getCharacterType());
    }
    @Test
    public void hasWeaponType(){
        assertEquals(WeaponType.SWORD, knight.getWeaponType(WeaponType.SWORD));
    }

    @Test
    public void canGetFullHealth(){
        assertEquals(150, knight.setFullHealth());
    }

}