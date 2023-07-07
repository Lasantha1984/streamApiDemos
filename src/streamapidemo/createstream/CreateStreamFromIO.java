
package streamapidemo.createstream;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;


public class CreateStreamFromIO {
    public static void main(String[] args) {
        Path filePath = Paths.get("textfiles\\example.txt");
        try (Stream<String> fileStream = Files.lines(filePath)) {
            fileStream.forEach(System.out::println);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
