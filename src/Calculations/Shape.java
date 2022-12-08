package Calculations;
/*
create a class shape with a method area().
create a subclass named Rectangle, Circle and Triangle.
 override the methods for each of the subclasses
 */


public abstract class Shape {
    private double h;
    private double w;

    public abstract void area();

    public double getH() {
        return h;
    }

    public void setH(double h) {
        this.h = h;
    }
    public double getW() {
        return w;
    }
    public void setW(double w) {
        this.w = w;
    }
}
