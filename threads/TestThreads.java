package threads;

public class TestThreads {

    public static void main(String[] args) {
        ThreadA t1 = new ThreadA();
        ThreadA t2 = new ThreadA();
        ThreadB t3 = new ThreadB();

        t1.start();
        t2.start();
        new Thread(t3).start();

        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                long id = Thread.currentThread().getId();
                System.out.println("Starting Thread, instance:" + id);
                for (int i = 0; i < 5; i++) {
                    System.out.println("Thread-" + id + ", iteration=" + i);
                }
                System.out.println("Stopping Thread, instance:" + id);
            }
        };
        new Thread(runnable).start();

        Runnable runnableLambda = ()-> {
            long id = Thread.currentThread().getId();
            System.out.println("Starting Thread, instance:" + id);
            for (int i = 0; i < 5; i++) {
                System.out.println("Thread-" + id + ", iteration=" + i);
            }
            System.out.println("Stopping Thread, instance:" + id);
        };
        new Thread(runnableLambda).start();

    }
}