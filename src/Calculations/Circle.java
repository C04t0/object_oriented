package Calculations;

public class Circle extends Shape {

    @Override
    public void area() {
        double result = ((Math.pow(getH(), 2) * Math.PI));
        System.out.println(result);
    }
}
