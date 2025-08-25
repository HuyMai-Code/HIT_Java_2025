package buoi8.bai2;

public class ClothingProduct extends Product{

    @Override
    public double getDiscountPrice() {
        return getPrice() - getPrice() * 0.2;
    }
    
}
