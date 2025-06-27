import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        String fileName = "notes.txt";

        // Writing notes to file
        try (FileWriter writer = new FileWriter(fileName)) {
            writer.write("These are my Java notes.\n");
            writer.write("Java supports file I/O using FileWriter and FileReader.\n");
            writer.write("BufferedReader makes reading easier and faster.\n");
            System.out.println("Notes written to file successfully.");
        } catch (IOException e) {
            System.out.println("An error occurred while writing the file: " + e.getMessage());
        }

        // Reading notes from file
        System.out.println("\nReading notes from file:");
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("An error occurred while reading the file: " + e.getMessage());
        }
    }
}