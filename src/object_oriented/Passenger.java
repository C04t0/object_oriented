package object_oriented;

public class Passenger implements Comparable<Passenger> {
    private int freeBags;
    private int CheckBags;
    private double perBagFee;
    private String name;
    private int memberLevel;
    private int memberDays;
    public Passenger() {
    }
    public Passenger(String name, int memberLevel, int memberDays) {
        this.name = name;
        this.memberLevel = memberLevel;
        this.memberDays = memberDays;
    }
    public Passenger (int CheckBags) {
        this(CheckBags < 3 ? 0.5 : 0.25);           //Ternary operator -> condition ? case1(true) : case2(false)
        this.CheckBags = CheckBags;
    }
    public int getFree () {                        //GET
       return  this.freeBags;
    }
    public int setFree(int freeBags) {             //SET
        return this.freeBags = freeBags;
    }
    public int getCheck () {
        return this.CheckBags;
    }
    public Passenger(double perBagFee) {
        this.perBagFee = perBagFee;
    }
    public int setCheck (int checkBags) {
        return this.CheckBags = CheckBags;
    }
    public Passenger(int checkBags, int freeBags) {         //constructor chaining
        this(checkBags);                                    //deze lijn staat altijd aan het begin van de constructor
        this.freeBags = freeBags;
    }
    public double getPerBagFee() {
        return perBagFee;
    }
    public void setPerBagFee(double perBagFee) {
        this.perBagFee = perBagFee;
    }
    public int getMemberLevel() {
        return memberLevel;
    }
    public int getMemberDays() {
        return memberDays;
    }

    public String getName() {
        return name;
    }
    @Override
    public int compareTo (Passenger p) {
        //passenger_1.compareTo(Passenger_2); (indien - passenger_1 eerst, indien + passenger_2 eerst)
        int returnValue = p.getMemberLevel() - this.memberLevel;
        if(returnValue == 0) {
            return p.getMemberDays() - this.memberDays;
        }
        return returnValue;
    }
}
