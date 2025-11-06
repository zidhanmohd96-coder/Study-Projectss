
import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String name;
        String place;
        String adjective;
        String animal;
        String object;
        String magicalPlace;
        String fantasyCharacter;

        System.out.println("Welcome to the Mad Libs game!");

        System.out.print("Enter a name: ");
        name = sc.nextLine();
        System.out.print("Enter a place: ");
        place = sc.nextLine();
        System.out.print("Enter an adjective: ");
        adjective = sc.nextLine();
        System.out.print("Enter an animal: ");
        animal = sc.nextLine();
        System.out.print("Enter an object: ");
        object = sc.nextLine();
        System.out.print("Enter a magical place: ");
        magicalPlace = sc.nextLine();
        System.out.print("Enter a fantasy character: ");
        fantasyCharacter = sc.nextLine();

        System.out.println("Here is your Mad Libs story: \n");
        System.out.println("One day, " + name + " decided to visit " + place + ". ");
        System.out.println("While walking through the streets, " + name + " saw a " + adjective + " " + animal + " holding a " + object + "! ");
        System.out.println("Surprised, " + name + " followed all the way to " + magicalPlace + ", where the " + animal + " revealed it was actually a " + fantasyCharacter + ". ");
        System.out.println("Frome that day on, " + name + " and the " + fantasyCharacter + " became best friends and went on many adventures together. ");
        System.out.println("The end.");
        System.out.println("Thank you for playing the Mad Libs game!");

    }
}
