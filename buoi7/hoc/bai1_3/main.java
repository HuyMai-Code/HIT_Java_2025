package hoc.bai1_3;

public class main {
    public static void main(String[] args) {
        Animal[] animals = {new Dog(), new Cat()};
        for (Animal a : animals) {
            a.makeSound();
        }
    }
}
