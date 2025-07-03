package Question05PartB;

import java.util.ArrayList;

public class Inventory {
    ArrayList<Product> products = new ArrayList<>();

    public void addProduct(Product p){
        products.add(p);
    }

    public void displayAllProducts(){
        for (Product p : products) {
            p.displayDetails();
        }

    }
}

