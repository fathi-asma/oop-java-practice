package Question3;

import java.util.Scanner;

public class ProductRegistrationApp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        try {
            System.out.print("Enter product code: ");
            String code = input.nextLine();

            if (! (code.charAt(0) == 'p' || code.charAt(0) == 'P' || code.charAt(code.length()-1) == 'e' &&  code.charAt(code.length()-1) == 'E' || code.length() <= 6)) {
                throw new InvalidProductCode();
            }

            try {
                System.out.print("Enter product price: ");
                double price = input.nextDouble();


                if (price < 0.49) {
                    throw new InvalidPriceRange();
                }

                System.out.println("Product registered successfully!");
                System.out.println("Code: " + code);
                System.out.println("Price: "+ "$" + price);

            } catch(InvalidPriceRange e) {
                System.out.println(e.getMessage());
            }
        } catch (InvalidProductCode e) {
            System.out.println(e.getMessage());
        }
    }
}








