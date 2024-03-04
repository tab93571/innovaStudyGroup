package innovaStudyGroup.privateMethodInInterfaceDemo;

public interface Shape {
    double area();

    // Default method
    default double perimeter() {
        // suppose this is some generic implementation
        return 0;
    }

    // Static utility method
    static boolean isPositive(double value) {
        return value > 0;
    }
}
