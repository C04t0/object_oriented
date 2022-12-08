package object_oriented;

import Calculations.Adder;
import Calculations.CalculateBase;
import Calculations.Divider;

public class Main {
    public static void main(String[] args) {
       /* Flight nycToLv = new Flight();
        nycToLv.addOnePassenger();
        //System.out.println(nycToLv.passengers);

        Flight flight1 = new Flight();
        Flight flight2 = new Flight();

        flight2.addOnePassenger();

        flight1 = flight2;

        flight1.addOnePassenger();
        System.out.println(flight2.getPassengers());
        System.out.println(flight1.getPassengers());

        //this
        //System.out.println(flight1.hasRoom(flight2));

        //null
        /*
        Flight flight3 = new Flight();
        Flight flight4 = new Flight();

        Flight combinedFlight = null;

        if(combinedFlight != null) {
            System.out.println("Flight Combined");

        */

        /*
        Passenger bob = new Passenger();
        Passenger oscar = new Passenger(2);

        System.out.println(oscar.getCheck());
        System.out.println(oscar.getPerBagFee());
        }

    }
        Flight f1 = new Flight();
        Flight f2 = new Flight();

        f1.addOnePassenger();
        f2.addOnePassenger();
        f2.addOnePassenger();

        System.out.println(Flight.getAllPassengers());
        Flight.resetPassengers();
        System.out.println(Flight.getAllPassengers());
    }

        Flight f5 = new Flight(10);
        Flight f6 = new Flight(20);

        swapFlight(f5, f6);

        System.out.println(f5.getFlightNumber());
        System.out.println(f6.getFlightNumber());

        swapNumbers(f5, f6);

        System.out.println(f5.getFlightNumber());
        System.out.println(f6.getFlightNumber());


        Flight f3 = new Flight();

        f3.addOnePassenger();
        System.out.println(f3.getPassengers());
        f3.addOnePassenger(2);
        System.out.println(f3.getTotalCheckedBags());

        Passenger p1 = new Passenger(1, 0);
        f3.addOnePassenger(p1);
        System.out.println(f3.getPassengers());

        Passenger p2 = new Passenger(2, 0);
        f3.addOnePassenger(p2, 4);
        System.out.println(f3.getPassengers());

        short threeBags = 3;
        f3.addOnePassenger(threeBags, 2);


        Flight f9 = new Flight();
        Passenger oscar = new Passenger(1, 0);
        Passenger bjorn = new Passenger(2, 0);
        Passenger luc = new Passenger(1, 2);

        f9.addPassengers(oscar, bjorn, luc);
        */

        Cargoflight cFlight = new Cargoflight();
        cFlight.addOnePackage(1.0f, 2.5f, 3.0f);
        System.out.println((cFlight.usedCargoSpace));

        Passenger olivier = new Passenger(2,0);
        cFlight.addOnePassenger(olivier);
        System.out.println(cFlight.getTotalCheckedBags());

        Flight f = new Cargoflight();

        Flight[] squadron = new Flight[5];

        squadron[0] = new Flight();
        squadron[1] = new Cargoflight();
        squadron[2] = new Flight();
        squadron[3] = new Cargoflight();
        squadron[4] = new Flight();

        System.out.println(f.getSeats());
        System.out.println(cFlight.getSeats());

        Divider divider = new Divider();
        doCalcs(divider, 100d, 50d);

        Adder adder = new Adder();
        doCalcs(adder, 25d, 92d);

        Object[] stuff = new Object[3];

        stuff[0] = new Flight();
        stuff[1] = new Passenger();
        stuff[2] = new Cargoflight();

        Object o = new Passenger();
        o = new Flight();

        o = new Flight[5];

        Object ob = new Cargoflight();
        if(ob instanceof Cargoflight) {

            Cargoflight cF2 = (Cargoflight) ob;
            cF2.addOnePackage(1f, 2.5f, 3f);
        }
    }

    private static void doCalcs(CalculateBase calc, double leftVal, double rightVal) {
        calc.setLeftVal(leftVal);
        calc.setRightVal(rightVal);
        calc.calculate();
    }

}
