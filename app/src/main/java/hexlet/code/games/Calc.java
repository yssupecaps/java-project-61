package hexlet.code.games;

import hexlet.code.Game;

import static hexlet.code.Engine.getRandomValue;

public class Calc implements Game {

    public static final int MIN_RAND_NUM = 0;
    public static final int MAX_RAND_NUM = 12;


    private static char getOperator() {
        Character[] operators = {'+', '-', '*' };
        return operators[getRandomValue(MIN_RAND_NUM, operators.length - 1)];

    }

    @Override
    public String[] questionAndAnswers() {
        String[] gameData = new String[2];

        int value1 = getRandomValue(MIN_RAND_NUM, MAX_RAND_NUM);
        int value2 = getRandomValue(MIN_RAND_NUM, MAX_RAND_NUM);

        int result;
        char operator = getOperator();
        switch (operator) {
            case '+':
                result = value1 + value2;
                break;
            case '-':
                result = value1 - value2;
                break;
            case '*':
                result = value1 * value2;
                break;
            default:
                throw new RuntimeException("No such operator");
        }
        gameData[0] = String.valueOf(result);
        gameData[1] = String.format("%s %s %s", value1, operator, value2);

        return gameData;
    }

    @Override
    public String gameRules() {
        return "What is the result of the expression?";
    }
}
