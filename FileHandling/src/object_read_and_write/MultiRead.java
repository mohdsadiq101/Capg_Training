package object_read_and_write;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class MultiRead {
    public static void main(String[] args) {
        try(ObjectInputStream in =
                new ObjectInputStream(
                        new FileInputStream("data/studentObj.txt"))){

            while(true) {
                Student s = (Student) in.readObject();
                        System.out.println(s.id + " " + s.name);
                    }

                } catch (EOFException e){
            System.out.println("All Objects read successfully");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
