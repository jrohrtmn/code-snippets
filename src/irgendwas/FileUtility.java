package irgendwas;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * This class is used to read and write files. You can also sort them :)
 */
public class FileUtility {
    private List<String> fileContent;

    public FileUtility() {
    }

    public void readFile(String filePath) {
        final Path path = Paths.get(filePath);
        try (final Stream<String> lines = Files.lines(path)) {
            this.fileContent = lines.collect(Collectors.toList());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void sortFileContent() {
        fileContent.sort(Comparator.naturalOrder());
    }

    public List<String> getFileContent() {
        return this.fileContent;
    }
}
