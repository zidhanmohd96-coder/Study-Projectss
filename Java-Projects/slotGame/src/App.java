import java.util.Random;
import java.util.Scanner;

public class App {
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        int balance = 100;
        int bet;
        int payout;
        String[] row;

        System.out.println("**************************************");
        System.out.println("Welcome to the Java Slot Machine Game!");
        System.out.println("Symbols : [ &   *   %   $   #   @ ]");
        System.out.println("**************************************");

        while(balance>0){
            System.out.println("Your current balance: $"+balance);
            System.out.print("Enter your bet amount: ");
            bet = sc.nextInt();
            sc.nextLine(); // Consume the newline character
            if(bet > balance){
                System.out.println("You cannot bet more than your current balance...");
                continue;
            }else if(bet <= 0){
                System.out.println("Your bet must be  greater than 0...");
                continue;
            }else{
                balance -= bet;
            }

            System.out.println("Spinning the slot machine...");
            row = spinRow();
            printRow(row);
            payout = getPayout(row, bet);
            if(payout > 0 ){
                System.out.println("Congratulations! You won $"+ payout);
                balance += payout;
            }else{
                System.out.println("Sorry, you lost your bet of $"+ bet);
            }

            System.out.print("Do you want to play again? (Y/N): ");
            String playAgain = sc.nextLine().toUpperCase();
            if(!playAgain.equals("Y")){
                System.out.println("Thanks for playing! Your final balance is $"+ balance);
                break;
            }

        }

        sc.close();

    }

    static String[] spinRow(){
        String[] symbols = {"&", "*", "%", "$", "#", "@"};
        String[] row = new String[3];
        Random rand = new Random();

        for(int i=0; i<row.length; i++){
            row[i] = symbols[rand.nextInt(symbols.length)];
        }
        return row;
    }
    static void printRow(String[] row){
        System.out.println("-----------------");
        System.out.println(" "+ String.join(" | ", row) + " ");
        System.out.println("-----------------");
    }
    
    static int getPayout(String[] row, int bet){
        if(row[0].equals(row[1]) && row[1].equals(row[2])){
            return switch(row[0]){
                case "&"-> bet * 2;
                case "*"-> bet * 4;
                case "%"-> bet * 6;
                case "$"-> bet * 10;
                case "#"-> bet * 20;
                case "@"-> bet * 30;
                default-> 0;
            };
        }
        else if(row[0].equals(row[1])){
            return switch(row[0]){
                case "&"-> bet * 1;
                case "*"-> bet * 2;
                case "%"-> bet * 3;
                case "$"-> bet * 5;
                case "#"-> bet * 10;
                case "@"-> bet * 15;
                default-> 0;
            };
        }
        else if(row[1].equals(row[2])){
            return switch(row[1]){
                case "&"-> bet * 1;
                case "*"-> bet * 2;
                case "%"-> bet * 3;
                case "$"-> bet * 5;
                case "#"-> bet * 10;
                case "@"-> bet * 15;
                default-> 0;
            };
        }
        else if(row[0].equals(row[2])){
            return switch(row[0]){
                case "&"-> bet * 1;
                case "*"-> bet * 2;
                case "%"-> bet * 3;
                case "$"-> bet * 5;
                case "#"-> bet * 10;
                case "@"-> bet * 15;
                default-> 0;
            };
        }
        return 0;
    }

}
