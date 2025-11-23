// Online Java Compiler
// Use this editor to write, compile and run your Java code online
//2nd change
import java.util.*;
class Main {
    public static void main(String[] args) {
        String str="7+8-9-1";
        int res=beast(str);
        System.out.println(res);
    }
    public static int beast(String str){
        Stack<Integer> num=new Stack<>();
        Stack<Character>symbol=new Stack<>();
        
        int i=0;
        
        while(i<str.length()){
            if(Character.isDigit(str.charAt(i))){
                int a=0;
                while(i<str.length() && Character.isDigit(str.charAt(i))){
                    a=(a*10) +(str.charAt(i)-'0');
                    i++;
                    
                }
                num.push(a);
            }
            else if(str.charAt(i)=='+' || str.charAt(i)=='-' || str.charAt(i)=='/' || str.charAt(i)=='*'){
                while(!symbol.isEmpty() && precedence(symbol.peek()) >= precedence(str.charAt(i))){
                    char op=symbol.pop();
                    int num2=num.pop();
                    int num1=num.pop();
                    num.push(operation(op,num1,num2));
                }
                symbol.push(str.charAt(i));
                i++;
            }
            else{
                i++;
            }
        }
            while(!symbol.isEmpty()){
                char op=symbol.pop();
                int num2=num.pop();
                int num1=num.pop();
                num.push(operation(op,num1,num2));
                // num.push(ans);
            }
            return num.pop();
    }
    public static int operation(char op,int num1,int num2){
        switch(op){
            case '+':return num1+num2;
            case '-':return num1-num2;
            case '/':return num1/num2;
            case '*':return num1*num2;
        }
        return -1;
    }
    public static int precedence(char ch){
        switch(ch){
            case '+':return 1;
            case '-':return 1;
            case '/':return 2;
            case '*':return 2;
            
        }
        return -1;
    }
    
}
