public class task21 {
    public static void main(String[] args) {
        // 表头
        System.out.printf("%-8s %-8s %-6s %-6s %-6s\n", "Degrees", "Radians", "Sine", "Cosine", "Tangent");

        // 计算并打印30度的数据
        System.out.printf("%-8d %-8.4f %-6.4f %-6.4f %-6.4f\n",
                30,
                Math.toRadians(30),
                Math.sin(Math.toRadians(30)),
                Math.cos(Math.toRadians(30)),
                Math.tan(Math.toRadians(30))
        );

        // 计算并打印60度的数据
        System.out.printf("%-8d %-8.4f %-6.4f %-6.4f %-6.4f\n",
                60,
                Math.toRadians(60),
                Math.sin(Math.toRadians(60)),
                Math.cos(Math.toRadians(60)),
                Math.tan(Math.toRadians(60))
        );
    }
}
