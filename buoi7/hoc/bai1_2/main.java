package hoc.bai1_2;

import java.util.ArrayList;

public class main {
    public static void main(String[] args) {
        ArrayList<Movable> movables = new ArrayList<>();
        Car car = new Car();
        Bike bike = new Bike();

        movables.add(car);
        movables.add(bike);

        for (Movable m : movables) {
            m.move();
        }
    }
}
