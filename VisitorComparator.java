import java.util.Comparator;

/**
 * Student's name: Hao Chen
 * Student ID: 24516439
 * This class implements the Comparator interface and provides a way to compare
 * two Visitor objects.
 */
public class VisitorComparator implements Comparator<Visitor> {
    /**
     * Compares two Visitor objects. The comparison is done first by membership status,
     * and if they have the same membership status, then by age.
     *
     * @param v1 the first Visitor to be compared
     * @param v2 the second Visitor to be compared
     * @return a negative integer, zero, or a positive integer as the first visitor is less than,
     *         equal to, or greater than the second visitor
     */
    @Override
    public int compare(Visitor v1, Visitor v2) {
        int membershipComparison = v1.getMembershipStatus().compareTo(v2.getMembershipStatus());
        if (membershipComparison != 0) {
            return membershipComparison;
        }

        return Integer.compare(v1.getAge(), v2.getAge());
    }
}
