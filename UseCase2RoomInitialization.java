/**
 * Book My Stay App
 * Use Case 2: Basic Room Types & Static Availability
 * Version 2.1
 */

public class UseCase2RoomInitialization {

    public static void main(String[] args) {

        System.out.println("===== BOOK MY STAY APP v2.1 =====");

        Room single = new SingleRoom();
        Room doubleRoom = new DoubleRoom();
        Room suite = new SuiteRoom();

        int singleAvailable = 5;
        int doubleAvailable = 3;
        int suiteAvailable = 2;

        System.out.println("\nSingle Room Details:");
        single.displayDetails();
        System.out.println("Available: " + singleAvailable);

        System.out.println("\nDouble Room Details:");
        doubleRoom.displayDetails();
        System.out.println("Available: " + doubleAvailable);

        System.out.println("\nSuite Room Details:");
        suite.displayDetails();
        System.out.println("Available: " + suiteAvailable);
    }
}
