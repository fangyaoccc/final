import java.io.*;
import java.nio.file.*;

public class FileHandler {
    public static void main(String[] args) {
        Path path = Paths.get(""C:\\Users\\Chang\\Desktop\\myFile.txt""); 
        try {
            String content = Files.readString(path);
            System.out.println("Content of the file: " + content);
        } catch (IOException e) {
            System.out.println("Error reading the file: " + e.getMessage());
        }
        try (FileWriter fw = new FileWriter(path.toString(), true);
             BufferedWriter bw = new BufferedWriter(fw);
             PrintWriter out = new PrintWriter(bw)) {
            out.println("A new string"); 
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
