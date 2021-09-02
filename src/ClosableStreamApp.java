import java.io.*;

public class ClosableStreamApp {
    public static void main(String[] args) {





        try (FileWriter fileWriter = new FileWriter("/Users/pearl/Documents/readingWriting/test.txt");
             BufferedWriter bufferedWriter = new BufferedWriter(fileWriter)){
            bufferedWriter.write("Hello");
            bufferedWriter.write("World!");
        } catch (IOException e) {
            e.printStackTrace();
        }




        try(BufferedReader bufferedReader
                    = new BufferedReader(new FileReader("/Users/pearl/Documents/readingWriting/test.txt"))) {
            String line;
            while ((line=bufferedReader.readLine())!=null)
                System.out.println(line);

        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
