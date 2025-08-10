package buoi5.hoc;

import java.util.ArrayList;

public class Cage {
    private String cageCode;
    private ArrayList<Pet> pets = new ArrayList<>();
    private int currentPetCount;

    
    public static int totalCages = 0;
    final int Max_Capacity = 3;

    public Cage(String cageCode, ArrayList<Pet> pets) {
        this.cageCode = cageCode;
        this.pets = pets;
        ++totalCages;
    }
    public void addPet(Pet pet) {
        if (this.pets.size() > Max_Capacity) {
            System.out.println("Long da day");
            return;
        }
        this.pets.add(pet);
    }
    public void printAllPets() {
        for (Pet pet : pets) {
            pet.printInfo();
        }
    }
    public void printPetsBig() {
        for (int i = 0; i < pets.size(); i++) {
            Pet pet = pets.get(i);
            if (pet.isOverweight()) {
                pet.printInfo();
            }
        }
    }
}
