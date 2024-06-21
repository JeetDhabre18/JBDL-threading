package threading;

import java.util.Arrays;
import java.util.List;

public class FactorialDemo {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        list.stream().map(item->getFactorial(item)).forEach(item->System.out.println(item));
    }

    public static int getFactorial(int n) {
        int output=1;
        for(int i=2;i<=n;i++){
            output=i*output;
        }
        return output;
    }
}
