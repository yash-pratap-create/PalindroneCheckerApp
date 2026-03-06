import java.util.Scanner;

/**
 * MAIN CLASS - UseCase11PalindromeCheckerApp
 * Application entry point
 */
public class PalindromeCheckerApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Input: ");
        String input = sc.nextLine();

        // Create object of service class
        PalindromeService service = new PalindromeService();

        // Call method
        boolean result = service.checkPalindrome(input);

        System.out.println("Is Palindrome? : " + result);

        sc.close();
    }
}

/**
 * Service class that contains palindrome logic
 */
class PalindromeService {

    /**
     * Checks whether the input string is a palindrome
     */
    public boolean checkPalindrome(String input) {

        // Initialize pointers
        int start = 0;
        int end = input.length() - 1;

        // Compare characters moving inward
        while (start < end) {

            if (input.charAt(start) != input.charAt(end)) {
                return false;
            }

            start++;
            end--;
        }

        return true;
    }
}