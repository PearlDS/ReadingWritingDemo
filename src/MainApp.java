import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class MainApp {
    public static void main(String[] args) {
        Path pathOfFile = Path.of("/Users/pearl/Documents/readingWriting/test.txt");
        Path pathOfDirectory = pathOfFile.getParent();


        System.out.println(Files.notExists(pathOfDirectory));
        System.out.println(Files.notExists(pathOfFile));



            try {
                if (Files.notExists(pathOfDirectory))
                    Files.createDirectory(pathOfDirectory);
                else System.out.println("Directory already exists");

                if (Files.notExists(pathOfFile))
                    Files.createFile(pathOfFile);
                else System.out.println("File already exists");

                System.out.println(Files.deleteIfExists(pathOfFile));



            } catch (IOException e) {
                e.printStackTrace();
            }







    }
}
