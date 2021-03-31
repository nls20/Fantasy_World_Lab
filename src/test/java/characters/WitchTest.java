package characters;

import Item.CharacterType;
import Item.SpellType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class WitchTest {

    Witch witch;


    @Before
    public void setUp(){
        witch = new Witch("Jenny", 200,  CharacterType.WITCH);
    }

    @Test
    public void hasHealth(){
        assertEquals(200, witch.getHealthPoints());
    }

    @Test
    public void hasCharacter(){
        assertEquals(CharacterType.WITCH, witch.getCharacterType());
    }

    @Test
    public void canCastSpell(){
        assertEquals(10, witch.attack(SpellType.FIRE));
    }

}