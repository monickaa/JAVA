// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
public class patternnew {
    public static void main(String[] args) {
        Scanner io=new Scanner(System.in);
        int n=io.nextInt();
        
        int s=0;
        int r=(n*2);
        for(int i=0;i<=n;i++){
          if(i==0){
            for(int j=0;j<=(n*2);j++){
              System.out.print("*"+" ");
            }
          }
          else{
            for(int j=0;j<(n*2);j++){
              
              if(j==s || j==r){
                System.out.print("*"+" ");
                
              }
              else{
                System.out.print(" "+" ");
              }
              
            }
          }
          r--;
          s++;
            System.out.println();
        }
    }
}
