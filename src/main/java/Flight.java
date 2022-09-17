import java.util.ArrayList;

public class Flight {
    private String destination;
    private int flightId;
    private ArrayList<Passenger> passengersOnTheFlight;
    private boolean isCancelled;

    public Flight (String destination){
        this.destination = destination;
        this.flightId = 0;
        this.passengersOnTheFlight = new ArrayList<>();
        this.isCancelled = false;
    }

    public void addPassengerToFlight(Passenger passenger){ // Adds a passenger to the arraylist in passenger class
        passengersOnTheFlight.add(passenger);
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public int getFlightId() {
        return flightId;
    }

    public void setFlightId(int flightId) {
        this.flightId = flightId;
    }

    public ArrayList<Passenger> getPassengersOnTheFlight() {
        return passengersOnTheFlight;
    }

    public void setPassengersOnTheFlight(ArrayList<Passenger> passengersOnTheFlight) {
        this.passengersOnTheFlight = passengersOnTheFlight;
    }

    public boolean isCancelled() {
        return isCancelled;
    }

    public void setCancelled(boolean cancelled) {
        isCancelled = cancelled;
    }
}
