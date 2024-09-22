import java.util.Scanner;

public class hjl1 {
    public static void main(String[] args) {
        int minute=0;
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the number of minutes:");
        minute=input.nextInt();
        int year=minute/60/24/365;
        int day=(minute/60/24)%365;
        System.out.println(minute+"minute is approximately"+year+"years and"+day+"days");
    }
    
}
