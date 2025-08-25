package hoc.bai1_1;

public class Rectangle extends Shape {
    private double dai;
    private double rong;
    
    public Rectangle() {}
    public Rectangle(double dai, double rong) {
        this.dai = dai;
        this.rong = rong;
    }
    
    public double getDai() {
        return dai;
    }


    public void setDai(double dai) {
        this.dai = dai;
    }


    public double getRong() {
        return rong;
    }


    public void setRong(double rong) {
        this.rong = rong;
    }


    @Override
    public double area() {
        return dai * rong;
    }
    
}
