// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
//armstrong number code
class Main {
    public static void main(String[] args) {
        int  n=153;
        int m=String.valueOf(n).length();
        System.out.println(m);
        int sum=0;
        // int mul=1;
        while(n!=0){
            int ans=n%10;
            sum+=Math.pow(ans,m);
            n/=10;
        }
        System.out.println(sum);
        if(sum==n){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
}
}
