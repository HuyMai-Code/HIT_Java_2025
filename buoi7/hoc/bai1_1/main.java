package hoc.bai1_1;

public class main {
    public static void main(String[] args) {
        Shape[] shape = {new Circle(2), new Rectangle(4, 5)};
        for (Shape s : shape) {
            System.out.println(s.area());
        }
    }
}
