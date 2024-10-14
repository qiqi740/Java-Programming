import java.util.Scanner;

public class Lab6Task2 {
    public static void main(String[] args) {
        int number1 = (int)(Math.random() * 10);
        int number2 = (int)(Math.random() * 10);
        Scanner input = new Scanner(System.in);

        System.out.print(
                "What is "+number1+"+"+ number2+"?");
                int answer = input.nextInt();
while (number1 + number2 != answer){
    System.out.println("it is wrong");
    answer = input.nextInt();
}
        System.out.println("you are right");
    }
}
