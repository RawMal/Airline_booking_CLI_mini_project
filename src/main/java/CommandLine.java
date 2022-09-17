import java.util.ArrayList;
import java.util.Scanner;

public class CommandLine {

    private ArrayList<Flight> listOfFlights;

    private ArrayList<Passenger> passengerDb;

    private boolean isOperational;

    public CommandLine() {
        this.listOfFlights = new ArrayList<>();
        this.passengerDb = new ArrayList<>();
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


    public void displayFlight(){
        System.out.println("record of confirmed flights: ");
        for (Flight flight : listOfFlights) {
            System.out.println(flight);
        }
    }

    public void addPassenger() {
        System.out.println("Add name of Passenger:");
        Scanner inputScanner = new Scanner(System.in);
        String name = inputScanner.nextLine();
        System.out.println("Add Passenger's contact number: ");
        Scanner contactScanner = new Scanner(System.in);
        String contactNumber = contactScanner.nextLine();
        Passenger newPassenger = new Passenger(name, contactNumber);
        addPassengerToList(newPassenger);
        System.out.println("Passenger added!");
    }

    public void addPassengerToList(Passenger passenger){
        passengerDb.add(passenger);
    }


}
