package threading;

import java.util.Arrays;
import java.util.List;

public class FactorialClient {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        list.stream().forEach(item-> {
            //runnable object
            MutliThreadFactorial runnable = new MutliThreadFactorial(item);
            Thread thread = new Thread(runnable);
            thread.start();
        });
    }
}
