package Question05PartB;

public class Product implements Storable {
    private String productID;
    private String name;
    private double Price;
    static double discountRate;

    public Product(String productID, String name, double price) {
        this.productID = productID;
        this.name = name;
        Price = price;
    }

    @Override
    public String getProductID() {
        return productID;
    }

    @Override
    public String getName() {
        return name;
    }
    public static void setDiscountRate(double rate){
        discountRate = rate;
    }

    public double getDiscountedPrice() {
        double discount = Price * discountRate / 100;
        double discountPrice = Price - discount;
        return discountPrice;
    }

    @Override
    public void displayDetails() {
        System.out.println("Product ID: " +productID);
        System.out.println("Name: " + name);
        System.out.println("Price: " + "$" + Price);
        System.out.println("Discounted Price: " +"$"+ getDiscountedPrice());
        System.out.println("------------------------------");

    }
}


