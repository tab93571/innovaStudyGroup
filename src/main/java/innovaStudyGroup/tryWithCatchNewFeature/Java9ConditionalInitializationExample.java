package innovaStudyGroup.tryWithCatchNewFeature;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Java9ConditionalInitializationExample {
    public static void main(String[] args) {
        // The declaration of 'reader' doesn't need to be inside the try-with-resources statement
        final BufferedReader reader;
        try
        {
            if (args.length > 0) {
                reader = new BufferedReader(new FileReader("file1.txt"));
            } else {
                reader = new BufferedReader(new FileReader("file2.txt"));
            }
            // 'reader' can be used here directly thanks to Java 9's improvement
            try (reader)
            {
                String line;
                while ((line = reader.readLine()) != null) {
                    System.out.println(line);
                }
            }
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }
}
