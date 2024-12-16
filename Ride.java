import java.util.*;

/**
 * Student's name: Hao Chen
 * Student ID: 24516439
 * The Ride class represents a ride at a theme park or amusement park.
 */
public class Ride {
    private String rideName;
    private String rideType;
    private Employee operator;

    public Ride(String rideName, String rideType, Employee operator) {
        this.rideName = rideName;
        this.rideType = rideType;
        this.operator = operator;
    }

    public String getRideName() {
        return rideName;
    }

    public void setRideName(String rideName) {
        this.rideName = rideName;
    }

    public String getRideType() {
        return rideType;
    }

    public void setRideType(String rideType) {
        this.rideType = rideType;
    }

    public Employee getOperator() {
        return operator;
    }

    public void setOperator(Employee operator) {
        this.operator = operator;
    }
}
import java.util.*;

public class Ride {
    private Queue<Visitor> queue = new LinkedList<>();

    public void addVisitorToQueue(Visitor visitor) {
        if (visitor == null) {
            System.out.println("Params is null.");
            return;
        }
        queue.add(visitor);
        System.out.println(visitor.getName() + " has joined the queue for " + rideName + ".");
    }

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
}
import java.util.*;

public class Ride {
    private LinkedList<Visitor> rideHistory = new LinkedList<>();

    public void addVisitorToHistory(Visitor visitor) {
        if (visitor == null) {
            System.out.println("Params is null.");
            return;
        }
        rideHistory.add(visitor);
        System.out.println(visitor.getName() + " has been added to the ride history for " + rideName + ".");
    }

    public void printRideHistory() {
        System.out.println("Visitors who have taken the ride " + rideName + ":");
        for (Visitor visitor : rideHistory) {
            System.out.println(visitor);
        }
    }

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
}
import java.util.*;

public class Ride {
    private int maxRider = 4;
    private int numOfCycles = 0;

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

    public void sortRideHistory(Comparator<Visitor> comparator) {
        if (rideHistory.isEmpty()) {
            System.out.println("Ride history is empty. Nothing to sort.");
            return;
        }
        rideHistory.sort(comparator);
    }
}
