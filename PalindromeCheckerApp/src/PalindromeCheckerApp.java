import java.util.Scanner;

public class PalindromeCheckerApp {
    /**
     * Main method - Entry point of the Java application.
     * This is invoked by the JVM at startup.
     *
     * UC1 Flow:
     * 1. Program starts
     * 2. JVM invokes the main() method
     * 3. Application name is displayed
     * 4. Application version is displayed
     * 5. Program continues to next use case or exits
     *
     * @param args Command line arguments (not used in UC1)
     */

    /**
     * Displays the welcome message with application name and version.
     * Key Concepts: Console Output using System.out.println()
     */
    public static void main() {
        System.out.println("====================================");
        System.out.println("Welcome to palindrome checker management system " );
        System.out.println("Version: 1.0");
        System.out.println("system initialized succesfully");
        System.out.println("====================================");

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Input : ");
        String input = sc.nextLine();

        PalindromeService service = new PalindromeService();

        // Start time
        long startTime = System.nanoTime();

        boolean result = service.checkPalindrome(input);

        // End time
        long endTime = System.nanoTime();

        long executionTime = endTime - startTime;

        System.out.println("Is Palindrome? : " + result);
        System.out.println("Execution Time : " + executionTime + " ns");

        sc.close();
    }
}

class PalindromeService {

    public boolean checkPalindrome(String input) {

        int start = 0;
        int end = input.length() - 1;

        while(start < end) {

            if(input.charAt(start) != input.charAt(end)) {
                return false;
            }

            start++;
            end--;
        }

        return true;
    }
}