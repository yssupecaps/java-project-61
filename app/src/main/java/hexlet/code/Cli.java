package hexlet.code;

import java.util.Scanner;

public class Cli {

    public static void greeting() {
        Scanner scan = new Scanner(System.in);

        System.out.print("May I have your name?");
        final String username = scan.next();
        final String greetings = String.format("Hello, %s!", username);
        System.out.println(greetings);

        scan.close();
    }
}
