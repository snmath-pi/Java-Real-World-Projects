package student.management.system;

/*
This class is responsible for keeping
the track of students in a school management system
 */
public class Student {
    private int id;
    private String name;
    private int grade;
    private int feesPaid;
    private int feesTotal;

    /**
     * To create a new student object by initializing
     * Fees for every student => $30,000/ year
     * Fees paid initially is 0
     *
     * @param id
     * @param name
     * @param grade
     */
    public Student(int id, String name, int grade) {
        feesPaid = 0;
        feesTotal = 30000;
        this.id = id;
        this.name = name;
        this.grade = grade;
    }

    /**
     * we are not going to alter student's name
     * his id
     */

    /**
     * used to update student's grade
     *
     * @param grade is the new grade of the student
     */
    public void setGrade(int grade) {
        this.grade = grade;
    }



    /**
     * @return id of the student
     */
    public int getId() {
        return id;
    }

    /**
     * @return name of the student
     */
    public String getName() {
        return name;
    }

    /**
     * @return grade of the student
     */
    public int getGrade() {
        return grade;
    }

    /**
     * @return feesPaid by the student
     */
    public int getFeesPaid() {
        return feesPaid;
    }

    /**
     * @return total fees of the student
     */
    public int getFeesTotal() {
        return feesTotal;
    }

    /**
     *
     * @param fees amount paid by the student
     */
    public void payFees(int fees) {
        feesPaid += fees;
        School.updateTotalMoneyEarned(feesPaid);
    }

    /**
     *
     * @return remaining fees
     */
    public int getRemainingFees() {
        return feesTotal - feesPaid;
    }

    @Override
    public String toString() {
        return "Student's name: " + name + "\nfeesPaid: " +feesPaid;
    }
}
