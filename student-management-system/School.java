package student.management.system;

import java.util.ArrayList;
import java.util.List;

/**
 * many teachers, many students
 * implements teachers and students
 * using an arraylist
 */
public class School {
    private List<Teacher> teachers;
    private List<Student> students;
    private static int totalMoneyEarned;
    private static int totalMoneySpent;

    public School(List<Teacher> teachers, List<Student> students) {
        this.teachers = teachers;
        this.students = students;
        totalMoneyEarned = 0;
        totalMoneySpent = 0;
    }

    /**
     * @return total money earned by school
     */
    public static int getTotalMoneyEarned() {
        return totalMoneyEarned;
    }

    /**
     * @return total money spent by school
     */
    public static int getTotalMoneySpent() {
        return totalMoneySpent;
    }

    /**
     * @return returns the list of student in school
     */
    public List<Student> getStudents() {
        return students;
    }

    /**
     * @return the list of teachers in school
     */
    public List<Teacher> getTeachers() {
        return teachers;
    }

    /**
     * @param student is added to school
     */
    public void addStudent(Student student) {
        students.add(student);
    }

    /**
     * @param teacher to be added
     */
    public void setTeachers(Teacher teacher) {
        teachers.add(teacher);
    }


    public static void updateTotalMoneyEarned(int moneyEarned) {
        totalMoneyEarned += moneyEarned;
    }

    /**
     * @param totalMoneySpent by the school
     *                        given as salary to teacher
     */
    public static void updateTotalMoneySpent(int moneySpent) {
        totalMoneySpent += moneySpent;
        totalMoneyEarned -= moneySpent;
    }

}
