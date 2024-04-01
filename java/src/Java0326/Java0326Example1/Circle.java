package Java0326.Java0326Example1;

public class Circle implements Shape {
    private double radius;  //반지름
    private final double PI = 3.14159265358979; //상수의 경우, 대문자 사용.

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return PI * (radius * radius);
    }

    @Override
    public double calculatePerimeter() {
        return 2 * radius * PI;
    }
}
