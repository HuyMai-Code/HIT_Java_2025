package buoi8.bai3;

import buoi8.bai2.Product;

public interface ProductService {
    public void addProduct (Product p);
    public void updateProduct (String id, Product newInfo);
    public void deleteProduct (String id);
    public Product findByName(String name);
    public void sortByPriceAsc();
    public void sortByPriceDesc();
    public void printProducts();
}
