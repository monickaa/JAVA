// Online Java Compiler
// Use this editor to writec, compile and run your Java code online
import java.util.*;
class Main {
    public static void main(String[] args) {
        int k=1;
        int l=2;
         for(int i=0;i<7;i++){
             for(int j=0;j<=i;j++){
                 if(i%2==0){
                    System.out.print(k+" ");
                     k+=2;
                 }
                 else{
                     System.out.print(l+" ");
                     l+=2;
                 }
            }
            System.out.println();
         }
    }
}
