import java.util.Scanner;

public class Lab6Task3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = (int)(Math.random()*101);
        System.out.println("enter a number");
        int guess = input.nextInt();
        while(guess != number){
         if(guess> number){
             System.out.println("too high");
             guess = input.nextInt();
         }
         if(guess< number){
             System.out.println("too low");
             guess = input.nextInt();
         }
            System.out.println("ok");
        }
    }
}
