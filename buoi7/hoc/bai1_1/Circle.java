package hoc.bai1_1;

public class Circle extends Shape{
    static final double PI = 3.14;
    private double r;
    
    public Circle() {}
    public Circle(double r) {
        this.r = r;
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    @Override
    public double area() {
        return r * r * PI;
    }
    
}
