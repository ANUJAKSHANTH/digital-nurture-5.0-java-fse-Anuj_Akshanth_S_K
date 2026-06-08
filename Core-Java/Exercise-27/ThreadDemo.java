public class ThreadDemo extends Thread {
    private final int id;
    public ThreadDemo(int id) { this.id = id; }
    public void run() { System.out.println("Thread " + id + " is running"); }

    public static void main(String[] args) throws InterruptedException {
        ThreadDemo t1 = new ThreadDemo(1);
        ThreadDemo t2 = new ThreadDemo(2);
        t1.start(); t2.start();
        t1.join(); t2.join();
        System.out.println("Threads finished");
    }
}
