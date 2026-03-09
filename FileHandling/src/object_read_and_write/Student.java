package object_read_and_write;

import java.io.Serializable;

public class Student implements Serializable {


    int id;
    String name;

    public Student(int id, String name){
        this.id = id;
        this.name = name;
    }
}
