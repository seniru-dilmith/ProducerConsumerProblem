public class Main {
    public static void main(String[] args) {
        Thread computer1 = new Thread(new Computer());
        Thread computer2 = new Thread(new Computer());

        Thread printer1 = new Thread(new Printer());
        Thread printer2 = new Thread(new Printer());
        Thread printer3 = new Thread(new Printer());

        computer1.start();
        computer2.start();

        printer1.start();
        printer2.start();
        printer3.start();
    }
}
