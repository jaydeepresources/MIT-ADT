package threads.synchro;

public class TestBooking {
    public static void main(String[] args) {
        Ticket ticket = new Ticket();
        BookingThread[] bookingThreads = new BookingThread[12];

        for (int i = 0; i < bookingThreads.length; i++)
            bookingThreads[i] = new BookingThread(ticket);

        for (BookingThread bookingThread : bookingThreads)
            bookingThread.start();

    }
}