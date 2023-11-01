package hexlet.code.games;

import hexlet.code.Game;

import static hexlet.code.Engine.getRandomValue;

public class Nod implements Game {

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

        int rand1 = getRandomValue(1, 100);
        int rand2 = getRandomValue(1, 100);

        gameData[0] = getNodResult(rand1, rand2);
        gameData[1] = rand1 + " " + rand2;
        return gameData;
    }

    @Override
    public String gameRules() {
        return "Find the greatest common divisor of given numbers.";
    }
}
