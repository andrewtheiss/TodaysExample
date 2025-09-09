import java.io.FileWriter;
import java.io.IOException;


public class FileWriter {
    public static void main(String[] args) throws IOException {
        System.out.println("Hello, World!");
        FileWriter fileWriter = new FileWriter("output.txt");
        fileWriter.write("I skipped school last week");

        fileWriter.close();
    }
}