import java.util.Scanner;

public class FibonacciGenerator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of terms (1-93): ");

        if (!sc.hasNextInt()) {
            System.out.println("Invalid input. Please enter an integer.");
            sc.close();
            return;
        }

        int terms = sc.nextInt();

        if (terms < 1 || terms > 93) {
            System.out.println("Please enter a number between 1 and 93.");
            sc.close();
            return;
        }

        long first = 0;
        long second = 1;
        System.out.println("Fibonacci Sequence:");

        for (int i = 1; i <= terms; i++) {
            System.out.print(first);
            if (i < terms) {
                System.out.print(" ");
            }
            long next = first + second;
            first = second;
            second = next;
        }

        System.out.println();
        sc.close();
    }
}
