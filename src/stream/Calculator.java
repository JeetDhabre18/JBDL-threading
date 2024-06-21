package stream;
@FunctionalInterface

// for functional interface only one abstract method irrespective of default method
public interface Calculator {

    int add(int a, int b);

    default  int multiply(int a, int b){
        return add(a, b);
    }
}
