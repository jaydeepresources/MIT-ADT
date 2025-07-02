package threads.synchro;

public class Ticket {
    int tickets = 10;

    public synchronized void bookTicket(String name) {
        System.out.println("==============================");
        System.out.println("Booking a ticket for " + name);
        if (tickets > 0) {
            tickets--;
            System.out.println("Ticket is booked for " + name);
            System.out.println("Tickets Available=" + tickets);
        }
        else{
            System.out.println("Tickets Sold Out.");
        }
        System.out.println("==============================");
    }
}
