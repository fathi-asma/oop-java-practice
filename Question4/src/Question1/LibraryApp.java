package Question1;

import java.util.Scanner;

public class LibraryApp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter details for Book 1: ");
        System.out.print("Book ID: ");
        String id1 = input.nextLine();

        System.out.print("Title: ");
        String title1 = input.nextLine();

        System.out.print("Author: ");
        String author1 = input.nextLine();

        System.out.print("Copies Available: ");
        int copies1 = input.nextInt();
        input.nextLine();

        System.out.println("Enter details for Book 2: ");

        System.out.print("Book ID: ");
        String id2 = input.nextLine();

        System.out.print("Title: ");
        String title2 = input.nextLine();

        System.out.print("Author: ");
        String author2 = input.nextLine();

        System.out.print("Copies Available: ");
        int copies2 = input.nextInt();
        input.nextLine();

        System.out.println("Enter the details for Book 3: ");

        System.out.print("Book ID: ");
        String id3 = input.nextLine();

        System.out.print("Title: ");
        String title3 = input.nextLine();

        System.out.print("Author: ");
        String author3 = input.nextLine();

        System.out.print("Copies Available: ");
        int copies3 = input.nextInt();

        Book b1 = new Book(id1,title1,author1,copies1);
        Book b2 = new Book(id2,title2,author2,copies2);
        Book b3 = new Book(id3,title3,author3,copies3);

        System.out.print("Enter number of copies to borrow for Book 1: ");
        int borrow1 = input.nextInt();
        b1.borrowBook(borrow1);

        System.out.print("Enter number of copies to borrow for Book 2: ");
        int borrow2 = input.nextInt();
        b2.borrowBook(borrow2);

        System.out.print("Enter number of copies to borrow for Book 3: ");
        int borrow3 = input.nextInt();
        b3.borrowBook(borrow3);

        System.out.print("Enter number of copies to return for Book1: ");
        int returnBook1 = input.nextInt();
        b1.returnBook(returnBook1);

        System.out.println();

        System.out.println("Final Book Details: ");
        b1.displayBookDetails();
        b2.displayBookDetails();
        b3.displayBookDetails();



    }
}
