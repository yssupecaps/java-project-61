package hexlet.code.games;

import hexlet.code.Game;

import static hexlet.code.Engine.getRandomValue;

public class GCD implements Game {

    public static final int MIN_RAND_NUM = 1;
    public static final int MAX_RAND_NUM = 100;

    private String getNodResult(int rand1, int rand2) {
        int a = rand1;
        int b = rand2;

        while (b != 0) {
            if (a > b) {
                a = a - b;
            } else {
                b = b - a;
            }
        }
        return String.valueOf(a);
    }

    @Override
    public String[] questionAndAnswers() {
        String[] gameData = new String[2];

        int randNum1 = getRandomValue(MIN_RAND_NUM, MAX_RAND_NUM);
        int randNum2 = getRandomValue(MIN_RAND_NUM, MAX_RAND_NUM);

        gameData[0] = getNodResult(randNum1, randNum2);
        gameData[1] = String.format("%s %s",randNum1, randNum2);
        return gameData;
    }

    @Override
    public String gameRules() {
        return "Find the greatest common divisor of given numbers.";
    }
}
