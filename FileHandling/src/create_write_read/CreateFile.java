package create_write_read;

import java.io.File;
import java.io.IOException;

public class CreateFile {
    public static void main(String[] args) throws IOException {
        File file = new File("data/student.txt");
        file.createNewFile();
    }
}
