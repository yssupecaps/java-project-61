package hexlet.code;

import hexlet.code.games.Calc;
import hexlet.code.games.Even;
import hexlet.code.games.Nod;

import java.util.Scanner;

import static hexlet.code.Engine.gameEngine;

public class App {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the game number and press Enter.");
        System.out.println("\n1 - Greet\n2 - Even\n3 - Calc\n4 - Nod\n0 - Exit");
        System.out.print("Your choice: ");

        int gameMode = scanner.nextInt();

        switch (gameMode) {
            case 0:
                scanner.close();
            case 1:
                Cli.greetings();
                break;
            case 2:
                gameEngine(new Even());
                break;
            case 3:
                gameEngine(new Calc());
                break;
            case 4:
                gameEngine(new Nod());
                break;
            default:
                System.out.println("Incorrect number of game");
        }

    }
}
