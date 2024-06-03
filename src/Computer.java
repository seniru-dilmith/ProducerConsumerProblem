import java.util.Scanner;

public class Computer implements Runnable{

    SharedQueue queue = SharedQueue.getInstance();

    @Override
    public void run() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            synchronized (queue) {
                while (queue.size() >= 5) {
                    try {
                        queue.wait();
                    } catch (InterruptedException e) {
                        System.out.println(e.getMessage());;
                    }
                }
                System.out.println("Enter job ID:");
                int id = scanner.nextInt();

                System.out.println("Computer " + Thread.currentThread().getName() + " added " +
                        "job with ID: " + id + ".");
                queue.addPrintJob(new PrintJob(id));

                queue.notifyAll();

            }
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
        }
    }

}
