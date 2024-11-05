// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class HelloWorld {
    public static void main(String[] args) {
        Scanner io=new Scanner(System.in);
        int n=io.nextInt();
        prime(n);
        
    }
    public static void prime(int n){
        // int div=1;
        if(n==0){
            return;
        }
        for(int i=2;i<=n;i++){
            if(n%i==0){
                System.out.println(i);
                prime(n/i);
                break;
            }
        }
    }
}
