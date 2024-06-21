package stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Predicate;

public class StreamDemo {
    //1  2 3 4  5 6 7 8 9 10
    //check first that num is even or odd
    //square of that even num and return me sum of all num

    //4+16+36+64+100=220
    public static void main(String[] args) {

        // case-1 iterative way
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        int sum=0;
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i) % 2 == 0){
                sum+=list.get(i)*list.get(i);
            }
        }
        System.out.println(sum);


        //case-2 declarative
        // predicate is an interface so we create ob using anonymous class

        //identity is a number which does change identity of other number
        //BinaryOperator   is a functional interface
        int output=list.stream().filter(new Predicate<Integer>() {
            @Override
            public boolean test(Integer integer) {
                System.out.println("i am in test method");
                return integer % 2 == 0;
            }
        }).map(new Function<Integer, Integer>() {
            @Override
            public Integer apply(Integer integer) {
                System.out.println("i am in apply method");
                return integer*integer;
            }
        }).reduce(0, new BinaryOperator<Integer>() {
            @Override
            public Integer apply(Integer integer, Integer integer2) {
                System.out.println("i am in apply method of reduce");
                return integer + integer2;
            }
        });
        System.out.println(output);


//                .reduce(new BinaryOperator<Integer>() {
//            @Override
//            public Integer apply(Integer integer, Integer integer2) {
//                System.out.println("i am in apply method of reduce");
//                return integer + integer2;
//            }
//        })



//                .reduce(0, new BinaryOperator<Integer>() {
//            @Override
//            public Integer apply(Integer integer, Integer integer2) {
//                System.out.println("i am in apply method of reduce");
//                return integer + integer2;
//            }
//        });
//        System.out.println(output);

    }
}

// why we need declarative way when iterative way is working fine?
// because the declarative code is more clear and readable.

//why identity is  required in reduce method