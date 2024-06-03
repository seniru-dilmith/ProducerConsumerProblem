import java.util.Queue;

public class Printer implements Runnable{

    final SharedQueue queue = SharedQueue.getInstance();

    @Override
    public void run() {
        while (true) {
            synchronized (queue) {
                while (queue.size() <= 0) {
                    try {
                        queue.wait();
                    } catch (InterruptedException e) {
                        System.out.println(e.getMessage());
                    }
                }

                PrintJob job = queue.getJob();
                System.out.println("Printer " + Thread.currentThread().getName() +
                        " done job with ID: " + job.getID() + ".");

                queue.notifyAll();
            }

            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println(" ");
            }
        }
    }
}
