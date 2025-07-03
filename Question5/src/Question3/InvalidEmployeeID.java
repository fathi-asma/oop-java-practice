package Question3;

import java.util.Scanner;

public class InvalidEmployeeID extends Exception {
    public InvalidEmployeeID() {
        super("Employee ID must end with 'EMP'");
    }
}
class InvalidAgeRange extends Exception {
    public InvalidAgeRange() {
        super("Employee age must be between 18 and 65");
    }
}

class EmployeeRegistrationApp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        try {

            System.out.print("Enter Employee ID: ");
            String id = input.nextLine();

            System.out.print("Enter Employee Age: ");
            int age = input.nextInt();

            if (id.length() < 6) {
                throw new InvalidEmployeeID();
            }
            if (age < 18 || age > 65) {
                throw new InvalidAgeRange();
            }

            System.out.println("Employee Registered successfully");

        } catch (InvalidEmployeeID e) {
            System.out.println(e.getMessage());
        } catch (InvalidAgeRange e){
            System.out.println(e.getMessage());
        }

    }

}

