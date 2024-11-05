// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class HelloWorld {
    public static void main(String[] args) {
        int n=7;
        System.out.println(fibo(n-1));
    }
    public static int fibo(int n){
        if(n<=1){
            return n;
        }
        return fibo(n-1)+fibo(n-2);
    }
}
