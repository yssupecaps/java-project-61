package hexlet.code;

import hexlet.code.games.Calc;
import hexlet.code.games.Even;

import java.util.Scanner;

import static hexlet.code.Engine.gameEngine;

public class App {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the game number and press Enter.\n" +
                "1 - Greet\n" +
                "2 - Even\n" +
                "3 - Calc\n" +
                "0 - Exit");
        System.out.print("Your choice: ");

        int gameMode = scanner.nextInt();

        switch (gameMode) {
            case 0: {
                System.out.println("bye");
                break;
            }
            case 1: {
                Cli.greetings();
                break;
            }
            case 2: {
                gameEngine(new Even());
                break;
            }
            case 3: {
                gameEngine(new Calc());
                break;
            }
            default: {
                System.out.println("Incorrect number of game");
            }
        }

    }
}
