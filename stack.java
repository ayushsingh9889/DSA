import java.util.Scanner;
import java.util.*;

public class stack {
    static int[] stack;
    static int top = -1;
    static int capacity;
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        initializeStack();
        displayMenu();
    }

    static void initializeStack() {
        System.out.print("Enter the maximum size of the stack: ");
        capacity = scanner.nextInt();
        stack = new int[capacity];
        System.out.println("Stack created with capacity: " + capacity);
    }

    static void displayMenu() {
        while (true) {
            System.out.println("\n===== MENU DRIVEN STACK PROGRAM =====");
            System.out.println("1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Peek");
            System.out.println("4. Display");
            System.out.println("5. Status");
            System.out.println("6. Stack Info");
            System.out.println("7. Multiple Push");
            System.out.println("8. Multiple Pop");
            System.out.println("9. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    pushOperation();
                    break;

                case 2:
                    popOperation();
                    break;

                case 3:
                    peekOperation();
                    break;

                case 4:
                    displayOperation();
                    break;

                case 5:
                    statusOperation();
                    break;

                case 6:
                    infoOperation();
                    break;

                case 7:
                    multiplePushOperation();
                    break;

                case 8:
                    multiplePopOperation();
                    break;

                case 9:
                    exitOperation();
                    break;

                default:
                    System.out.println("Invalid choice! Try again.");
            }
        }
    }

    static void pushOperation() {
        System.out.print("Enter element to push: ");
        int element = scanner.nextInt();

        if (top == capacity - 1) {
            System.out.println("Stack Overflow! Cannot push " + element);
        } else {
            stack[++top] = element;
            System.out.println(element + " pushed successfully");
        }
    }

    static void popOperation() {
        if (top == -1) {
            System.out.println("Stack Underflow! Cannot pop");
        } else {
            int popped = stack[top--];
            System.out.println(popped + " popped successfully");
        }
    }

    static void peekOperation() {
        if (top == -1) {
            System.out.println("Stack is empty");
        } else {
            System.out.println("Top element: " + stack[top]);
        }
    }

    static void displayOperation() {
        if (top == -1) {
            System.out.println("Stack is empty");
        } else {
            System.out.println("Stack Contents:");
            System.out.println("┌─────────────┐");
            for (int i = top; i >= 0; i--) {
                System.out.printf("│ %-11d │\n", stack[i]);
                if (i > 0) {
                    System.out.println("├─────────────┤");
                }
            }
            System.out.println("└─────────────┘");
            System.out.println("↑ Top");
        }
    }

    static void statusOperation() {
        System.out.println("\n=== STACK STATUS ===");
        System.out.println("Top pointer: " + top);
        System.out.println("Empty: " + (top == -1));
        System.out.println("Full: " + (top == capacity - 1));
        System.out.println("Available space: " + (capacity - top - 1));
    }

    static void infoOperation() {
        System.out.println("\n=== STACK INFORMATION ===");
        System.out.println("Capacity: " + capacity);
        System.out.println("Current size: " + (top + 1));
        System.out.println("Used space: " + (top + 1) + "/" + capacity);

        if (top == -1) {
            System.out.println("Stack is 0% full");
        } else {
            double percentage = ((top + 1.0) / capacity) * 100;
            System.out.printf("Stack is %.2f%% full\n", percentage);
        }
    }

    static void multiplePushOperation() {
        System.out.print("How many elements to push? ");
        int count = scanner.nextInt();

        if (top + count >= capacity) {
            System.out.println("Cannot push " + count + " elements. Only " + (capacity - top - 1) + " space available.");
            return;
        }

        for (int i = 1; i <= count; i++) {
            System.out.print("Enter element " + i + ": ");
            int element = scanner.nextInt();
            stack[++top] = element;
            System.out.println(element + " pushed");
        }

        System.out.println(count + " elements pushed successfully");
    }

    static void multiplePopOperation() {
        System.out.print("How many elements to pop? ");
        int count = scanner.nextInt();

        if (count > top + 1) {
            System.out.println("Cannot pop " + count + " elements. Only " + (top + 1) + " elements available.");
            return;
        }

        System.out.println("Popped elements:");
        for (int i = 0; i < count; i++) {
            System.out.println(stack[top--]);
        }

        System.out.println(count + " elements popped successfully");
    }

    static void exitOperation() {
        System.out.println("Thank you for using Stack Program!");
        System.out.println("Final stack status:");
        displayOperation();
        scanner.close();
        System.exit(0);
    }
}