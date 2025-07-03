package Question3;

public class InvalidProductCode extends Exception {
    public InvalidProductCode() {
        super("Product code must starts with 'P' and max length is 6 and ends with 'E'.");
    }
}
