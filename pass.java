// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class HelloWorld {
    public static void main(String[] args) {
        int count=0;
        int up=0,lw=0,dg=0,sp=0;
        String str="csE123$7";
        if(str.length()>=8){
        for(char ch:str.toCharArray()){
            if(Character.isUpperCase(ch)){
                up++;
                
            }
            else if(Character.isLowerCase(ch)){
                lw++;
            }
            else if(Character.isDigit(ch)){
                dg++;
            }
            else{
                sp++;
            }
        }
        }
        if(up>0 && lw>0 && sp>0 && dg>0){
            System.out.println("strong");
        }
        else{
            System.out.println("weak");
        }
    }
}
