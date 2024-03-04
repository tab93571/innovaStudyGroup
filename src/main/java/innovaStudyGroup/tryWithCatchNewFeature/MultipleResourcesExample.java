package innovaStudyGroup.tryWithCatchNewFeature;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.IOException;

public class MultipleResourcesExample {
    public static void main(String[] args) {
        BufferedReader reader;
        BufferedWriter writer;
        try {
            reader = new BufferedReader(new FileReader("file1.txt"));
            writer = new BufferedWriter(new FileWriter("file2.txt"));

            // Managing both resources together
            try (reader; writer) {
                String line;
                while ((line = reader.readLine()) != null) {
                    writer.write(line);
                    writer.newLine();
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
