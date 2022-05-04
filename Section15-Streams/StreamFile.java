import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class StreamFile{
    public static void main(String[] args) {
        try {
            streamBands();
            
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }
    public static void streamBands() throws IOException{
        Stream<String> bands = Files.lines(Paths.get("band.txt"));

        bands
            .sorted()
            .forEach(band -> System.out.println(band));

        bands.close();
        // * we need to close this to prevent memory leaks
    }

}