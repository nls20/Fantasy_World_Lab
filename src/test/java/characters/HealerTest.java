package characters;

import Item.CharacterType;
import Item.HealType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class HealerTest {

    Healer healer;
    Knight knight;
    Witch witch;


    @Before
    public void setUp(){
        knight = new Knight("David", 100, CharacterType.KNIGHT);
        witch = new Witch("Jenny", 200, CharacterType.WITCH);
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

    @Test
    public void canHealKnight(){
        healer.healKnight(HealType.SOUL, knight);
        assertEquals(150, knight.getHealthPoints());
    }

    @Test
    public void canHealWitch(){
        healer.healWitch(HealType.HERB, witch);
        assertEquals(210, witch.getHealthPoints());
    }

}