package buoi5.hoc;

public class Pet {
    private String name;
    private double weight;
    private String species;

    public Pet() {}
    public Pet(String name, double weight, String species) {
        this.name = name;
        this.weight = weight;
        this.species = species;
    }
    public void printInfo() {
        System.out.println("Ten: " + this.name + ", Loai: " + this.species + ", Can nang: " + this.weight);
    }
    public boolean isOverweight() {
        if (this.weight > 10) return true;
        return false;
    }
    public String getBasicInfo() {
        return this.name + this.species;
    }
}
