package innovaStudyGroup.privateMethodInInterfaceDemo;

public class Circle implements Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }

    // Override default method
    @Override
    public double perimeter() {
        return 2 * Math.PI * radius;
    }

    public static void main(String[] args) {
        Circle circle = new Circle(5);

        // Using instance method
        System.out.println("Area: " + circle.area());

        // Using overridden default method
        System.out.println("Perimeter: " + circle.perimeter());

        // Using static method from interface
        System.out.println("Is radius positive? " + Shape.isPositive(circle.radius));
    }
}
