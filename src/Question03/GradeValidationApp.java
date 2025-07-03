package Question03;

import java.util.Scanner;

public class GradeValidationApp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Student ID (Starts with 's' and max 6 characters): ");
        String ID = input.nextLine();

        System.out.print("Enter Grade (0 to 100) :");
        int grade = input.nextInt();

        try {
            if (ID.length() > 6) {
                throw new InvalidStudentID();
            }
        } catch (InvalidStudentID e){
            System.out.println(e.getMessage());
        }

        try {
            if (grade < 0 || grade > 100){
                throw new InvalidGradeRange();
            }
        }catch (InvalidGradeRange e){
            System.out.println(e.getMessage());
        }
    }
}
