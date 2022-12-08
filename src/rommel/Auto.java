package rommel;

/*
maak deze oefening.
maak een klasse auto auto dat  benzine consumeert als hij rijdt.
maak methodes aan dat de auto zal rijden voor een aantal kilometers.
en ook om de huidige afstand en het huidige benzine-niveau in de tank te verkrijgen.
specifiëer het benzine verbruik (km per liter) in de constructor.
 */

public class Auto {
    double gas;
    double distance;
    double mileage;
    double currentDistance;
    double currentMileage;
    double currentGas;
    public void setGas(double gas) {
        this.gas = gas;
    }
    public double getGas() {
        return gas;
    }
    public void setDistance(double distance) {
        this.distance = distance;
    }
    public double getDistance() {
        return distance;
    }
    public void setMileage(double gas, double distance) {
        this.mileage = gas / distance;
    }
    public double getMileage() {
        return mileage;
    }
    public void Drive(double distance) {
       do {
           currentDistance = distance * mileage;
           currentGas = mileage * currentDistance;
           currentMileage = currentGas / currentDistance;
        } while (gas != 0);

       if (gas == 0) {
           System.out.println("Your car is empty");
       }
    }



    public static void main (String[]args) {
        Auto BMW = new Auto();
        BMW.setGas(55.0);
        BMW.setDistance(700);
        BMW.setMileage(BMW.getGas(), BMW.getDistance());
        System.out.println(BMW.getMileage());
        BMW.Drive(BMW.distance);
    }

}
