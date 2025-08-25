package buoi8.bai3;

import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.SystemMenuBar;

import buoi8.bai2.Product;

public class ProductServiceImpl implements ProductService{
    ArrayList<Product> products;
    @Override
    public void addProduct(Product p) {
        products.add(p);
    }

    @Override
    public void deleteProduct(String id) {
        
        
    }

    @Override
    public Product findByName(String name) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void printProducts() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void sortByPriceAsc() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void sortByPriceDesc() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void updateProduct(String id, Product newInfo) {
        Scanner sc = new Scanner(System.in);
        System.out.print("New id: ");
        String id_new = sc.nextLine();
        System.out.print("New name: ");
        String name_new = sc.nextLine();
        System.out.print("New price: ");
        double price_new = sc.nextDouble();
        System.out.print("New quantity: ");
        int quantity_new = sc.nextInt();
        sc.nextLine();
        System.out.print("New category: ");
        String category = sc.nextLine();
        
    }
    
}
