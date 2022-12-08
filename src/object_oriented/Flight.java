package object_oriented;

public class Flight {
    private int passengers, totalCheckedBags;                        //fields (variabelen van object)
    private static int allPassengers, maxPassPerFLight;
    private int seats = 150;                       //constructor + initialisatie
    private int flightNumber;
    private char flightClass;
    private boolean[] isSeatAvailable = new boolean[seats];

    static {
        maxPassPerFLight = 80;
    }

    {
        for (int i = 0; i < isSeatAvailable.length; i++) {
            isSeatAvailable[i] = true;
        }
    }
    public void Flight(int a) {
        seats = 150;
        passengers = 0;
    }
    public void addOnePassenger() {
        if (hasSeating()) {
            passengers += 1;
            allPassengers += 1;
        } else {
            handleTooMany();
        }
    }
    public void addOnePassenger(int bags) {
        if(hasSeating()) {
            addOnePassenger();
            totalCheckedBags += bags;
        }
    }
    public void addOnePassenger(Passenger p) {
        addOnePassenger(p.getCheck());
    }
    public void addOnePassenger(int bags, int carryOn) {
        if(carryOn <= 2) {
            addOnePassenger(bags);
        }
    }
    public void addOnePassenger(Passenger p, int carryOn) {
        addOnePassenger(p.getCheck(), carryOn);
    }
    private void handleTooMany() {
        System.out.println("Too much passengers.");
    }
    public boolean hasSeating() {
        return getPassengers() < getSeats();
    }
    public boolean hasSeating(int count) {
        return passengers + count <= seats;
    }
    public boolean hasRoom(Flight f2) {
        int total = this.passengers + f2.passengers;
        return total <= seats;
    }
    public int getPassengers() {
        return this.passengers;
    }
    public void setPassengers(int passengers) {
        this.passengers = passengers;
    }
    public int getSeats() {
        return this.seats;
    }
    public void setSeats(int seats) {
        this.seats = seats;
    }
    public int getFlightNumber() {
        return flightNumber;
    }
    public void setFlightNumber(int flightNumber) {
        this.flightNumber = flightNumber;
    }
    public char getFlightClass() {
        return flightClass;
    }
    public void setFlightClass(char flightClass) {
        this.flightClass = flightClass;
    }
    public static void setAllPassengers(int allPassengers) {
        Flight.allPassengers = allPassengers;
    }
    public static int getAllPassengers() {
        return allPassengers;
    }
    public static void resetPassengers() {
        allPassengers = 0;
    }
    public static void swapFlight(Flight f1, Flight f2) {
        Flight f3 = f1;
        f1 = f2;
        f2 = f3;
    }
    public static void swapNumbers(Flight f1, Flight f2) {
        int tempFlightNumber = f1.getFlightNumber();
        f1.setFlightNumber(f2.getFlightNumber());
        f2.setFlightNumber(tempFlightNumber);
    }
    public int getTotalCheckedBags() {
        return totalCheckedBags;
    }

    @Override
    public boolean equals(Object o) {
        if (o instanceof Flight) {
            Flight flight = (Flight) o;
            return flight.getFlightNumber() == this.flightNumber;
        }
        return false;
    }

    public void addPassengers(Passenger... passengerList) {
        if(hasSeating(passengerList.length)) {
            passengers += passengerList.length;
            for (Passenger p : passengerList) {
                totalCheckedBags += p.getCheck();
            }
        }
    }
}

