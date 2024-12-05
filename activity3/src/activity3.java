import java.util.Scanner;

public class activity3 {

    public static void main(String[] args) {

        int first, second;

        Scanner input = new Scanner(System.in);

        do {
            System.out.print("enter first number:");
            first = input.nextInt();
            System.out.print("enter second number:");
            second = input.nextInt();

            if (first >= second) {
                System.out.println("error");
            }

        } while (first >= second);

        System.out.println("Odd number between " + first + " and " + second + " number:-");

        int test_number = first;
        while (test_number <= second) {
            if (test_number % 2 != 0) {
                System.out.print(" " + test_number);
            }
            test_number++;
        }

        System.out.println("\nEven number between " + first + " and " + second + " number:-");

        test_number = first;
        while (test_number <= second) {
            if (test_number % 2 == 0) {
                System.out.print(" " + test_number);
            }
            test_number++;
        }
        input.close();
    }
}
