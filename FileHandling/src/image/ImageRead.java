package image;

import java.io.FileInputStream;
import java.io.IOException;

public class ImageRead {
    public static void main(String[] args) {
        String path = "output/copied.png";

        try{
            FileInputStream fis = new FileInputStream(path);

            int size = 0;

            while (fis.read() != -1) {
                size++;
            }
            fis.close();
            System.out.println("Image read successfully");
            System.out.println("Image size: " + size + "bytes");
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
