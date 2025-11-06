
import java.util.Scanner;
import java.util.Random;

public class App {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        int numOfDie;
        int total = 0;

        System.out.print("Enter the number of die: ");
        numOfDie = sc.nextInt();

        if (numOfDie > 0) {
            for (int i = 0; i < numOfDie; i++) {
                int roll = rand.nextInt(1, 7);
                printDie(roll);
                ;
                System.out.println("You rolled: " + roll);
                total += roll;
            }
            System.out.println("Total = " + total);
        } else {
            System.out.println("Number must be greater than zero...");
        }

    }

    static void printDie(int die) {
        String die1 = """
                 -------
                |       |
                |   ●   |
                |       |
                 -------
                """;
        String die2 = """
                    -------
                   | ●     |
                   |       |
                   |     ● |
                    -------
                   """;
        String die3 = """
                 -------
                | ●     |
                |   ●   |
                |     ● |
                 -------
                """;
        String die4 = """
                 -------
                | ●   ● |
                |       |
                | ●   ● |
                 -------
                """;
        String die5 = """
                 -------
                | ●   ● |
                |   ●   |
                | ●   ● |
                 -------
                """;
        String die6 = """
                 -------
                | ●   ● |
                | ●   ● |
                | ●   ● |
                 -------
                """;

        switch (die) {
            case 1 ->
                System.out.println(die1);
            case 2 ->
                System.out.println(die2);
            case 3 ->
                System.out.println(die3);
            case 4 ->
                System.out.println(die4);
            case 5 ->
                System.out.println(die5);
            case 6 ->
                System.out.println(die6);
            default ->
                System.out.println("Invalid die number...");
        }
    }
}
