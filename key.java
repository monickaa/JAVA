// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class HelloWorld {
    public static ArrayList<Integer> pavi(int n){
        ArrayList<Integer>an=new ArrayList<>();
        
        int temp;
        while(n!=0){
            temp=n%10;
            an.add(temp);
            n=n/10;
        }
        return an;
    }
    public static int calculate (int i1,int i2,int i3 ){
        ArrayList<Integer>ip1=pavi(i1);
        ArrayList<Integer>ip2=pavi(i2);
        ArrayList<Integer>ip3=pavi(i3);
        int a=Collections.max(ip1)+Collections.max(ip2)+Collections.max(ip3);
        int b=Collections.min(ip1)+Collections.min(ip2)+Collections.min(ip3);
        return a+b;
    }
    public static void main(String[] args) {
        Scanner io=new Scanner(System.in);
        int i1=io.nextInt();
        int i2=io.nextInt();
        int i3=io.nextInt();
        System.out.println(calculate(i1,i2,i3));
        
    }
}
