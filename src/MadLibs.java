/**
 * Exercise 1 — MadLibs
 *
 * Declare at least 6 variables of mixed types (int, double,
 * String, char, boolean), then concatenate them into a paragraph.
 *
 * Requirements:
 *   - At least one computed value printed inside parentheses,
 *     e.g. ... + (price * quantity) + ...
 *   - At least one char and one boolean in the output
 *   - The result should actually be funny. That's a requirement.
 */
public class MadLibs {
    public static void main(String[] args) {
    boolean isPointThreeGuard = false;
    char haircut = 'W' ;
    double guard = 0.3;
    int days = 100;
    String person = "Mr. Al";
    double realGuard = 1;

    System.out.println(person + " waits " + days + " days " + "between each haircut. " + person + " claims he uses " + guard + " guard, but is " +isPointThreeGuard + ". " + person + " actually uses a " + realGuard + " guard. Which gives him a " +haircut + " haircut.");
        
    }
}
