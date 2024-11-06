// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class HelloWorld {
    public static boolean coprime(int a,int b){
        return gcd(a,b)==1;
    }
    public static int gcd(int a,int b){
        int temp;
        while(b!=0){
            temp=b;
            b=a%b;
            a=temp;
        }
        return a;
    }
    public static void main(String[] args) {
        Scanner io=new Scanner(System.in);
        int n=io.nextInt();
        for(int i=5;i<n;i++)
        {
            for(int j=4;j<i;j++)
            {
                for(int k=3;k<j;k++){
                    if((j*j) + (k*k) ==(i*i) && coprime(i,j) && coprime(j,k)&& coprime(i,k)){
                    System.out.println(i+" "+j+" "+k);
                    }
                }
            }
        }
    }
}
