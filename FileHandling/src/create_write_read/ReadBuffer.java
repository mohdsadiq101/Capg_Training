package create_write_read;

import java.io.BufferedReader;
import java.io.FileReader;

public class ReadBuffer {
    public static void main(String[] args) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader("data/student.txt"));

            String line;

            while((line = reader.readLine()) != null){
                System.out.println(line);
            }
        } catch (Exception e) {
//            System.out.println(e.getMessage());  // gives only the message if exception occurres
            e.printStackTrace(); // gives all the details where the exception exactly occurred
        }
    }
}
