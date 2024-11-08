// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class HelloWorld {
    public static void main(String[] args) {
        Scanner io=new Scanner(System.in);
        String str=io.next();
        int s=0,e=0;
        Set<Character> seen=new HashSet<>();
        // int winsize=1;
        while(e<str.length()){
            char ch=str.charAt(e);
            while(seen.contains(ch)){
                seen.remove(str.charAt(s));
                s++;
            }
            seen.add(ch);
            e++;
        }
        System.out.println(seen.size());
    }
}
