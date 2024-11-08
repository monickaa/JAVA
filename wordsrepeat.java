// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class HelloWorld {
    public static void main(String[] args) {
        Scanner io=new Scanner(System.in);
        String s=io.next();
        String ans="";
        int count=1;
        for(int i=0;i<s.length();i++){
            if((i+1)<s.length() && s.charAt(i)==s.charAt(i+1)){
                count++;
            }
            else{
            ans=ans+s.charAt(i);
            ans=ans+count;
            count=1;
            }
            
        }
        System.out.println(ans);
    }
}
