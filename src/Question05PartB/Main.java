package Question05PartB;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Product.setDiscountRate(10.0);

        Product p1 = new Product("P101","Laptop",1200.0);
        Product p2 = new Product("P102","SmartPhone",800);
        Product p3 = new Product("P103","HeadPhones",150);

        Inventory Invent = new Inventory();
        Invent.addProduct(p1);
        Invent.addProduct(p2);
        Invent.addProduct(p3);

        Invent.displayAllProducts();

    }
}
