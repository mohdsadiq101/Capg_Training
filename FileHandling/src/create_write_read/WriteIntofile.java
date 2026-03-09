package create_write_read;

import java.io.FileWriter;
import java.io.IOException;

public class WriteIntofile {
    public static void main(String[] args) {
        try {
            doWrite();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void doWrite() throws IOException {
        FileWriter writer = new FileWriter("data/student.txt",true); // without 'true' it will erase and write the whole file

        writer.write("\nName : james");
        writer.write("\ncourse : Golang");
        writer.write("\nMarks : 85");

        writer.close();
    }
}
