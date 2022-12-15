package object_oriented;

public enum FlightCrewJob {
    FLIGHT_ATTENDANT("Flight Attendant"), //ieder type van de enum kan ook een "titel" krijgen.
                                               // je kan deze gebruiken om te verwijzen naar het type.
    CO_PILOT("First Officer"),
    PILOT("Captain");
    private String title;

    public String getTitle() {
        return title;
    }
    private FlightCrewJob(String title) {   //private is hier redundant want het is impliciet private
        this.title = title;
    }
}
