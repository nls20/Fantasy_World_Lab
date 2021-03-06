package characters;

import Item.CharacterType;
import Item.WeaponType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class OrcTest {

    Orc orc;


    @Before
    public void setUp(){
        orc = new Orc("James", 150,  CharacterType.ORC);
    }

    @Test
    public void hasName(){
        assertEquals("James", orc.getName());
    }
    @Test
    public void hasHealth(){
        assertEquals(150, orc.getHealthPoints());
    }

    @Test
    public void canAttack(){
        assertEquals(35, orc.attack(WeaponType.CLUB));
    }

    @Test
    public void hasCharacter(){
        assertEquals(CharacterType.ORC, orc.getCharacterType());
    }

}