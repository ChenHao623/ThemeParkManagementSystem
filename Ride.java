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
    private Queue<Visitor> queue = new LinkedList<>();

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

