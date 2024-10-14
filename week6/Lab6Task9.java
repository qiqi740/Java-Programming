public class Lab6Task9 {
    public static void main(String[] args) {
        int sum = 0;
        int number = 0;

        while (number < 20) {
            number++;
            sum += number;

            if (sum >= 100) {
                break;
            }

            System.out.println("The number is " + number);
            System.out.println("The sum is " + sum);
        }

        // 打印最终的number和sum值
        System.out.println("The final number is " + number);
        System.out.println("The final sum is " + sum);
    }
}
