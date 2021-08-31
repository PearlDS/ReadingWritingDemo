import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class StreamApp {
    public static void main(String[] args) {
        Path pathOfFile = Path.of("/Users/pearl/Documents/readingWriting/test.txt");
        if (Files.notExists(pathOfFile)) {
            try {
                Files.createFile(pathOfFile);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }


        FileWriter fileWriter = null;
        try {
           fileWriter = new FileWriter("/Users/pearl/Documents/readingWriting/test.txt");
            fileWriter.write("Hello");
            fileWriter.write(" World");

        } catch (IOException e) {
            e.printStackTrace();
        }
        finally {
            try {
                fileWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }


        FileReader fileReader = null;
        try {
            fileReader = new FileReader("/Users/pearl/Documents/readingWriting/test.txt");



            int currentByte;
            while ((currentByte =fileReader.read())!=-1)
                System.out.print((char)currentByte);


        } catch (IOException e) {
            e.printStackTrace();
        }
        finally {
            try {
                fileReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }




    }
}
