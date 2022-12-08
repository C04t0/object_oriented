package rommel;

public class Auto_opl {
    private double distanceDriven;
    private double distance;
    private double fuel = 40;
    private double efficiency;

    public Auto_opl(double efficiency) {
        this.efficiency = efficiency;
    }

    public Auto_opl(double efficiency, double fuel) {
        this(efficiency);
        this.fuel = fuel;
    }

    public double getdistanceDriven() {
        return distanceDriven;
    }

    public double getFuel() {
        return fuel;
    }

    public void Drive(double distance) {
        if(fuel > fuelLeft(distance)) {
            distanceDriven += distance;
            fuel -= fuelLeft(distance);
            System.out.println("Fuel left: " + fuel);
            System.out.println("Distance driven: " + distanceDriven);
        } else {
            System.out.println("No fuel left ezel");
        }
    }
    private double fuelLeft(double distance) {
        return distance / efficiency;
    }

    public static void main (String[]args) {
        Auto_opl bmw = new Auto_opl(2, 60);
        bmw.Drive(110);
        bmw.Drive(10);
        bmw.Drive(1);

    }
}
