package Question1;

import java.util.Scanner;

public class CinemaApp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter details for show 1: ");

        System.out.print("Show ID: ");
        String id1 = input.nextLine();

        System.out.print("Movie Title: ");
        String title1 = input.nextLine();

        System.out.print("Show Time: ");
        String  time1 = input.nextLine();

        System.out.print("Seats Available: ");
        int  seats1 = input.nextInt();
        input.nextLine();

        System.out.println();

        System.out.println("Enter details for show 2: ");

        System.out.print("Show ID: ");
        String id2 = input.nextLine();


        System.out.print("Movie Title: ");
        String title2 = input.nextLine();

        System.out.print("Show Time: ");
        String time2 = input.nextLine();

        System.out.print("Seats Available: ");
        int  seats2 = input.nextInt();

        MovieShow m1 = new MovieShow(id1,title1,time1,seats1);
        MovieShow m2 = new MovieShow(id2,title2,time2,seats2);

        System.out.println();

        System.out.print("How many seats do you want to book for show 1? ");
        int book1 = input.nextInt();
        m1.bookTickets(book1);


        System.out.print("How many seats do you want to book for show 2? ");
        int book2 = input.nextInt();
        m2.bookTickets(book2);

        System.out.println();
        m1.displayShowDetails();
        m2.displayShowDetails();
    }
}
