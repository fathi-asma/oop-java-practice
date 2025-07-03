package Question1;

public class Book {
    private String bookId;
    private String bookTitle;
    private String author;
    private int copiesAvailable;

    public Book(String bookId, String bookTitle, String author, int copiesAvailable) {
        this.bookId = bookId;
        this.bookTitle = bookTitle;
        this.author = author;
        this.copiesAvailable = copiesAvailable;
    }

    public void borrowBook( int borrow) {
        if (copiesAvailable < borrow) {
            System.out.println("Insufficient copies available. Please request fewer copies or try another book.");
        } else {
            copiesAvailable = copiesAvailable -borrow;
            System.out.println("Book borrowed successfully!");
        }
    }

    public void returnBook(int returnBook){
        copiesAvailable = copiesAvailable + returnBook;
        System.out.println("Book returned successfully!");
    }

    public void displayBookDetails() {
        System.out.println("Book ID: " + bookId);
        System.out.println("Title: " + bookTitle);
        System.out.println("Author: " + author);
        System.out.println("Copies Available: " + copiesAvailable);
        System.out.println("----------------------------------");

    }
}
