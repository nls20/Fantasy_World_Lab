package tressure;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TreasureTest {

    Treasure treasure;

    @Before
    public void setUp(){
        treasure = new Treasure("Gold");
    }

    @Test
    public void hasTreasure(){
        assertEquals("Gold", treasure.getTreasure());
    }

}