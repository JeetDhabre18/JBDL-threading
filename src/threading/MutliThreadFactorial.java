package threading;

public class MutliThreadFactorial implements Runnable {

    private int num;

    public MutliThreadFactorial(int num) {
        this.num = num;
    }
    @Override
    public void run() {
        getFactorial();
    }
    public  int getFactorial() {
        int output=1;
        for(int i=2;i<=this.num;i++){
            output=i*output;
        }
        System.out.println("Factorial of the  "+this.num+" is "+output+"is done by"+Thread.currentThread());
        return output;
    }
}
// in this example we cannot pass number as a parameter in a run method
// so for that create an instance level variable and initialize that variable
// in a constructor so we can pass in this way.

