package Question01;

import java.util.Scanner;

public class GameRentalApp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter details for Game 1: ");

        System.out.print("Game ID: ");
        String ID1 = input.nextLine();

        System.out.print("Title: ");
        String title1 = input.nextLine();

        System.out.print("Platform: ");
        String platform1 = input.nextLine();

        System.out.print("Copies in stock: ");
        int copies1 = input.nextInt();

        System.out.println();

        System.out.println("Enter the details for Game 2: ");

        System.out.print("Game ID: ");
        String ID2 = input.nextLine();
        input.nextLine();

        System.out.print("Title: ");
        String title2 = input.nextLine();

        System.out.print("Platform: ");
        String platform2 = input.nextLine();

        System.out.print("Copies in stock: ");
        int copies2 = input.nextInt();

        VideoGame v1 = new VideoGame(ID1,title1,platform1,copies1);
        VideoGame v2 = new VideoGame(ID2,title2,platform2,copies2);

        System.out.println();

        System.out.print("How many copies of Game 1 would the customer like to rent? ");
        int rent1 = input.nextInt();
        v1.rentGame(rent1);

        System.out.println();

        System.out.print("How many copies of Game 2 would the customer like to rent?");
        int rent2 = input.nextInt();
        v2.rentGame(rent2);

        v1.displayGameInfo();
        System.out.println();
        v2.displayGameInfo();












    }
}
