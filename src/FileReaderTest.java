import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.FileAttribute;
import java.util.Scanner;

public class FileReaderTest {
    public static void main(String[] args) throws IOException {

//        File file = new File("/Users/levitrejo/Desktop/FileTest/test.txt");
//        Scanner scan = new Scanner(file);
//
//        String newFileContent = "BRAND NEW FILE";
//        while (scan.hasNextLine()) {
////            System.out.println(scan.nextLine());
//            newFileContent = newFileContent.concat(scan.nextLine() + "\n");
//        }
//
//        FileWriter writer = new FileWriter("/Users/levitrejo/Desktop/FileTest/BrandNewFile.txt");
//        writer.write(newFileContent);
//        writer.close();
        String directory = "data";
        String filename = "newfile.txt";

        Path dataDirectory = Paths.get(directory);
        Path dataFile = Paths.get(directory, filename);

        if (Files.notExists(dataDirectory)){
            Files.createDirectory(dataDirectory);
        }

        if (! Files.exists(dataFile)) {
            Files.createFile(dataFile);
        }
    }
}
