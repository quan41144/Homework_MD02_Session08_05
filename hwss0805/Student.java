package hwss0805;

import java.util.Scanner;

public class Student {
    private int id;
    private String name;
    private double gpa;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getGpa() {
        return gpa;
    }

    private static int countStudent = 0;
    public Student() {
        countStudent++;
    }
    public Student(int id, String name, double gpa) {
        this();
        this.id = id;
        this.name = name;
        this.gpa = gpa;
    }
    public final double SCORE_FACTOR = 0.25;
    public void input(Scanner sc) {
        System.out.print("Enter Student ID: ");
        id = Integer.parseInt(sc.nextLine());
        System.out.print("Enter Student Name: ");
        name = sc.nextLine();
        System.out.print("Enter Student GPA: ");
        gpa = Double.parseDouble(sc.nextLine());
    }
    public void print() {
        System.out.println("Student ID: " + getId());
        System.out.println("Student Name: " + getName());
        System.out.println("Student GPA: " + getGpa());
    }
    public static int getCountStudent() {
        return countStudent;
    }
}
