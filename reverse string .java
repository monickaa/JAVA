// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class Main {
    public static void main(String[] args) {
        String s="I love India";
        String[] ss=s.split(" ");
        // for(int i=0;i<ss.length;i++){
        //      System.out.print(ss[i]);
        // }
        String n="";
        for(int i=ss.length-1;i>=0;i--){
            n+=ss[i]+" ";
        }
        System.out.println(n);
        
    }
}
