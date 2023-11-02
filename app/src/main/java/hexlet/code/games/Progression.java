package hexlet.code.games;

import hexlet.code.Game;

import java.util.StringJoiner;

import static hexlet.code.Engine.getRandomValue;

public final class Progression implements Game {

    public static final int MIN_RAND_NUM = 0;
    public static final int MAX_RAND_NUM = 100;
    public static final int MAX_RAND_STEP = 24;
    public static final int PROGRESSION_LENGTH = 10;


    @Override
    public String[] questionAndAnswers() {
        String[] gameData = new String[2];
        StringJoiner progressQuest = new StringJoiner(" ");
        int randEl = getRandomValue(MIN_RAND_NUM, PROGRESSION_LENGTH - 1);
        int step = getRandomValue(MIN_RAND_NUM, MAX_RAND_STEP);
        int progressionEl = getRandomValue(MIN_RAND_NUM, MAX_RAND_NUM);
        int hidedEl = 0;

        for (int i = 0; i < PROGRESSION_LENGTH; i++) {
            progressionEl += step;
            if (randEl == i) {
                hidedEl = progressionEl;
                progressQuest.add("..");
            } else {
                progressQuest.add(String.valueOf(progressionEl));
            }
        }
        gameData[0] = String.valueOf(hidedEl);
        gameData[1] = String.valueOf(progressQuest);
        return gameData;
    }

    @Override
    public String gameRules() {
        return "What number is missing in the progression?";
    }
}
