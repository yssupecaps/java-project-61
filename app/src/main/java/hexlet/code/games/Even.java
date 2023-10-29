package hexlet.code.games;

import hexlet.code.Game;

import static java.util.concurrent.ThreadLocalRandom.current;

public class Even implements Game {



    @Override
    public String[] questionAndAnswers() {
        String[] gameData = new String[2];
        int randomNumber = current().nextInt(1, 100 + 1);
        gameData[0] = randomNumber % 2 == 0 ? "yes" : "no";
        gameData[1] = String.valueOf(randomNumber);

        return gameData;
    }

    @Override
    public String gameRules() {
        return "Answer 'yes' if the number is even, otherwise answer 'no'.";
    }
}
