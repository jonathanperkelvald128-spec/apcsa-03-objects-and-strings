/**
 * Exercise 5 (Homework) — Receipt, version 2
 *
 * Rebuild your Session 4 receipt, but this time:
 *   - Every price is stored in a variable
 *   - Every quantity is stored in a variable
 *   - Line totals are CALCULATED (price * quantity)
 *   - The grand total is CALCULATED (sum of line totals)
 *   - Nothing numeric is typed directly into the output string
 *
 * ⚠️ Watch your parentheses. "Total: " + price * qty will
 *    NOT do what you want if you get it wrong.
 *
 * Challenge: add an 8.875% sales tax line, rounded to 2 decimals.
 */
public class Receipt2 {
    public static void main(String[] args) {
        double applesPrice = 1.25;
        int applesQuantity = 3;
        double breadPrice = 2.50;
        int breadQuantity = 1;
        double milkPrice = 3.75;
        int milkQuantity = 2;

        double applesTotal = applesPrice * applesQuantity;
        double breadTotal = breadPrice * breadQuantity;
        double milkTotal = milkPrice * milkQuantity;
        double subtotal = applesTotal + breadTotal + milkTotal;
        double tax = Math.round(subtotal * 0.08875 * 100) / 100.0;
        double grandTotal = subtotal + tax;

        System.out.println("      CORNER STORE");
        System.out.println("------------------------");
        System.out.printf("Apples  %d x $%.2f  $%.2f%n", applesQuantity, applesPrice, applesTotal);
        System.out.printf("Bread   %d x $%.2f  $%.2f%n", breadQuantity, breadPrice, breadTotal);
        System.out.printf("Milk    %d x $%.2f  $%.2f%n", milkQuantity, milkPrice, milkTotal);
        System.out.println("------------------------");
        System.out.printf("Subtotal:           $%.2f%n", subtotal);
        System.out.printf("Tax:                $%.2f%n", tax);
        System.out.printf("Total:              $%.2f%n", grandTotal);

    }
}
