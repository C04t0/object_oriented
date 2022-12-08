package Calculations;

public class Rectangle extends Shape{

    @Override
    public void area() {
        double result = (getH() * getW());
        System.out.println(result);
    }
}
