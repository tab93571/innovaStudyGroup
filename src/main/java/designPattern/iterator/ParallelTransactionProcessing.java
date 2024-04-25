package designPattern.iterator;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

class Transaction {
    private int id;
    private double amount;
    private boolean isFraudulent;

    public Transaction(int id, double amount) {
        this.id = id;
        this.amount = amount;
        this.isFraudulent = false;
    }

    // Method to simulate fraud detection
    public void checkForFraud() {
        // Simulating a complex check
        isFraudulent = new Random().nextDouble() < 0.05; // 5% chance of being fraudulent
    }

    @Override
    public String toString() {
        return "Transaction{" +
                "id=" + id +
                ", amount=" + amount +
                ", isFraudulent=" + isFraudulent +
                '}';
    }
}

public class ParallelTransactionProcessing {
    public static void main(String[] args) {
        List<Transaction> transactions = Arrays.asList(
                new Transaction(1, 100.00),
                new Transaction(2, 1500.00),
                new Transaction(3, 230.00),
                new Transaction(4, 9800.00),
                new Transaction(5, 500.00)
        );

        transactions.parallelStream().forEach(Transaction::checkForFraud);

        transactions.forEach(System.out::println);
    }
}

