
import java.util.Random;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        int guess, tries = 0;
        int randNum = rand.nextInt(1, 101);

        System.out.println("Welcome to the Guessing Game!");
        System.out.println("I have selected a number between 1 and 100. Can you guess it?");

        do {

            System.out.print("Enter your guess: ");
            guess = sc.nextInt();
            tries++;

            if (guess < randNum) {
                System.out.println("Guessed number is low...");
            } else if (guess > randNum) {
                System.out.println("Guessed number is high...");
            } else {
                System.out.printf("Congratulations you guessed the number %d in %d tries. ", randNum, tries);
            }

        } while (guess != randNum);

    }
}
