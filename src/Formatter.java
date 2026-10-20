/**
 * Exercise 2 — Formatter
 *
 * Print a formatted profile card using the variables below.
 *
 * Target shape:
 *
 *   ============================
 *      STUDENT PROFILE
 *   ============================
 *   Name:    Sarah Levy
 *   Age:     16
 *   GPA:     3.85
 *   Section: A
 *   ============================
 *   Turns 100 in: 2110
 *
 * Requirements:
 *   - Use \t for alignment
 *   - The "turns 100" year must be CALCULATED, not typed
 */
public class Formatter {
    public static void main(String[] args) {
        String firstName = "Sarah";
        String lastName = "Levy";
        int age = 16;
        double gpa = 3.85;
        char section = 'A';
        int currentYear = 2026;

        System.out.println("============================ \n Name: \t" + firstName + " " + lastName + "\n Age: \t" + age + "\n GPA: \t" + gpa + "\n Section: \t" + section + "\n ============================ \n Turns 100 in: " + (currentYear + (100 - age)));

    }
}
