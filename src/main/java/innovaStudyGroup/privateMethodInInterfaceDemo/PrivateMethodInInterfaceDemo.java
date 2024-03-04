package innovaStudyGroup.privateMethodInInterfaceDemo;

public interface PrivateMethodInInterfaceDemo {

    // Default method 1
    default void defaultMethod1() {
        commonPrivateMethod();
        System.out.println("Default Method 1");
    }

    // Default method 2
    default void defaultMethod2() {
        commonPrivateMethod();
        System.out.println("Default Method 2");
    }

    // A private method that can be used by default methods
    private void commonPrivateMethod() {
        System.out.println("Performing a common operation");
    }
}

