package threads;

public class ThreadA extends Thread {

    @Override
    public void run() {
        System.out.println("Starting Thread, instance:" + getId());
        for (int i = 0; i < 5; i++) {
            System.out.println("Thread-" + getId() + ", iteration=" + i);
        }
        System.out.println("Stopping Thread, instance:" + getId());
    }
}
