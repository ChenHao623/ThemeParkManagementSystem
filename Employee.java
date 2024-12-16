/**
 *  Student's name: Hao Chen
 * Student ID: 24516439
 * This class extends the Person class to represent
 * an employee with additional attributes such as job title and department.
 */
public class Employee extends Person {
    /**
     * The job title of the employee.
     */
    private String jobTitle;

    /**
     * The department of the employee.
     */
    private String department;

    /**
     * Default constructor that initializes an Employee object with default values.
     */
    public Employee() {
        super();
        this.jobTitle = "";
        this.department = "";
    }

    /**
     * Parameterized constructor that initializes an Employee object with the specified
     * name, age, gender, job title, and department.
     *
     * @param name       the name of the employee
     * @param age        the age of the employee
     * @param gender     the gender of the employee
     * @param jobTitle   the job title of the employee
     * @param department the department of the employee
     */
    public Employee(String name, int age, String gender, String jobTitle, String department) {
        super(name, age, gender);
        this.jobTitle = jobTitle;
        this.department = department;
    }

    /**
     * Retrieves the job title of the employee.
     *
     * @return the job title of the employee
     */
    public String getJobTitle() {
        return jobTitle;
    }

    /**
     * Updates the job title of the employee.
     *
     * @param jobTitle the new job title of the employee
     */
    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    /**
     * Retrieves the department of the employee.
     *
     * @return the department of the employee
     */
    public String getDepartment() {
        return department;
    }

    /**
     * Updates the department of the employee.
     *
     * @param department the new department of the employee
     */
    public void setDepartment(String department) {
        this.department = department;
    }

    /**
     * Returns a string representation of the Employee.
     *
     * @return a formatted string containing the employee's details
     */
    @Override
    public String toString() {
        return super.toString() + String.format(", JobTitle: %s, Department: %s", jobTitle, department);
    }
}
