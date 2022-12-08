package object_oriented;

public final class Passenger {
    private int freeBags;
    private int CheckBags;
    private double perBagFee;

    public Passenger() {
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
}
