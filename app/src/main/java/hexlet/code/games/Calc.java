package hexlet.code.games;

import hexlet.code.Game;

import static hexlet.code.Engine.getRandomValue;

public class Calc implements Game {

    private static char getOperator() {
        Character[] operators = {'+', '-', '*' };
        int randNum = operators.length;
        return operators[getRandomValue(0, randNum)];

    }

    @Override
    public String[] questionAndAnswers() {
        String[] gameData = new String[2];

        int value1 = getRandomValue(0, 12);
        int value2 = getRandomValue(0, 12);

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
        gameData[1] = value1 + " " + operator + " " + value2;

        return gameData;
    }

    @Override
    public String gameRules() {
        return "What is the result of the expression?";
    }
}
