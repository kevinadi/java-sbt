package kevinadi;

import kevinadi.JavaFibs;
import kevinadi.ScalaFibs;

public class Main {

    public static void main(String[] args) {
        System.out.println("JavaFibs");
        System.out.println("20 fibs " + JavaFibs.list(20));
        System.out.println("20th fib " + JavaFibs.num(20));        
        System.out.println("100th fib " + JavaFibs.num(100));
        System.out.println("200th fib " + JavaFibs.num(200));
        System.out.println("");
        System.out.println("ScalaFibs");
        System.out.println("20 fibs " + ScalaFibs.list(20));
        System.out.println("20th fib " + ScalaFibs.num(20));        
        System.out.println("100th fib " + ScalaFibs.num(100));
        System.out.println("200th fib " + ScalaFibs.num(200));
    }
}