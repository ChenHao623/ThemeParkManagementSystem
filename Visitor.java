import java.util.Objects;

/**
 *  Student's name: Hao Chen
 * Student ID: 24516439
 * This class extends the Person class to represent a visitor.
 *
 * @version 1.0
 */
public class Visitor extends Person {
    private int numberOfVisits;
    private String membershipStatus;

    /**
     * Default constructor that initializes a Visitor object with default values.
     */
    public Visitor() {
        super();
        this.numberOfVisits = 0;
        this.membershipStatus = "";
    }

    /**
     * Parameterized constructor that initializes a Visitor object with the specified
     * name, age, gender, number of visits, and membership status.
     *
     * @param name            the name of the visitor
     * @param age             the age of the visitor
     * @param gender          the gender of the visitor
     * @param numberOfVisits  the number of visits made by the visitor
     * @param membershipStatus the membership status of the visitor
     */
    public Visitor(String name, int age, String gender, int numberOfVisits, String membershipStatus) {
        super(name, age, gender);
        this.numberOfVisits = numberOfVisits;
        this.membershipStatus = membershipStatus;
    }

    /**
     * Retrieves the number of visits made by the visitor.
     *
     * @return the number of visits made by the visitor
     */
    public int getNumberOfVisits() {
        return numberOfVisits;
    }

    /**
     * Updates the number of visits made by the visitor.
     *
     * @param numberOfVisits the new number of visits made by the visitor
     */
    public void setNumberOfVisits(int numberOfVisits) {
        this.numberOfVisits = numberOfVisits;
    }

    /**
     * Retrieves the membership status of the visitor.
     *
     * @return the membership status of the visitor
     */
    public String getMembershipStatus() {
        return membershipStatus;
    }

    /**
     * Updates the membership status of the visitor.
     *
     * @param membershipStatus the new membership status of the visitor
     */
    public void setMembershipStatus(String membershipStatus) {
        this.membershipStatus = membershipStatus;
    }

    /**
     * Returns a string representation of the Visitor.
     *
     * @return a formatted string containing the visitor's details
     */
    @Override
    public String toString() {
        return super.toString() + String.format(", Visitor: %d, MembershipStatus: %s", numberOfVisits, membershipStatus);
    }

    /**
     * Compares this Visitor object to another object for equality.
     * Two visitors are considered equal if they have the same name and membership status.
     *
     * @param o the object to be compared
     * @return true if the visitors are equal, false otherwise
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Visitor visitor = (Visitor) o;
        return Objects.equals(this.getName(), visitor.getName()) &&
                Objects.equals(this.membershipStatus, visitor.membershipStatus);
    }

    /**
     * Returns the hash code of the Visitor based on their name and membership status.
     *
     * @return the hash code of the visitor
     */
    @Override
    public int hashCode() {
        return Objects.hash(this.getName(), this.membershipStatus);
    }
}
