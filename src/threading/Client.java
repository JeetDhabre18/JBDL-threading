package threading;

public class Client {
    public static void main(String[] args) {
        System.out.println(Runtime.getRuntime().availableProcessors());
        Task task = new Task();
        Thread thread = new Thread(task);
        thread.start();
        //thread.start();


        Thread t=new Task2();
        t.start();
    }
}
// if i want to perform a task in multithreaded pattern
//2 ways
//1) create a class implement with runnable which is a functional interface
//you have to provide a body to run method
//create an object of that runnable and create a thread with runnable and start the thread.


//2) way
//Create a class extends thread class
// provide the run method and write the body that you want to run in a multithreaded pattern.
// create an object of that class and start the thread