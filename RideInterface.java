/**
 * Student's name: Hao Chen
 * Student ID: 24516439
 * This interface defines the operations for managing the ride system.
 */
public interface RideInterface {
    /**
     * Adds a visitor to the queue for the ride.
     *
     * @param visitor the Visitor to be added to the queue
     */
    void addVisitorToQueue(Visitor visitor);

    /**
     * Removes a visitor from the queue for the ride.
     *
     * @param visitor the Visitor to be removed from the queue
     */
    void removeVisitorFromQueue(Visitor visitor);

    /**
     * Prints the list of visitors currently waiting in the queue for the ride.
     */
    void printQueue();

    /**
     * Runs one ride cycle for a set number of visitors.
     */
    void runOneCycle();

    /**
     * Adds a visitor to the ride history after they take the ride.
     *
     * @param visitor the Visitor to be added to the ride history
     */
    void addVisitorToHistory(Visitor visitor);

    /**
     * Checks if a specific visitor has already taken the ride.
     *
     * @param visitor the Visitor to check for in the ride history
     * @return true if the visitor is in the ride history, false otherwise
     */
    boolean checkVisitorFromHistory(Visitor visitor);

    /**
     * Returns the total number of visitors who have taken the ride.
     *
     * @return the number of visitors who have taken the ride
     */
    int numberOfVisitors();

    /**
     * Prints the ride history.
     */
    void printRideHistory();
}
