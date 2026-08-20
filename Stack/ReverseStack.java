// Reverse a String Using StackTo reverse a string using a stack in Java, you can follow these steps:
// 1. Create a stack to hold the characters of the string.
// 2. Push each character of the string onto the stack.
// 3. Pop the characters from the stack and append them to a new string.
// 4. Return the reversed string.
package Stack;
import java.util.Stack;

public class ReverseStack {
    public static void main(String[] args) {

        String str = "Hello";
        Stack<Character> stack = new Stack<>();

        // Push each character of the string onto the stack
        for (int i = 0; i < str.length(); i++) {
            stack.push(str.charAt(i));
        }

        // Pop the characters from the stack
        String reversedStr = "";

        while (!stack.empty()) {
            reversedStr += stack.pop();
        }

        System.out.println("Original string: " + str);
        System.out.println("Reversed string: " + reversedStr);
    }
}