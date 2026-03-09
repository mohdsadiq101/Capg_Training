package Compare;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;

public class Job2 implements Comparable<Job2> {

    int priority;
    String title;
    double salary;

    public Job2(int priority, String title, double salary) {
        this.priority = priority;
        this.title = title;
        this.salary = salary;
    }

    // Natural sorting (by priority)
    @Override
    public int compareTo(Job2 other) {
        return this.priority - other.priority;
    }

    @Override
    public String toString() {
        return title + " | Priority: " + priority + " | Salary: " + salary;
    }

    // Comparator (by title)
    static class PriorityComparator implements Comparator<Job2> {
        @Override
        public int compare(Job2 j1, Job2 j2) {
            return j1.title.compareTo(j2.title);
        }
    }

    public static void main(String[] args) {

        LinkedList<Job2> jobs = new LinkedList<>();

        jobs.add(new Job2(2, "Developer", 60000));
        jobs.add(new Job2(1, "Manager", 100000));
        jobs.add(new Job2(3, "AIEngineer", 80000));

        System.out.println("Before sorting");
        for (Job2 job : jobs) {
            System.out.println(job);
        }

        // Sort using comparator (by title)
        Collections.sort(jobs, new PriorityComparator());

        System.out.println("\nAfter sorting by title");
        for (Job2 job : jobs) {
            System.out.println(job);
        }
    }
}