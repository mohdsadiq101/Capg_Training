package create_write_read;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriteDemo {
    public static void main(String[] args) {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("data/student.txt"));
            writer.write("\nName : Sadiq");
            writer.newLine();
            writer.write("Course : Spring");
            writer.newLine();
            writer.write("Marks : 90");

            writer.close();

            System.out.println("Data written using BufferedWriter");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
