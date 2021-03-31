package characters;

import Item.CharacterType;
import Item.HealType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class HealerTest {

    Healer healer;


    @Before
    public void setUp(){
        healer = new Healer("John", 50, CharacterType.HEALER);
    }

    @Test
    public void hasHealth(){
        assertEquals(50, healer.getHealthPoints());
    }

    @Test
    public void hasCharacter(){
        assertEquals(CharacterType.HEALER, healer.getCharacterType());
    }

    @Test
    public void canHeal(){
        assertEquals(10, healer.canHeal(HealType.HERB));
    }

}