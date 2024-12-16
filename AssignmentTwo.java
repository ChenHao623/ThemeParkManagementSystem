/**
 * Student's name: Hao Chen
 * Student ID: 24516439
 * The AssignmentTwo class demonstrates a series of operations related to rides, operators, and visitors.
 */
public class AssignmentTwo {
    /**
     * The main method that runs different parts of the assignment.
     */
    public static void main(String[] args) {
        AssignmentTwo assignmentTwo = new AssignmentTwo();
        assignmentTwo.partThree();
        System.out.println("--------------------------------------------------");
        assignmentTwo.partFourA();
        System.out.println("--------------------------------------------------");
        assignmentTwo.partFourB();
        System.out.println("--------------------------------------------------");
        assignmentTwo.partFive();
        System.out.println("--------------------------------------------------");
        assignmentTwo.partSix();
        System.out.println("--------------------------------------------------");
        assignmentTwo.partSeven();
        System.out.println("--------------------------------------------------");
    }

    /**
     * Simulates adding and removing visitors from the queue, and then prints the queue of visitors.
     * This method demonstrates part three functionality.
     */
    public void partThree() {
        Employee operator = new Employee("Sarah Connor", 30, "Female", "Ride Operator", "Amusement Park");
        Ride rollerCoaster = new Ride("Cyclone", "Roller Coaster", operator, 4);

        Visitor visitor1 = new Visitor("Alice", 25, "Female", 2, "Gold");
        Visitor visitor2 = new Visitor("Bob", 28, "Male", 1, "Silver");
        Visitor visitor3 = new Visitor("Charlie", 32, "Male", 3, "Bronze");
        Visitor visitor4 = new Visitor("Diana", 20, "Female", 4, "Gold");
        Visitor visitor5 = new Visitor("Edward", 35, "Male", 1, "Silver");

        // Add Visitors to the Queue
        rollerCoaster.addVisitorToQueue(visitor1);
        rollerCoaster.addVisitorToQueue(visitor2);
        rollerCoaster.addVisitorToQueue(visitor3);
        rollerCoaster.addVisitorToQueue(visitor4);
        rollerCoaster.addVisitorToQueue(visitor5);

        // Remove a Visitor from the Queue
        rollerCoaster.removeVisitorFromQueue(visitor3);

        // Print all Visitors in the Queue
        rollerCoaster.printQueue();
    }

    /**
     * Simulates adding visitors to the ride history, checks if a visitor exists in the history,
     * and prints the ride history.
     * This method demonstrates part four, part A functionality.
     */
    public void partFourA() {
        Employee operator = new Employee("Sarah Connor", 30, "Female", "Ride Operator", "Amusement Park");
        Ride rollerCoaster = new Ride("Cyclone", "Roller Coaster", operator, 4);

        Visitor visitor1 = new Visitor("Alice", 25, "Female", 2, "Gold");
        Visitor visitor2 = new Visitor("Bob", 28, "Male", 1, "Silver");
        Visitor visitor3 = new Visitor("Charlie", 32, "Male", 3, "Bronze");
        Visitor visitor4 = new Visitor("Diana", 20, "Female", 4, "Gold");
        Visitor visitor5 = new Visitor("Edward", 35, "Male", 1, "Silver");

        rollerCoaster.addVisitorToHistory(visitor1);
        rollerCoaster.addVisitorToHistory(visitor2);
        rollerCoaster.addVisitorToHistory(visitor3);
        rollerCoaster.addVisitorToHistory(visitor4);
        rollerCoaster.addVisitorToHistory(visitor5);

        Visitor checkVisitor = new Visitor("Charlie", 22, "Male", 2, "Bronze");
        rollerCoaster.checkVisitorFromHistory(checkVisitor);
        rollerCoaster.numberOfVisitors();
        rollerCoaster.printRideHistory();
    }

    /**
     * Adds visitors to the ride history, prints the history before and after sorting,
     * and demonstrates sorting by visitor attributes.
     * This method demonstrates part four, part B functionality.
     */
    public void partFourB() {
        Employee operator = new Employee("Sarah Connor", 30, "Female", "Ride Operator", "Amusement Park");
        Ride rollerCoaster = new Ride("Cyclone", "Roller Coaster", operator, 4);

        Visitor visitor1 = new Visitor("Alice", 25, "Female", 2, "A");
        Visitor visitor2 = new Visitor("Bob", 28, "Male", 1, "C");
        Visitor visitor3 = new Visitor("Charlie", 32, "Male", 3, "B");
        Visitor visitor4 = new Visitor("Diana", 20, "Female", 4, "A");
        Visitor visitor5 = new Visitor("Edward", 35, "Male", 1, "C");

        rollerCoaster.addVisitorToHistory(visitor1);
        rollerCoaster.addVisitorToHistory(visitor2);
        rollerCoaster.addVisitorToHistory(visitor3);
        rollerCoaster.addVisitorToHistory(visitor4);
        rollerCoaster.addVisitorToHistory(visitor5);

        System.out.println("\nRide history before sorting:");
        rollerCoaster.printRideHistory();

        VisitorComparator comparator = new VisitorComparator();
        rollerCoaster.sortRideHistory(comparator);

        System.out.println("\nRide history after sorting:");
        rollerCoaster.printRideHistory();
    }

    /**
     * Simulates running a ride cycle, processes visitors, and prints the updated queue and ride history.
     * This method demonstrates part five functionality.
     */
    public void partFive() {
        Employee operator = new Employee("Sarah Connor", 30, "Female", "Ride Operator", "Amusement Park");
        Ride ride = new Ride("Cyclone", "Roller Coaster", operator, 4);

        ride.addVisitorToQueue(new Visitor("Visitor 1", 20, "Male", 2, "A"));
        ride.addVisitorToQueue(new Visitor("Visitor 2", 25, "Female", 3, "B"));
        ride.addVisitorToQueue(new Visitor("Visitor 3", 30, "Male", 5, "C"));
        ride.addVisitorToQueue(new Visitor("Visitor 4", 22, "Female", 4, "A"));
        ride.addVisitorToQueue(new Visitor("Visitor 5", 27, "Male", 1, "B"));
        ride.addVisitorToQueue(new Visitor("Visitor 6", 19, "Female", 3, "C"));
        ride.addVisitorToQueue(new Visitor("Visitor 7", 26, "Male", 2, "A"));
        ride.addVisitorToQueue(new Visitor("Visitor 8", 31, "Female", 6, "B"));
        ride.addVisitorToQueue(new Visitor("Visitor 9", 24, "Male", 1, "C"));
        ride.addVisitorToQueue(new Visitor("Visitor 10", 28, "Female", 4, "A"));

        ride.printQueue();
        System.out.println();
        ride.runOneCycle();
        System.out.println();
        ride.printQueue();
        System.out.println();
        ride.printRideHistory();
    }

    /**
     * Exports the ride history to a file.
     * This method demonstrates part six functionality.
     */
    public void partSix() {
        Employee operator = new Employee("Sarah Connor", 30, "Female", "Ride Operator", "Amusement Park");
        Ride ride = new Ride("Cyclone", "Roller Coaster", operator, 4);

        ride.addVisitorToHistory(new Visitor("Visitor 1", 20, "Male", 2, "A"));
        ride.addVisitorToHistory(new Visitor("Visitor 2", 25, "Female", 3, "B"));
        ride.addVisitorToHistory(new Visitor("Visitor 3", 30, "Male", 5, "C"));
        ride.addVisitorToHistory(new Visitor("Visitor 4", 22, "Female", 4, "A"));
        ride.addVisitorToHistory(new Visitor("Visitor 5", 27, "Male", 1, "B"));

        String fileName = "ride_history.txt";
        ride.exportRideHistory(fileName);
    }

    /**
     * Imports the ride history from a file and prints the visitors and history.
     * This method demonstrates part seven functionality.
     */
    public void partSeven() {
        Employee operator = new Employee("Sarah Connor", 30, "Female", "Ride Operator", "Amusement Park");
        Ride ride = new Ride("Cyclone", "Roller Coaster", operator, 4);

        String fileName = "ride_history.txt";
        ride.importRideHistory(fileName);

        ride.numberOfVisitors();
        ride.printRideHistory();
    }
}
