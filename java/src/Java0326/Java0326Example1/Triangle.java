package Java0326.Java0326Example1;

public class Triangle implements Shape{
    private double length;
    private double height;

    public Triangle () {

    }

    public Triangle(double length, double height) {
        this.length = length;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return 0.5 * length * height;
    }

    @Override
    public double calculatePerimeter() {
        return 3 * length;
    }
}
