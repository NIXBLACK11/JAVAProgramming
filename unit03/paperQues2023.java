public class paperQues2023 {
    public static void main(String[] args) {
        Thread t1 = new Thread(new MyRunnable("Introduction", 2));
        Thread t2 = new Thread(new MyRunnable("To", 100));
        Thread t3 = new Thread(new MyRunnable("Java program", 500));

        t1.start();
        t2.start();
        t3.start();

        try {
            t1.join();
            t2.join();
            t3.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("All threads finished. Exiting main thread.");
    }

    static class MyRunnable implements Runnable {
        private String message;
        private long delay;

        MyRunnable(String message, long delay) {
            this.message = message;
            this.delay = delay;
        }

        @Override
        public void run() {
            try {
                while (!Thread.interrupted()) {
                    System.out.println(message);
                    Thread.sleep(delay);
                }
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }
}
