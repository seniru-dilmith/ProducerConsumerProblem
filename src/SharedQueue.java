import java.util.LinkedList;
import java.util.Queue;

public class SharedQueue {
    private static SharedQueue q = null;
    private static Queue<PrintJob> queue = new LinkedList<>();
    private final int capacity = 5;

    private SharedQueue() {

    }

    public static SharedQueue getInstance() {
        if (q == null) {
            q = new SharedQueue();
        }
        return q;
    }

    public int size() {
        return queue.size();
    }

    public void addPrintJob(PrintJob job) {
        if (queue.size() >= 5) {
            System.out.println("Queue is full...");
        } else {
            queue.add(job);
        }
    }

    public PrintJob getJob() {
        if (queue.isEmpty()) {
            System.out.println("Queue is empty...");
        } else {
            return queue.poll();
        }
        return null;
    }
}
