package irgendwas;

import java.util.*;

public class Aufgabe {
    public static void main(String[] args) {
        final FileUtility fileUtility = new FileUtility();

        fileUtility.readFile("src/irgendwas/test.txt");

        List<String> strings = fileUtility.getFileContent();
        strings.forEach(System.out::println);

        fileUtility.sortFileContent();
        strings = fileUtility.getFileContent();
        strings.forEach(System.out::println);

    }
}
