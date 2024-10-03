import java.util.ArrayList;
import java.util.Scanner;

class Train {
    int trainNumber;
    String trainName;
    String source;
    String destination;
    int availableSeats;
    double ticketPrice;

    public Train(int trainNumber, String trainName, String source, String destination, int availableSeats,
            double ticketPrice) {
        this.trainNumber = trainNumber;
        this.trainName = trainName;
        this.source = source;
        this.destination = destination;
        this.availableSeats = availableSeats;
        this.ticketPrice = ticketPrice;
    }

    public void displayTrainInfo() {
        System.out.println("Train Number: " + trainNumber);
        System.out.println("Train Name: " + trainName);
        System.out.println("Source: " + source);
        System.out.println("Destination: " + destination);
        System.out.println("Available Seats: " + availableSeats);
        System.out.println("Ticket Price: " + ticketPrice);
        System.out.println();
    }
}

// book ticket
class Booking {
    String passengerName;
    int trainNumber;
    int numberOfSeats;
    double totalCost;

    public Booking(String passengerName, int trainNumber, int numberOfSeats, double totalCost) {
        this.passengerName = passengerName;
        this.trainNumber = trainNumber;
        this.numberOfSeats = numberOfSeats;
        this.totalCost = totalCost;
    }

    public void displayBookingInfo() {
        System.out.println("Passenger Name: " + passengerName);
        System.out.println("Train Number: " + trainNumber);
        System.out.println("Number of Seats Booked: " + numberOfSeats);
        System.out.println("Total Cost: " + totalCost);
        System.out.println();
    }

}

// --
public class BookingSystem {
    static ArrayList<Train> trains = new ArrayList<>();
    static ArrayList<Booking> bookings = new ArrayList<>();

    public static void main(String[] args) {
        initializeTrains();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Welcome to the Train Ticket Booking System!");
            System.out.println("1. Display Available Trains");
            System.out.println("2. Book Ticket");
            System.out.println("3. Display Bookings");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    displayTrain();
                    break;
                case 2:
                    break;
                default:
                    break;
            }
        }
    }

    // inintialize
    public static void initializeTrains() {
        trains.add(new Train(101, "Express Train", "Chennai", "Bangalore", 100, 500.0));
        trains.add(new Train(102, "Superfast Train", "Delhi", "Mumbai", 50, 1000.0));
        trains.add(new Train(103, "Intercity Train", "Kolkata", "Hyderabad", 75, 750.0));
    }

    // display
    public static void displayTrain() {
        for (Train train : trains) {
            train.displayTrainInfo();
        }
    }

    // book ticket
    public static void BookTicket(Scanner scanner) {
        System.out.println("enter your name");
        String name = scanner.next();
        int trainNumber = scanner.nextInt();
        Train seletedtrain = null;
        double total;
        for (Train train : trains) {
            if (train.trainNumber == trainNumber) {
                seletedtrain = train;
            } else {
                System.out.println("invalid train number");
                return;
            }
        }
        System.out.println("Enter no of seats");
        int seats = scanner.nextInt();
        if (seats > seletedtrain.availableSeats) {
            System.out.println("out of seats");
            return;
        } else {
            total = seats * seletedtrain.ticketPrice;
            seletedtrain.availableSeats -= seats;
            bookings.add(new Booking(name, trainNumber, seats, total));
        }
    }
}
