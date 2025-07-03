package Question3;

public class InvalidPriceRange extends Exception {
    public InvalidPriceRange() {
        super("Product price must be greater than $0.49");
    }
}
