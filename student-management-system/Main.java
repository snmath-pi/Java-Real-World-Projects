package student.management.system;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Teacher lizzy = new Teacher(1, "lizzy", 500);
        Teacher mellisa = new Teacher(2, "mellisa", 700);
        Teacher john = new Teacher(3, "john", 600);

        Student jake = new Student(1, "jake", 4);
        Student saksham = new Student(2, "student", 12);
        Student alisha = new Student(3, "alisha", 10);

        List<Teacher> teacherList = new ArrayList<>();
        teacherList.add(lizzy);
        teacherList.add(mellisa);
        teacherList.add(john);

        List<Student> studentList = new ArrayList<>();
        studentList.add(jake);
        studentList.add(saksham);
        studentList.add(alisha);
        School ghs = new School(teacherList, studentList);
        System.out.println(studentList);
        saksham.payFees(240);
        System.out.println("GHS has earned $" + ghs.getTotalMoneyEarned());
        lizzy.receiveSalary(lizzy.getSalary());

        System.out.println(School.getTotalMoneySpent());

        System.out.println(saksham);
        System.out.println(lizzy);


    }
}
