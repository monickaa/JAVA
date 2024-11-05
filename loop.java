// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class HelloWorld {
    public static void main(String[] args) {
        Scanner io=new Scanner(System.in);
        int count=0;
        
        System.out.println("No of hai: ");
        int h=io.nextInt();
        System.out.println("No of row: ");
        int row=io.nextInt();
        System.out.println("No of block: ");
        int block=io.nextInt();
        for(int i=0;i<block;i++){
            for(int j=0;j<row;j++){
                for(int k=0;k<h;k++){
                System.out.print("Hai"+" ");
                count++;
                }
                System.out.println();
            }
            System.out.println(count);
            
        }
        int add=0;
        for(int i=1;i<=count;i++){
            add+=i;
        }
        System.out.println(add);
    }
}
