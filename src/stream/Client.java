package stream;

public class Client {
    public static void main(String[] args) {
        //whenever you create an ob of interface it create
        //anonymous class
        Calculator calculator=new Calculator() {
            @Override
            public int add(int a, int b) {
                System.out.println("i am in anonymous class");
                return a+b;
            }
        };

        // or by lambda expression -> only for functional interface
        Calculator calculator1=(a,b)->{
            System.out.println("i am in anonymous class using lambda expression");
            return  a+b;
        };
        System.out.println(calculator1.add(1,2));
    }
}
