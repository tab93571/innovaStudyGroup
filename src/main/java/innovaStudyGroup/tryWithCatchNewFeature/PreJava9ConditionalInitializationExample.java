package innovaStudyGroup.tryWithCatchNewFeature;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class PreJava9ConditionalInitializationExample {
    public static void main(String[] args) {
        BufferedReader reader = null;
        try {
            if (args.length > 0) {
                reader = new BufferedReader(new FileReader("file1.txt"));
            } else {
                reader = new BufferedReader(new FileReader("file2.txt"));
            }
            // Manual resource management required
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (reader != null) {
                try {
                    reader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

