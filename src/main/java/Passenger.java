public class Passenger {

    String name;
    String contactNumber;
    int passengerID;

    public Passenger(String name, String contactNumber){
        this.name = name;
        this.contactNumber = contactNumber;
        this.passengerID = 0;
    }

    public int getPassengerID() {
        return passengerID;
    }

    public void setPassengerID(int passengerID) {
        this.passengerID = passengerID;
    }
}
