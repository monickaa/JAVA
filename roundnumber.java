import java.util.*;
class Main {
    public static int getsquare(int n){
        int rem=0;
        int sum=0;
        while(n!=0){
            rem=n%10;
            sum=sum+(rem*rem);
            n/=10;
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner io=new Scanner(System.in);
        int n=io.nextInt();
        Set<Integer> s=new HashSet<>();
        while(n!=1 && !s.contains(n)){
            s.add(n);
            n=getsquare(n);
        }
        s.add(n);
        System.out.println(s);
        if(n==1){
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }
    }
}
