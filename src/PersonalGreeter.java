import java.time.LocalDate;
import java.util.Scanner;

/**
 * Exercise 6 — PersonalGreeter
 *
 * Ask the user for their name, age, and favorite subject.
 * Respond with a paragraph that uses all three, plus the year
 * they will turn 100.
 *
 * ⚠️ Remember the trap: if you read an int and THEN a line,
 *    you need a bare input.nextLine() in between.
 */
public class PersonalGreeter {
    public static void main(String[]         

    import java.time.LocalDate;
import java.util.Scanner;

public class PersonalGreeter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("What is your name? ");
        String name = input.nextLine();

        System.out.print("How old are you? ");
        int age = input.nextInt();
        input.nextLine();

        System.out.print("What is your favorite subject? ");
        String subject = input.nextLine();

        int currentYear = LocalDate.now().getYear();
        int yearTurn100 = currentYear + (100 - age);

        System.out.println();
        System.out.println("Hello, " + name + ". You are " + age + " years old and your favorite subject is " + subject + ". You will t