import java.util.*;

/**
 * MAIN CLASS
 */
public class PalindromeCheckerApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Input: ");
        String input = sc.nextLine();

        // Choose strategy (StackStrategy used here)
        PalindromeStrategy strategy = new StackStrategy();

        boolean result = strategy.check(input);

        System.out.println("Is Palindrome? : " + result);

        sc.close();
    }
}

/**
 * STRATEGY INTERFACE
 */
interface PalindromeStrategy {

    boolean check(String input);
}

/**
 * STACK STRATEGY IMPLEMENTATION
 */
class StackStrategy implements PalindromeStrategy {

    public boolean check(String input) {

        Stack<Character> stack = new Stack<>();

        // Push characters into stack
        for(char c : input.toCharArray()) {
            stack.push(c);
        }

        // Compare by popping
        for(char c : input.toCharArray()) {
            if(c != stack.pop()) {
                return false;
            }
        }

        return true;
    }
}

/**
 * DEQUE STRATEGY IMPLEMENTATION
 */
class DequeStrategy implements PalindromeStrategy {

    public boolean check(String input) {

        Deque<Character> deque = new ArrayDeque<>();

        for(char c : input.toCharArray()) {
            deque.addLast(c);
        }

        while(deque.size() > 1) {

            if(deque.removeFirst() != deque.removeLast()) {
                return false;
            }
        }

        return true;
    }
}