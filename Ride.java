import java.io.*;
import java.util.*;

/**
 * Student's name: Hao Chen
 * Student ID: 24516439
 * The Ride class represents a ride at a theme park or amusement park. It manages the queue of visitors,
 * tracks visitors' ride history, and handles operations like running the ride and exporting/importing the ride history.
 */
public class Ride implements RideInterface {
    private String rideName;
    private String rideType;
    private Employee operator;
    private Queue<Visitor> queue;
    private LinkedList<Visitor> rideHistory;
    private int maxRider;
    private int numOfCycles;

    /**
     * Default constructor for the Ride class, initializing with default values.
     */
    public Ride() {
        this("", "", null, 4);
    }

    /**
     * Constructor for creating a Ride object with specified parameters.
     *
     * @param rideName   The name of the ride.
     * @param rideType   The type of the ride (e.g., roller coaster, ferris wheel).
     * @param operator   The operator of the ride (Employee object).
     * @param maxRider   The maximum number of riders allowed in one cycle.
     */
    public Ride(String rideName, String rideType, Employee operator, int maxRider) {
        this.rideName = rideName;
        this.rideType = rideType;
        this.operator = operator;
        this.queue = new LinkedList<>();
        this.rideHistory = new LinkedList<>();
        this.maxRider = maxRider;
    }

    /**
     * Gets the name of the ride.
     *
     * @return The ride name.
     */
    public String getRideName() {
        return rideName;
    }

    /**
     * Sets the name of the ride.
     *
     * @param rideName The name to set for the ride.
     */
    public void setRideName(String rideName) {
        this.rideName = rideName;
    }

    /**
     * Gets the type of the ride.
     *
     * @return The ride type.
     */
    public String getRideType() {
        return rideType;
    }

    /**
     * Sets the type of the ride.
     *
     * @param rideType The type to set for the ride.
     */
    public void setRideType(String rideType) {
        this.rideType = rideType;
    }

    /**
     * Gets the operator of the ride.
     *
     * @return The operator of the ride.
     */
    public Employee getOperator() {
        return operator;
    }

    /**
     * Sets the operator of the ride.
     *
     * @param operator The operator to set for the ride.
     */
    public void setOperator(Employee operator) {
        this.operator = operator;
    }

    /**
     * Adds a visitor to the queue for the ride.
     *
     * @param visitor The visitor to add to the queue.
     */
    @Override
    public void addVisitorToQueue(Visitor visitor) {
        if (visitor == null) {
            System.out.println("Params is null.");
            return;
        }

        queue.add(visitor);
        System.out.println(visitor.getName() + " has joined the queue for " + rideName + ".");
    }

    /**
     * Removes a visitor from the queue for the ride.
     *
     * @param visitor The visitor to remove from the queue.
     */
    @Override
    public void removeVisitorFromQueue(Visitor visitor) {
        if (visitor == null) {
            System.out.println("Params is null.");
            return;
        }

        if (queue.remove(visitor)) {
            System.out.println(visitor.getName() + " has been removed from the queue for " + rideName + ".");
        } else {
            System.out.println(visitor.getName() + " is not in the queue for " + rideName + ".");
        }
    }

    /**
     * Prints the list of visitors currently in the queue.
     */
    @Override
    public void printQueue() {
        if (queue.isEmpty()) {
            System.out.println("The queue for " + rideName + " is currently empty.");
        } else {
            System.out.println("Visitors in the queue for " + rideName + ":");
            for (Visitor v : queue) {
                System.out.println(v);
            }
        }
    }

    /**
     * Adds a visitor to the ride history after they have completed the ride.
     *
     * @param visitor The visitor to add to the ride history.
     */
    @Override
    public void addVisitorToHistory(Visitor visitor) {
        if (visitor == null) {
            System.out.println("Params is null.");
            return;
        }

        rideHistory.add(visitor);
        System.out.println(visitor.getName() + " has been added to the ride history for " + rideName + ".");
    }

    /**
     * Checks if a visitor has taken the ride before by looking in the ride history.
     *
     * @param visitor The visitor to check for in the ride history.
     * @return true if the visitor has taken the ride before, false otherwise.
     */
    @Override
    public boolean checkVisitorFromHistory(Visitor visitor) {
        if (visitor == null) {
            System.out.println("Params is null.");
            return false;
        }

        if (rideHistory.contains(visitor)) {
            System.out.println(visitor.getName() + " is in the ride history for " + rideName + ".");
            return true;
        } else {
            System.out.println(visitor.getName() + " is not in the ride history for " + rideName + ".");
            return false;
        }
    }

    /**
     * Returns the number of visitors who have ridden the ride.
     *
     * @return The number of visitors in the ride history.
     */
    @Override
    public int numberOfVisitors() {
        int count = rideHistory.size();
        System.out.println("Total number of visitors in the ride history for " + rideName + ": " + count);
        return count;
    }

    /**
     * Prints the list of all visitors who have taken the ride.
     */
    @Override
    public void printRideHistory() {
        System.out.println("Visitors who have taken the ride " + rideName + ":");
        Iterator<Visitor> iterator = rideHistory.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    /**
     * Sorts the ride history using a specified comparator.
     *
     * @param comparator The comparator to use for sorting the ride history.
     */
    public void sortRideHistory(Comparator<Visitor> comparator) {
        if (rideHistory == null || rideHistory.isEmpty()) {
            System.out.println("Ride history is empty. Nothing to sort.");
            return;
        }
        Collections.sort(rideHistory, comparator);
    }

    /**
     * Runs the ride for one cycle, allowing a number of visitors (up to maxRider) to take the ride.
     */
    @Override
    public void runOneCycle() {
        if (operator == null) {
            System.out.println("Cannot run the ride: No operator assigned.");
            return;
        }

        if (queue.isEmpty()) {
            System.out.println("Cannot run the ride: No visitors in the queue.");
            return;
        }

        int ridersThisCycle = Math.min(maxRider, queue.size());
        System.out.println("Running the ride for " + ridersThisCycle + " visitors.");

        for (int i = 0; i < ridersThisCycle; i++) {
            Visitor visitor = queue.poll();
            rideHistory.add(visitor);
        }

        numOfCycles++;
        System.out.println("Ride completed cycle #" + numOfCycles + ".");
    }

    /**
     * Exports the ride history to a CSV file.
     *
     * @param fileName The name of the file to which the ride history should be exported.
     */
    public void exportRideHistory(String fileName) {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(fileName));
            Iterator<Visitor> iterator = rideHistory.iterator();

            if (!iterator.hasNext()) {
                System.out.println("No visitors in ride history to export.");
                return;
            }

            while (iterator.hasNext()) {
                Visitor visitor = iterator.next();

                String info = String.format("%s,%d,%s,%d,%s",
                        visitor.getName(),
                        visitor.getAge(),
                        visitor.getGender(),
                        visitor.getNumberOfVisits(),
                        visitor.getMembershipStatus());
                writer.write(info);
                writer.newLine();
            }

            writer.close();
            System.out.println("Ride history successfully exported to " + fileName);
        } catch (IOException e) {
            System.err.println("Error exporting ride history to file: " + e.getMessage());
        }
    }

    /**
     * Imports the ride history from a CSV file.
     *
     * @param fileName The name of the file from which to import the ride history.
     */
    public void importRideHistory(String fileName) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader(fileName));
            String line;
            while ((line = reader.readLine()) != null) {
                try {
                    Visitor visitor = parseVisitor(line);
                    if (visitor != null) {
                        rideHistory.add(visitor);
                    } else {
                        System.out.println("Failed to parse visitor from line: " + line);
                    }
                } catch (Exception e) {
                    System.out.println("Error processing line: " + line + ". " + e.getMessage());
                }
            }
            reader.close();
            System.out.println("Ride history successfully imported from " + fileName);
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }

    /**
     * Parses a visitor's data from a CSV line.
     *
     * @param line The CSV line containing visitor data.
     * @return A Visitor object if parsing is successful, or null if parsing fails.
     */
    private Visitor parseVisitor(String line) {
        String[] parts = line.split(",");
        if (parts.length == 5) {
            String name = parts[0].trim();
            int age = Integer.parseInt(parts[1].trim());
            String gender = parts[2].trim();
            int numberOfVisits = Integer.parseInt(parts[3].trim());
            String membershipStatus = parts[4].trim();
            return new Visitor(name, age, gender, numberOfVisits, membershipStatus);
        }
        return null;
    }

    /**
     * Returns a string representation of the Ride object.
     *
     * @return A string representation of the ride.
     */
    @Override
    public String toString() {
        String operName = "--";
        if (operator != null) {
            operName = operator.getName();
        }

        return String.format("RideName: %s, RideType: %s, Operator: %s",
                rideName, rideType, operName);
    }
}
