package Calculations;

public class CalcEngine {


    public static void main(String[] args) {
//      performCalculations();

        Divider divider = new Divider();
            doCalculations(divider, 100.0d, 50.0d);
        Adder adder = new Adder();
            doCalculations(adder, 25.0d, 92.0d);
        Subtractor subtractor = new Subtractor(15.0, 10.0);
        performMoreCalculations();
        }
    private static void performMoreCalculations() {
        CalculateBase[] calculate = {
                new Divider(100.0, 50.0),
                new Adder(25.0, 92.0),
                new Multiplier(11.0, 3.0),
                new Subtractor(225.0, 17.0)};
        for(CalculateBase calculation : calculate) {
            calculation.calculate();
            System.out.println(calculation.getResult());
        }
    }
    /*
    static void performCalculations() {
            double[] leftVals = { 100.0d, 25.0d, 225.0d, 11.0d };
            double[] rightVals = { 50.0d, 92.0d, 17.0d, 3.0d };
            char[] opCodes = { 'd', 'a', 's', 'm' };

            MathEquitation[] equations = new MathEquitation[4];

            for (int i = 0; i < equations.length; i++) {
                equations[i] = new MathEquitation(opCodes[i], leftVals[i], rightVals[i]);
                equations[i].execute();
           System.out.println(equations[i].getResult());
            }

        System.out.println("Average result =" + MathEquitation.getAverageResult());

            double left = 9.0;
            double right = 4.0d;
            MathEquitation equationOverload = new MathEquitation('d');
            equationOverload.execute(left, right);
            System.out.println("Overloaded results with doubles = " + equationOverload.getResult());

            int leftInt = 9;
            int rightInt = 4;
            equationOverload.execute(leftInt, rightInt);
            System.out.println("Overloaded result with integers = " + equationOverload.result);

        }
        */
        private static void doCalculations(CalculateBase calculation, double leftVal, double rightVal) {
            calculation.setLeftVal(leftVal);
            calculation.setRightVal(rightVal);
            calculation.calculate();
            System.out.println("Calculation result = " + calculation.getResult());
        }
    }