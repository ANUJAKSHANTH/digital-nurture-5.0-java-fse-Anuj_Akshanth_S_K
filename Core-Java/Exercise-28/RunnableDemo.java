public class RunnableDemo implements Runnable {
    private final int id;
    public RunnableDemo(int id) { this.id = id; }
    public void run() { System.out.println("Runnable " + id + " executing"); }

    public static void main(String[] args) throws InterruptedException {
        Thread t = new Thread(new RunnableDemo(1));
        t.start(); t.join();
        System.out.println("Runnable finished");
    }
}
