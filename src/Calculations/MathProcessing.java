package Calculations;

public interface MathProcessing {

    String SEPARATOR = " ";     //gebruikt om input te splitsen
    String getKeyword();
    double doCalculation(double leftVal, double rightVal);

}
