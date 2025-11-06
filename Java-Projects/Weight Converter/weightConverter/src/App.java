import java.util.Scanner;

public class App {
    public static void main(String[] args){
        
        Scanner scan = new Scanner(System.in);

        System.out.println("Welcome to the Weight Converter!");
        System.out.println("This converter will convert from lbs to kg and vice versa.");

        int choice;
        do{

            System.out.println("Please select an option: \n1. lbs to kg\n2. kg to lbs\n3. Exit");
            choice = scan.nextInt();

            switch(choice){
                case 1:
                    System.out.println("Enter weight in lbs: ");
                    double lbsInput = scan.nextDouble();
                    double kgOutput = lbsInput * 0.45359237;
                    System.out.printf("%.2f lbs is equal to %.2f kg\n", lbsInput, kgOutput);
                    break;
                case 2:
                    System.out.println("Enter weight in kg: ");
                    double kgInput = scan.nextDouble();
                    double lbsOutput = kgInput / 0.45359237;
                    System.out.printf("%.2f kg is equal to %.2f lbs\n", kgInput, lbsOutput);
                    break;
                case 3:
                    System.out.println("Exiting the program.");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }

        }while(choice != 1|| choice != 2);

        scan.close();

    }
}
