package innovaStudyGroup.privateMethodInInterfaceDemo;

public interface Logger {

    // Static method using a private static method
    static void debug(String message) {
        log("DEBUG", message); // Use of private static method
    }

    // Another static method using the same private static method
    static void error(String message) {
        log("ERROR", message); // Use of private static method
    }

    // Private static method
    private static void log(String level, String message) {
        System.out.println(level + ": " + message);
    }
}
