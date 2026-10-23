import java.util.Scanner;

/**
 * Exercise 7 — InteractiveTip
 *
 * Your tip calculator from Session 7, but the user supplies
 * the bill, the tip percentage, and the number of people.
 *
 * Output the tip, the total, and each person's share,
 * all to 2 decimal places.
 */
public class InteractiveTip {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the bill amount: ");
double bill = input.nextDouble();

System.out.print("Enter the tip percentage: ");
double tipPercent = input.nextDouble();

System.out.print("Enter the number of people: ");
int people = input.nextInt();

double tip = bill * tipPercent / 100;
double total = bill + tip;
double share = total / people;

System.out.printf("Tip: $%.2f%n", tip);
System.out.printf("Total: $%.2f%n", total);
System.out.printf("Each person's share: $%.2f%n", share);

        input.close();
    }
}
