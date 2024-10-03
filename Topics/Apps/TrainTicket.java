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

public class TrainTicket {
    static ArrayList<Train> trains = new ArrayList<>();
    static ArrayList<Booking> bookings = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        initializeTrains();

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
                    displayAvailableTrains();
                    break;
                case 2:
                    bookTicket(scanner);
                    break;
                case 3:
                    displayBookings();
                    break;
                case 4:
                    System.out.println("Thank you for using the Train Ticket Booking System!");
                    System.exit(0);
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }

    public static void initializeTrains() {
        trains.add(new Train(101, "Express Train", "Chennai", "Bangalore", 100, 500.0));
        trains.add(new Train(102, "Superfast Train", "Delhi", "Mumbai", 50, 1000.0));
        trains.add(new Train(103, "Intercity Train", "Kolkata", "Hyderabad", 75, 750.0));
    }

    public static void displayAvailableTrains() {
        System.out.println("\nAvailable Trains:");
        for (Train train : trains) {
            train.displayTrainInfo();
        }
    }

    public static void bookTicket(Scanner scanner) {
        System.out.print("Enter your name: ");
        String name = scanner.next();
        System.out.print("Enter Train Number: ");
        int trainNumber = scanner.nextInt();

        Train selectedTrain = null;
        for (Train train : trains) {
            if (train.trainNumber == trainNumber) {
                selectedTrain = train;
                break;
            }
        }

        if (selectedTrain == null) {
            System.out.println("Train not found. Please try again.");
            return;
        }

        System.out.print("Enter number of seats to book: ");
        int seats = scanner.nextInt();

        if (seats > selectedTrain.availableSeats) {
            System.out.println("Not enough seats available. Please try again.");
        } else {
            double totalCost = seats * selectedTrain.ticketPrice;
            selectedTrain.availableSeats -= seats;
            bookings.add(new Booking(name, trainNumber, seats, totalCost));
            System.out.println("Ticket booked successfully! Total cost: " + totalCost);
        }
    }

    public static void displayBookings() {
        System.out.println("\nBooking Details:");
        if (bookings.isEmpty()) {
            System.out.println("No bookings found.");
        } else {
            for (Booking booking : bookings) {
                booking.displayBookingInfo();
            }
        }
    }
}
