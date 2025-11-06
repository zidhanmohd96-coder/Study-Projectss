
import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        String[] questions = {
            "1. What keyword used to inherit a class in Java?",
            "2. Which of the following is not a Java data type",
            "3. What is the default value of a boolean variable?",
            "4. Which method is used to start a thread in Java?",
            "5. Which operator is used to compare two values in Java?"
        };
        String[][] options = {
            {"a) extends", "b) implements", "c) inherits", "d) super"},
            {"a) int", "b) float", "c) char", "d) real"},
            {"a) true", "b) false", "c) 0", "d) null"},
            {"a) start()", "b) run()", "c) execute()", "d) begin()"},
            {"a) =", "b) !=", "c) ==", "d) <>"}
        };
        String[] answers = {"a", "d", "b", "a", "c"};
        int score = 0;

        Scanner sc = new Scanner(System.in);

        System.out.println("*************************");
        System.out.println("Welcome to the Java Quiz!");
        System.out.println("*************************");

        for (int i = 0; i < questions.length; i++) {
            System.out.println(questions[i]);
            for (String option : options[i]) {
                System.out.println(option);
            }

            System.out.println("Enter your answer (a/b/c/d): ");
            String userAnswer = sc.nextLine().toLowerCase();
            if (userAnswer.equals(answers[i])) {
                System.out.println("********");
                System.out.println("Correct!");
                System.out.println("********");
                score++;
            } else {
                System.out.println("********");
                System.out.println("Wrong! The correct answer is: " + answers[i]);
                System.out.println("********");
            }

        }

        System.out.println("Quiz Over! Your score is: " + score + "/" + questions.length);
        System.out.println("Thank you for playing!");

    }
}
