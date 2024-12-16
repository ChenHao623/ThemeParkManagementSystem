/**
 * Student's name: Hao Chen
 * Student ID: 24516439
 * This class is an abstract representation of a person with basic attributes.
 */
public abstract class Person {
    private String name;
    private int age;
    private String gender;

    /**
     * Default constructor that initializes a Person with default values:
     */
    public Person() {
        this("", 0, "");
    }

    /**
     * Parameterized constructor that initializes a Person with the specified
     * name, age, and gender.
     *
     * @param name   the name of the person
     * @param age    the age of the person
     * @param gender the gender of the person
     */
    public Person(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    /**
     * Retrieves the name of the person.
     *
     * @return the name of the person
     */
    public String getName() {
        return name;
    }

    /**
     * Updates the name of the person.
     *
     * @param name the new name of the person
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Retrieves the age of the person.
     *
     * @return the age of the person
     */
    public int getAge() {
        return age;
    }

    /**
     * Updates the age of the person.
     *
     * @param age the new age of the person
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * Retrieves the gender of the person.
     *
     * @return the gender of the person
     */
    public String getGender() {
        return gender;
    }

    /**
     * Updates the gender of the person.
     *
     * @param gender the new gender of the person
     */
    public void setGender(String gender) {
        this.gender = gender;
    }

    /**
     * Returns a string representation of the Person.
     *
     * @return a formatted string containing the person's details
     */
    @Override
    public String toString() {
        return String.format("Name: %s, Age: %d, Gender: %s", name, age, gender);
    }
}
