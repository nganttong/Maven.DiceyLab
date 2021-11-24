import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class DiceTest {
    @Test
    public void tossAndSumTest() {
        //given
        Integer numberOfDice = 1;
        Dice dice = new Dice(numberOfDice);
        Integer actual = dice.rollAndSum();
        //when
        Integer expected = dice.getRolls()[0];
        //then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void dieRollTest() {
        //given
        Integer numberOfDice = 2;
        Dice dice = new Dice(numberOfDice);
        Integer lowestNumber = 0;
        Integer highestNumber = 6;
        //when
        Integer roll = dice.rollDie();
        //then
        Assert.assertFalse(roll < lowestNumber);
        Assert.assertFalse(roll > highestNumber);
    }
}