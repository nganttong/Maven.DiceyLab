import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class DiceTest {

    @Test
    public void testToss2(){//given
        Integer expectedMin=2;
        Integer expectedMax=12;
        Dice dice = new Dice(expectedMin);
        //when
        Integer actual = dice.toss();
        //then
        Assert.assertTrue(actual>=expectedMin);
        Assert.assertTrue(actual<=expectedMax);
    }

    @Test
    public void testToss5(){
        //given
        Integer expectedMin=10;
        Integer expectedMax=60;
        Dice dice = new Dice(expectedMin);
        //when
        Integer actual = dice.toss();
        //then
        Assert.assertTrue(actual>=expectedMin);
        Assert.assertTrue(actual<=expectedMax);
    }
}