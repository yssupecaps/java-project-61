package hexlet.code.games;

import hexlet.code.Game;

import static hexlet.code.Engine.getRandomValue;

public final class Prime implements Game {

    public static final int MIN_RAND_NUM = 0;
    public static final int MAX_RAND_NUM = 20;

    @Override
    public String gameRules() {
        return "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
    }

    public static String isPrime(int random) {
        if (random <= 1) {
            return "no";
        }
        for (int i = 2; i < Math.sqrt(random); i++) {
            if (random % i == 0) {
                return "no";
            }
        }
        return "yes";
    }

    @Override
    public String[] questionAndAnswers() {
        String[] gameData = new String[2];
        int randValue = getRandomValue(MIN_RAND_NUM, MAX_RAND_NUM);
        String correctAnswer = isPrime(randValue);
        gameData[0] = correctAnswer;
        gameData[1] = String.valueOf(randValue);
        return gameData;
    }
}
