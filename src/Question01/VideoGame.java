package Question01;

public class VideoGame {
    private String gameId;
    private String title;
    private String platform;
    private int copiesInStock;

    public VideoGame(String gameId, String title, String platform, int copiesInStock) {
        this.gameId = gameId;
        this.title = title;
        this.platform = platform;
        this.copiesInStock = copiesInStock;
    }

    public void rentGame(int number){
        if (copiesInStock < number) {
            System.out.println("Insufficient stock. Please try a smaller quantity or check back later.");
        } else {
            copiesInStock = copiesInStock-number;
            System.out.println("Game rented successfully!");
        }

    }
    public void displayGameInfo() {
        System.out.println("--- Game Details After Rental---");
        System.out.println("Game ID: " + gameId);
        System.out.println("Title: " + title);
        System.out.println("Platform: " + platform);
        System.out.println("Copies in stock: " + copiesInStock);
        System.out.println("-------------");
    }

}
