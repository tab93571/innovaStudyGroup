package innovaStudyGroup.tryWithCatchNewFeature;

public class EffectiveFinalExample {
    public static void main(String[] args) {
        int num = 10; // Not explicitly declared as final

        // A thread or a lambda can access 'num' because it's effectively final
        Runnable r = () -> System.out.println("Number is " + num);


       // as it would change 'num' after the lambda expression, making it not effectively final.
//        num = 20;

        new Thread(r).start();
    }
}
