package characters;

import Item.CharacterType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class OrcTest {

    Orc orc;


    @Before
    public void setUp(){
        orc = new Orc("Andrew", 150,  CharacterType.ORC);
    }

    @Test
    public void hasName(){
        assertEquals("Andrew", orc.getName());
    }
    @Test
    public void hasHealth(){
        assertEquals(150, orc.getHealthPoints());
    }

//    @Test
//    public void hasArmour(){
//        assertEquals(100, orc.getArmourPoints());
//    }

    @Test
    public void hasCharacter(){
        assertEquals(CharacterType.ORC, orc.getCharacterType());
    }

}