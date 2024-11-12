// Use this editor to write, compile and run your Java code on
import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner io=new Scanner(System.in);
        String str="monicka";
        // int n=str.length();
        Set <Character> s=new LinkedHashSet<>();
        for(char ch:str.toCharArray()){
            s.add(ch);
        }
        System.out.println(s.toString());
        StringBuilder n=new StringBuilder();
        for(char ch:s){
            n.append(ch);
        }
    
        System.out.println(n);
    }
}
