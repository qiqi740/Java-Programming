public class Alternative_2 {
    double radius;
    Alternative_2() {
        radius = 1;
    }
    Alternative_2(double newRadius) {
        radius = newRadius;
    }
    double getArea() {
        return radius * radius * Math.PI;
    }
    double getPerimeter() {
        return 2 * Math.PI * radius;
    }
    void setRadius(double newRadius) {
        radius = newRadius;
    }

    public static void main(String[] args) {
        Alternative_2 circle1 = new Alternative_2();
        System.out.println("The area of the circle of radius "+
                circle1.radius + " is "+ circle1.getArea());

        Alternative_2 circle2 = new Alternative_2(25);
        System.out.println("The area of the circle of radius "+
                circle2.radius + " is "+ circle2.getArea());

        Alternative_2 circle3 = new Alternative_2(125);
        System.out.println("The area of the circle of radius "+
                circle3.radius + " is "+ circle3.getArea());

        circle2.radius = 100;
        System.out.println("The area of the circle of radius "+
                circle2.radius + " is "+ circle2.getArea());
    }
}
