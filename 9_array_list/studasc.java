import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class studasc {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        ArrayList<Student> stud = new ArrayList<>();
        for (int i = 1; i <= 20; i++) {
            String n = obj.next();
            int r = obj.nextInt();
            float cgpa = obj.nextFloat();
            stud.add(new Student(n, r, cgpa));
        }
        Collections.sort(stud, new AscSort());
        System.out.println(stud);
    }
}

class Student {
    String n;
    int r;
    float cgpa;

    Student(String n, int r, float cgpa) {
        this.n = n;
        this.r = r;
        this.cgpa = cgpa;
    }

    public String toString() {
        return "\nName: " + n + "\tRoll: " + r + "\tCGPA: " + cgpa;
    }
}

class AscSort implements Comparator<Student> {
    @Override
    public int compare(Student s1, Student s2) {
        return s1.n.compareTo(s2.n);
    }
}