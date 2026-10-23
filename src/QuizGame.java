import java.util.Scanner;

/**
 * Exercise 8 — QuizGame
 *
 * Ask the user 3 questions, store their answers, then print
 * a summary of everything they said.
 *
 * NOTE: You cannot score it yet — that needs if statements,
 * which arrive in Unit 3. For now just collect and echo.
 *
 * Make the questions about something you care about.
 */
public class QuizGame {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

       System.out.print("What is your favorite game? ");
String answer1 = input.nextLine();

System.out.print("What is your favorite character? ");
String answer2 = input.nextLine();

System.out.print("What is your favorite level? ");
String answer3 = input.nextLine();

System.out.println();
System.out.println("Your answers:");
System.out.println("Favorite game: " + answer1);
System.out.println("Favorite character: " + answer2);
System.out.println("Favorite level: " + answer3);

        input.close();
    }
}
