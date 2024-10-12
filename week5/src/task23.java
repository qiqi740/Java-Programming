import java.util.Scanner;
import java.lang.Math;

public class task23 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // 提示用户输入从中心到顶点的长度
        System.out.print("Enter the length from the center of a pentagon to a vertex: ");
        double r = input.nextDouble();

        // 计算边长s
        double s = 2 * r * Math.sin(Math.PI / 5);

        // 计算五边形的面积
        double area = (5 * s * s) / (4 * Math.tan(Math.PI / 5));

        // 输出结果，保留两位小数
        System.out.printf("The area of the pentagon is: %.2f%n", area);

        input.close();
    }
}
