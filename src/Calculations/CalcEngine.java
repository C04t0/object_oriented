package Calculations;

import java.util.Scanner;

public class CalcEngine {
    public static void main(String[] args) {
//      performCalculations();

        Divider divider = new Divider();
            doCalculations(divider, 100.0d, 50.0d);
        Adder adder = new Adder();
            doCalculations(adder, 25.0d, 92.0d);
        Subtractor subtractor = new Subtractor(15.0, 10.0);

        performMoreCalculations();

        CalculateBase calculation = createCalculation(MathOperation.ADD, 92d, 25d);

        executeInteractively();
        }
    private static CalculateBase createCalculation(MathOperation operation, double leftVal, double rightVal) {
        CalculateBase calculation = null;
        switch (operation) {
            case ADD ->
                calculation = new Adder(leftVal, rightVal);
            case SUBTRACT ->
                calculation = new Subtractor(leftVal, rightVal);
            case MULTIPLY ->
                calculation = new Multiplier(leftVal, rightVal);
            case DIVIDE ->
                calculation = new Divider(leftVal, rightVal);
        }
        return calculation;
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
    private static void doCalculations(CalculateBase calculation, double leftVal, double rightVal) {
        calculation.setLeftVal(leftVal);
        calculation.setRightVal(rightVal);
        calculation.calculate();
        System.out.println("Calculation result = " + calculation.getResult());
        }
    private static void dynamicInteractivity() {
        DynamicHelper helper = new DynamicHelper(new MathProcessing[]{new Adder()});
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter an operation and two numbers: ");
        String userInput = keyboard.nextLine();
        helper.process(userInput);
    }
    private static void executeInteractively() {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter an operation and two numbers: ");
        String input = keyboard.nextLine();
        String[] output = input.split(" ");
        performOperations(output);
        }
    private static void performOperations(String[] output) {
        //add 10 5;
        MathOperation operation = MathOperation.valueOf(output[0].toUpperCase());
        double leftVal = Double.parseDouble(output[1]);
        double rightVal = Double.parseDouble(output[2]);
        CalculateBase calculation = createCalculation(operation, leftVal, rightVal);
        calculation.calculate();
        System.out.println(calculation.getResult());
    }
}