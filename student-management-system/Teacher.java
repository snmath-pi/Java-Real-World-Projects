package student.management.system;

/**
 * This class is responsible for keeping the track of
 * teachers
 * id,
 * name,
 * salary
 */
public class Teacher {
    private int id;
    private String name;
    private int salary;

    private int totalSalaryEarned;

    /**
     * creates a new teacher object
     *
     * @param id     of the teacher
     * @param name   of the teacher
     * @param salary of the teacher
     */
    public Teacher(int id, String name, int salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    /**
     * @return the id.
     */
    public int getId() {
        return this.id;
    }

    /**
     * @return name of the teacher
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return salary of the teacher
     */
    public int getSalary() {
        return this.salary;
    }

    public void receiveSalary(int salary) {
        totalSalaryEarned += salary;
        School.updateTotalMoneySpent(salary);
    }

    @Override
    public String toString() {
        return "teachers name: " + name + ", total salary earned so far: $"+totalSalaryEarned;
    }
}
