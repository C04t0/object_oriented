package Calculations;

public class Adder extends CalculateBase {

    @Override
    public void calculate() {
        double value = getLeftVal() + getRightVal();
        setResult(value);
    }
}
