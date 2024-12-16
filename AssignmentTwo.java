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

    // Placeholder for partThree
    public void partThree() {}

    // Placeholder for partFourA
    public void partFourA() {}

    // Placeholder for partFourB
    public void partFourB() {}

    // Placeholder for partFive
    public void partFive() {}

    // Placeholder for partSix
    public void partSix() {}

    // Placeholder for partSeven
    public void partSeven() {}
}
// 添加 partFourA 和 partFourB 的实现
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
