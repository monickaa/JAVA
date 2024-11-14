// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class Main {
    public static void main(String[] args) {
        
        for(int i=11;i<100;i++){
            if(prime(i)){
                if(sum(i)){
                    System.out.println(i);
                }
            }
        }
    }
        public static boolean prime(int i){
            int count=0;
            for(int j=2;j<i;j++){
                if(i%j==0){
                    count++;
                }
            }
            return count==0;
    }
    public static boolean sum(int i){
                int rem;
                int ans=0;
               while(i!=0){
                   rem=i%10;
                   ans+=rem;
                   i/=10;
               }
               return ans%2==0;
    }
}
