package hexlet.code.games;

import hexlet.code.Game;

import static java.util.concurrent.ThreadLocalRandom.current;

public final class Even implements Game {

public static final int MIN_RAND_NUM = 1;
public static final int MAX_RAND_NUM = 101;

    @Override
    public String[] questionAndAnswers() {
        String[] gameData = new String[2];
        int randomNumber = current().nextInt(MIN_RAND_NUM, MAX_RAND_NUM);
        gameData[0] = randomNumber % 2 == 0 ? "yes" : "no";
        gameData[1] = String.valueOf(randomNumber);

        return gameData;
    }

    @Override
    public String gameRules() {
        return "Answer 'yes' if the number is even, otherwise answer 'no'.";
    }
}
