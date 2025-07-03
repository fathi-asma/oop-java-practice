package Question1;

public class MovieShow {
    private String showId;
    private String movieTitle;
    private String  showTime;
    private int seatsAvailable;

    public MovieShow(String showId, String movieTitle, String showTime, int seatsAvailable) {
        this.showId = showId;
        this.movieTitle = movieTitle;
        this.showTime = showTime;
        this.seatsAvailable = seatsAvailable;
    }

    public void bookTickets(int numberOfBooking) {
        if (seatsAvailable < numberOfBooking) {
            System.out.println("Not enough seats available. Please select fewer seats or another show.");
        } else {
            seatsAvailable = seatsAvailable - numberOfBooking;
            System.out.println("Booking successful!");
        }
    }

    public void displayShowDetails() {
        System.out.println("Final show details: ");
        System.out.println("Show ID: " + showId);
        System.out.println("Movie Title: " + movieTitle);
        System.out.println("Show Time: " + showTime);
        System.out.println("Seats Available: " + seatsAvailable);
        System.out.println("------------------------");
    }

}
