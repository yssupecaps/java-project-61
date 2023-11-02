package hexlet.code.games;

import hexlet.code.Game;

import java.math.BigInteger;

import static hexlet.code.Engine.getRandomValue;

public final class Prime implements Game {

    public static final int MIN_RAND_NUM = 0;
    public static final int MAX_RAND_NUM = 100;

    @Override
    public String gameRules() {
        return "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
    }


    @Override
    public String[] questionAndAnswers() {
        String[] gameData = new String[2];
        int randValue = getRandomValue(MIN_RAND_NUM, MAX_RAND_NUM);
        BigInteger bi = BigInteger.valueOf(randValue);
        String correctAnswer = bi.isProbablePrime(randValue) ? "yes" : "no";
        gameData[0] = correctAnswer;
        gameData[1] = String.valueOf(randValue);
        return gameData;
    }
}
