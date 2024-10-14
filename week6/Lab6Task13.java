import java.util.Scanner;

public class Lab6Task13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter first integer: ");
        int number1 = input.nextInt();
        System.out.print("Enter second integer: ");
        int number2 = input.nextInt();
        int gcd = GCD(number1, number2);

        System.out.println("The greatest common divisor for " + number1 + " and " + number2 + " is " + gcd);
    }

    public static int GCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}