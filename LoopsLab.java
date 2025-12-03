import java.util.Scanner;
import javax.xml.transform.Source;

public class LoopsLab {

    // ang scanner object kay static so pwede sha magamit across all methods
    // placed independent public static voids aron limpyo tan awn
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        boolean running = true;

        while (running) {
            System.out.println("\n--- Java Loops Laboratory Activities ---");
            System.out.println("1. Activity 1: Multiplication Table Generator (for loop)");
            System.out.println("2. Activity 2: Sum of Natural Numbers (while loop)");
            System.out.println("3. Activity 3: Factorial Calculator (do-while loop)");
            System.out.println("4. Activity 4: Even and Odd Numbers (for loop)");
            System.out.println("5. Activity 5: Reverse Digits of a Number (while loop)");
            System.out.println("0. Exit");
            System.out.print("Select an activity (0-5): ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    activity1();
                    break;
                case 2:
                    activity2();
                    break;
                case 3:
                    activity3();
                    break;
                case 4:
                    activity4();
                    break;
                case 5:
                    activity5();
                    break;
                case 0:
                    running = false;
                    System.out.println("Exiting program.");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
        scanner.close();
    }

    // Activity 1: Multiplication Table Generator (for loop)
    public static void activity1() {
        System.out.println("\n--- Activity 1: Multiplication Table ---");
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " x " + i + " = " + (num * i));
        }
    }

    // Activity 2: Sum of Natural Numbers (while loop)
    public static void activity2() {
        System.out.println("\n--- Activity 2: Sum of Natural Numbers ---");
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();
        int sum = 0;
        int i = 1;

        while (i <= n) {
            sum += i;
            i++;
        }

        System.out.println("Sum = " + sum);
    }

    // Activity 3: Factorial Calculator (do-while loop)
    public static void activity3() {
        System.out.println("\n--- Activity 3: Factorial Calculator ---");
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();
        long factorial = 1; // using long aron dili mag overflow ang large numbers
        int i = n;

        // case if ang iinput kay 0 
        if (n == 0) {
            System.out.println("Factorial = 1");
            return;
        }

        do {
            factorial *= i;
            i--;
        } while (i > 0);

        System.out.println("Factorial = " + factorial);
    }

    // Activity 4: Even and Odd Numbers (for loop)
    public static void activity4() {
        System.out.println("\n--- Activity 4: Even and Odd Numbers ---");
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();

        System.out.print("Even numbers: ");
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println(); // New line

        System.out.print("Odd numbers: ");
        for (int i = 1; i <= n; i++) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println(); // New line
    }

    // Activity 5: Reverse Digits of a Number (while loop)
    public static void activity5() {
        System.out.println("\n--- Activity 5: Reverse Digits ---");
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        int reversed = 0;

        while (number != 0) {
            int digit = number % 10;
            reversed = reversed * 10 + digit;
            number /= 10;
        }

        System.out.println("Reversed: " + reversed);
    }
}