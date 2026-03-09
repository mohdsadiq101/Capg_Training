package create_write_read;

import java.io.File;

public class CreateDirec {
    public static void main(String[] args) {
        File file= new File("data");
        file.mkdir();
    }
}
