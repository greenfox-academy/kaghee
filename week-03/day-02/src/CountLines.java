import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class CountLines {
    public static void main(String[] args) {
        // Write a function that takes a filename as string,
        // then returns the number of lines the file contains.
        // It should return zero if it can't open the file, and
        // should not raise any error.

        System.out.println(countLines("src/encoded-lines.txt"));
    }

    public static int countLines(String filename) {
        Path myPath = Paths.get(filename);
        try {
            List<String> lines = Files.readAllLines(myPath);
            int count = 0;
            for (String line: lines) {
                count++;
            }
            return count;
        } catch (IOException e) {
            return 0;
        }
    }
}
