// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class HelloWorld {
    public static int cal(int [][] in){
        int [] start=new int[in.length];
        int [] end=new int[in.length];
        for(int i=0;i<in.length;i++){
            start[i]=in[i][0];
            end[i]=in[i][1];
        }
        Arrays.sort(start);
        Arrays.sort(end);
        int p=end[0];
        int count=0;
        for(int j: start){
            if(j<p){
                count++;
            }
            else{
                p++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int[][] in={{0,30},{5,10},{15,20}};
        int result=cal(in);
        System.out.println(result);
    }
}
