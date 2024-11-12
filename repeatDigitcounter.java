
import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner io=new Scanner(System.in);
        System.out.println("Enter a digit: ");
       int n=io.nextInt();
       String str=Integer.toString(n);
       HashMap<Character,Integer> mp=new HashMap<>();
       for(int i=0;i<str.length();i++){
           mp.put(str.charAt(i),mp.getOrDefault(str.charAt(i),0)+1);
       }
       int count=0;
      for(int a: mp.values()){
          if(a>1){
              count++;
          }
      }
    //   System.out.println(mp);
     System.out.println(count);
    }
}
