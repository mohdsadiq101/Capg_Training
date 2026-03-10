package com.cg.ManyToMany;

import jakarta.persistence.*;

import java.util.Set;

@Entity
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int sid;
    private String name;
    @ManyToMany
//    @JoinTable(name = "student_course", joinColumns = @JoinColumn(name = "student_id"),
//    inverseJoinColumns = @JoinColumn(name = "course_id"))
    private Set<Course> courses;

    public Student(){}

    public Student(String name) {
        this.name = name;
//        this.courses = courses;
    }

    public int getSid() {
        return sid;
    }

    public void setSid(int sid) {
        this.sid = sid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Course> getCourses() {
        return courses;
    }

    public void setCourses(Set<Course> courses) {
        this.courses = courses;
    }
}
