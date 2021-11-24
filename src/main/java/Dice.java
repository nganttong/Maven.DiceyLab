import java.util.Random;

public class Dice {
    private Integer[] rolls;

    public Dice(Integer numberOfDice) {
        rolls = new Integer[numberOfDice];
    }

    public Integer[] getRolls() {
        return rolls;
    }

    public Integer rollAndSum() {
        Integer[] rolls = getRolls();
        Integer sum = 0;
        for (Integer i = 0; i < rolls.length; i++) {
            rolls[i] = rollDie();
            sum += rolls[i];
        }
        return sum;
    }

    public Integer rollDie() {
        Random random = new Random();
        return random.nextInt(6)+1;
    }
}
