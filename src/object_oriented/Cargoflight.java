package object_oriented;

public class Cargoflight extends Flight {
    float maxCargoSpace = 1000.0f;
    float usedCargoSpace;
    private int seats = 12;

    public Cargoflight() {
    }

    public Cargoflight(int flightNumber) {
        super(flightNumber);
    }

    public Cargoflight(int flightNumber, float maxCargoSpace) {
        this(flightNumber);
        this.maxCargoSpace = maxCargoSpace;
    }
    public Cargoflight(float maxCargoSpace) {
        this.maxCargoSpace = maxCargoSpace;
    }
    public final void addOnePackage(float h, float w, float d) {
        float size = h * w * d;
        if (cargoHasSpace(size)) {
            usedCargoSpace += size;
        } else {
            hasNoSpace();
        }
    }

    private void hasNoSpace() {
        System.out.println("Flight has no more space");
    }

    private boolean cargoHasSpace(float size) {
        return usedCargoSpace + size <= maxCargoSpace;
    }

    @Override
    public int getSeats() {
        return seats;
    }

    @Override
    public void setSeats(int seats) {
        this.seats = seats;
    }

}

