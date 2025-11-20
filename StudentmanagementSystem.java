import java.io.*;
import java.util.*;

public class StudentManagementSystem {

    private static final String FILE_NAME = "students.txt";

    public static void addStudent(Student student) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_NAME, true))) {
            writer.write(student.toString());
            writer.newLine();
            System.out.println("Student added successfully!");
        } catch (IOException e) {
            System.out.println("Error writing to file.");
        }
    }

    public static void viewStudents() {
        try (BufferedReader reader = new BufferedReader(new FileReader(FILE_NAME))) {
            String line;
            System.out.println("\n--- Student Records ---");
            while ((line = reader.readLine()) != null) {
                System.out.println(line.replace(",", " | "));
            }
        } catch (IOException e) {
            System.out.println("No records found.");
        }
    }
}
