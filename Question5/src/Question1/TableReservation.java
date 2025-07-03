package Question1;

import java.util.Scanner;

public class TableReservation {
    private String tableId;
    private int tableSize;
    private int reservedSeats;
    private boolean isReserved;

    public TableReservation(String tableId, int tableSize) {
        this.tableId = tableId;
        this.tableSize = tableSize;
        this.reservedSeats = 0;
        this.isReserved = false;
    }

    public TableReservation(String tableId, int tableSize, int reservedSeats, boolean isReserved) {
        this.tableId = tableId;
        this.tableSize = tableSize;
        this.reservedSeats = reservedSeats;
        this.isReserved = isReserved;
    }

    public void setReservedSeats(int reservedSeats) {
        this.reservedSeats = reservedSeats;
    }

    public boolean setReserved(boolean reserved) {
        isReserved = reserved;
        return reserved;
    }

    public void  reserveTable(int seats) {
        if (isReserved) {
            System.out.println("This table is already reserved. Please select another table.");
        }  if (seats > tableSize) {
            System.out.println("Not enough seats available for this table. Please select a smaller number of seats.");
        } else {
            setReserved(true);
            reservedSeats = seats;
            System.out.println("Reservation successful!");

        }

    }

    public void reserveTable() {
        if (isReserved) {
            System.out.println("This table is already reserved. Please select another table.");
        } else if  (2 > tableSize) {
            System.out.println("Not enough seats available for this table. Please select a smaller number of seats.");
        } else {
            setReserved(true);
            reservedSeats = 2;
            System.out.println("Reservation successful!");
        }

    }


    public void displayTableDetails() {
        System.out.println("Table ID: " + tableId);
        System.out.println("Table Size: " + tableSize);
        System.out.println("Reserved Seats: " + reservedSeats);
        System.out.println("Available seats: " + (reservedSeats-tableSize));
        System.out.println("Reservation Status: " + isReserved);
        System.out.println("------------------------------------");

    }
}

class RestaurantApp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Table ID for table 1: ");
        String id1 = input.nextLine();

        System.out.print("Enter Table Size (capacity) for table 1: ");
        int capacity1 = input.nextInt();
        input.nextLine();

        System.out.println();

        System.out.print("Enter Table ID for table 1: ");
        String  id2 = input.nextLine();

        System.out.print("Enter Table Size (capacity) for table 2: ");
        int capacity2 = input.nextInt();
        input.nextLine();

        System.out.println();

        System.out.print("Enter Table ID for table 1: ");
        String id3 = input.nextLine();

        System.out.print("Enter Table Size (capacity) for table 3: ");
        int capacity3 = input.nextInt();

        System.out.println();

        TableReservation t1 = new TableReservation(id1,capacity1);
        TableReservation t2 = new TableReservation(id2,capacity2);
        TableReservation t3 = new TableReservation(id3,capacity3);

        System.out.print("Enter number of seats to reserve for Table ID 1: ");
        int reserve1 = input.nextInt();
        t1.reserveTable(reserve1);
        System.out.println();

        System.out.print("Enter number of seats to reserve for Table ID 2: ");
        int reserve2 = input.nextInt();
        t2.reserveTable(reserve2);
        System.out.println();

        System.out.print("Enter number of seats to reserve for Table ID 3: ");
        t3.reserveTable();
        System.out.println();

        System.out.print("\n=== Final Table Details ===");
        t1.displayTableDetails();
        t2.displayTableDetails();
        t3.displayTableDetails();



    }

}

