package Calculations;

public class Triangle extends Shape {
    @Override
    public void area() {
        double result = ((getH() * getW())/2);
        System.out.println(result);
    }
}
