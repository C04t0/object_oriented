package object_oriented;

import java.util.Arrays;
import java.util.Iterator;

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
    */
     Flight f1 = new Flight(175);
     Flight f2 = new Flight(175);

     if (f1.equals(f2)) {
      System.out.println("equal flightnumber");
     }

     Flight f3 = new Flight();
     Flight f4 = f3;

     f3.addOnePassenger();
     Pilot pilot = new CargoOnlyPilot();
     pilot.fly(f4);

     Cargoflight cf294 = new Cargoflight(294);
     Cargoflight cf85 = new Cargoflight(85, 2000f);
     Cargoflight cf = new Cargoflight();
     Cargoflight bcf78 = new Cargoflight(5000f);


     FlightCrewJob job1 = FlightCrewJob.PILOT;
     FlightCrewJob job2 = FlightCrewJob.FLIGHT_ATTENDANT;

     if (job1 == FlightCrewJob.PILOT) {
      System.out.println("is pilot");
     }
        CrewMember tom = new CrewMember(FlightCrewJob.CO_PILOT, "Tom");
        CrewMember olivier = new CrewMember(FlightCrewJob.FLIGHT_ATTENDANT, "Olivier");

        whoIsInCharge(tom, olivier);

        FlightCrewJob[] naam = FlightCrewJob.values();
        for(FlightCrewJob job : naam) {
            System.out.println(job.name());
        }

        FlightCrewJob parsedEnum = FlightCrewJob.valueOf("PILOT");
        System.out.println(parsedEnum);

        Passenger[] passengers = {                                              //nieuwe passenger array
                new Passenger("Bjorn", 1, 180),
                new Passenger("Luc", 1, 90),
                new Passenger("Kenny", 3, 730),
                new Passenger("Oscar", 2, 150),
        };
        Arrays.sort(passengers);
        for(Passenger p: passengers) {
            System.out.println(p.getName());
        }

        Flight flight = new Flight();
        flight.addOnePassenger(passengers[0]);
        flight.addOnePassenger(passengers[1]);

        for (Passenger p : flight) {               //dit kan je gewoon zo schrijven, onderstaande code is wat er gebeurt
            System.out.println(p.getName());
        }

        Iterable<Passenger> temp = flight;
        Iterator<Passenger> iterator = temp.iterator();      //dit gebeurt achter de schermen van het iterator object

        while(iterator.hasNext()) {
            Passenger p = iterator.next();
            System.out.println(p.getName());
        }
    }
    public void displayJobResponsibilities(FlightCrewJob job) {
      switch(job) {
      case FLIGHT_ATTENDANT ->
       System.out.println("Assures passengers safety.");
      case CO_PILOT ->
       System.out.println("Assists in flying the plane.");
      case PILOT ->
       System.out.println("Flies the plane");
      }
    }
    private static void whoIsInCharge(CrewMember member1, CrewMember member2) {
        CrewMember theBoss = (member1.getJob().compareTo(member2.getJob()) > 0 ? member1 : member2);
        System.out.println("The boss is: " + theBoss.getJob().getTitle() + " " + theBoss.getName());
    }
}
