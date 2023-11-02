package hexlet.code;

import java.util.Scanner;

import static java.util.concurrent.ThreadLocalRandom.current;

public class Engine {
    public static final int COUNTS_OF_ROUND = 13;
    private static final Scanner SCAN = new Scanner(System.in);

    public static int getRandomValue(int min, int max) {
        return current().nextInt(min, max + 1);
    }

    public static void gameEngine(Game game) {
        //greetings of all games
        System.out.print("Welcome to the Brain Games!\n" + "May I have your name? ");
        final String username = SCAN.next();
        System.out.printf("Hello, %s!\n", username);
        System.out.println(game.gameRules());

        //Engine of all games
        int i = 0;
        while (i < COUNTS_OF_ROUND) {
            String[] gameData = game.questionAndAnswers();

            System.out.println("Question: " + gameData[1]);
            System.out.print("Your answer: ");
            String answer = SCAN.next();
            if (answer.equals(gameData[0])) {
                System.out.println("Correct!");
            } else {
                System.out.printf("'%s' is wrong answer ;(. Correct answer was '%s'.\nLet's try again, %s! %n",
                        answer, gameData[0], username);
                return;
            }
            i++;
        }
        System.out.printf("Congratulations, %s! %n", username);
        SCAN.close();
    }

}
