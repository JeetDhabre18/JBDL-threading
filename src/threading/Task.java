package threading;

public class Task implements Runnable{

    @Override
    public void run() {
        System.out.println("Task started"+Thread.currentThread());

    }
}
