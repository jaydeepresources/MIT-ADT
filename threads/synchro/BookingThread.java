package threads.synchro;

public class BookingThread extends Thread{
    Ticket ticket;

    public BookingThread(Ticket ticket) {
        this.ticket = ticket;
    }

    @Override
    public void run() {
        ticket.bookTicket(getName());
    }
}
