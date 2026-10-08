import java.util.Scanner;

class MovieTicket {
    String movieName;
    double ticketPrice;
    int numberOfTickets;

    MovieTicket(String movieName, double ticketPrice, int numberOfTickets) {
        this.movieName = movieName;
        this.ticketPrice = ticketPrice;
        this.numberOfTickets = numberOfTickets;
    }

    double calculateTotal() {
        return ticketPrice * numberOfTickets;
    }

    double calculateDiscount() {
        if (numberOfTickets >= 5)
            return calculateTotal() * 0.10;
        else
            return 0;
    }

    double calculateFinalAmount() {
        return calculateTotal() - calculateDiscount();
    }

    void displayBill() {
        System.out.println("\n--- Cinema Ticket Bill ---");
        System.out.println("Movie: " + movieName);
        System.out.printf("Ticket Price: %.2f%n", ticketPrice);
        System.out.println("Tickets: " + numberOfTickets);
        System.out.printf("Discount: %.2f%n", calculateDiscount());
        System.out.printf("Final Amount: %.2f%n", calculateFinalAmount());
    }
}

public class CinemaTicketBookingSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String name = sc.nextLine();
        double price = sc.nextDouble();
        int tickets = sc.nextInt();

        MovieTicket obj = new MovieTicket(name, price, tickets);

        obj.displayBill();

        sc.close();
    }
}