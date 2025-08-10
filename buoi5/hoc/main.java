package buoi5.hoc;

import java.util.ArrayList;
import java.util.Scanner;

public class main {
    

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Cage cage1 = new Cage("001", new ArrayList<>());
        Cage cage2 = new Cage("002", new ArrayList<>());
        
        for (int i = 0; i < 3; i++) {
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Weight: ");
            double weight = sc.nextDouble();
            sc.nextLine();
            System.out.print("Species: ");
            String species = sc.nextLine();
            Pet pet = new Pet(name, weight, species);
            cage1.addPet(pet);
        }
        for (int i = 0; i < 3; i++) {
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Weight: ");
            double weight = sc.nextDouble();
            sc.nextLine();
            System.out.print("Species: ");
            String species = sc.nextLine();
            Pet pet = new Pet(name, weight, species);
            cage2.addPet(pet);
        }
        System.out.println("So long da tao ra: " + Cage.totalCages);
        System.out.println("Cac con vat trong long 1: ");
        cage1.printAllPets();
        System.out.println("Cac con vat trong long 2: ");
        cage2.printAllPets();
        System.out.println("Cac con vat co can nang > 10");
        cage1.printPetsBig();
        cage2.printPetsBig();
    }
}
