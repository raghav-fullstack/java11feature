import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

import static java.nio.file.Files.readString;
import static java.nio.file.Files.setLastModifiedTime;

public class FilesUpdates {

    public static void main(String[] args) throws IOException {
        Path test = Files.writeString(Files.createTempFile("Test", ".txt"), "this is java 11 feature");

        System.out.println(test);

        String str = readString(test);

        System.out.println(str);
    }
}
