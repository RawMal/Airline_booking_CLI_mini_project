import java.util.ArrayList;
import java.util.Scanner;

public class CommandLine {

    private ArrayList<Flight> listOfFlights;

    private ArrayList<Passenger> passengerRepo;

    private boolean isOperational;

    public CommandLine() {
        this.listOfFlights = new ArrayList<>();
        this.passengerRepo = new ArrayList<>();
        this.isOperational = true;
    }

    public void addFlight(){
        System.out.println("Enter the Destination you would like to add to the system:");
        Scanner inputScanner = new Scanner(System.in); // creating the scanner
        String destination = inputScanner.nextLine(); // creating line where the user inputs destination
        Flight newFlight = new Flight(destination); // where the scanner will add the information
        addFlight(newFlight);
        System.out.println("Flight added!");
    }

    public void addFlight(Flight flight) {
        listOfFlights.add(flight);
    }
}
