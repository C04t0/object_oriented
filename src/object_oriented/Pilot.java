package object_oriented;

public abstract class Pilot {
    private Flight currentFlight;

    public void fly(Flight f) {
        if(canAccept(f)) {

        } else {
            handleCantAccept();
        }
    }
    private void handleCantAccept() {
        System.out.println("You are not allowed to fly this flight.");
    }
    public abstract boolean canAccept(Flight f);

}
