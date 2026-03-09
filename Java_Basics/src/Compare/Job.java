package Compare;

import java.util.ArrayList;

public class Job implements Comparable<Job> {
    int priority;
    String title;
    double salary;
    public Job(int priority, String title, double salary) {
        this.priority = priority;
        this.title = title;
        this.salary = salary;
    }

    // compareTo defines natural sorting order
    @Override
//    public int compareTo(Job other) {
//        // compare based on job title
//        return this.title.compareTo(other.title);
//    }

    public int compareTo(Job other){
//        System.out.println(this);
//        System.out.printf("Comparing %-8s with %-8s");
        // this.priority - other.priority);
//        System.out.println(other);
//        System.out.println("Comparing "+"this"+ " vs " + other);
        return this.priority - this.priority;
    }

    // to print object clearly
    @Override
    public String toString() {
        return title + " | Priority: " + priority + " | Salary: " + salary;
    }

    class ComparableExample {
        public static void main(String[] args) {
            // Create ArrayList
            ArrayList<Job> jobs = new ArrayList<>();
            jobs.add(new Job(1, "Apple", 100));
            jobs.add(new Job(2, "Banana", 200));
            jobs.add(new Job(3, "Orange", 300));
        }
    }

}
