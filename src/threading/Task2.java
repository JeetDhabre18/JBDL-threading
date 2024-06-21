package threading;

public class Task2 extends Thread {
    @Override
    public void run() {
        System.out.println("Task started"+Thread.currentThread());

    }
}
