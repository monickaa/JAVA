// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class HelloWorld {
    public static void main(String[] args) {
        Scanner io=new Scanner(System.in);
        List<Integer>l=new ArrayList<>();
        while(l.size()!=5){
            int ran=(int)(Math.random()*11);
            if(!l.contains(ran) && ran!=0){
                l.add(ran);
            }
        }
        // System.out.println(l);
        List<Integer>l1=new ArrayList<>();
        List<Integer>l2=new ArrayList<>();
        System.out.println("Enter the name of player 1: ");
        String s1=io.next();
        System.out.println("Enter the name of player 2: ");
        String s2=io.next();
        System.out.println("Hello "+s1+" and "+s2);
        System.out.println("Computer has some five integers in mind ");
        System.out.println("You both can have three choices each to guess...");
       
        for(int i=0;i<3;i++){
            
            System.out.println("Player 1,guess your choice--->");
            int n1=io.nextInt();
            while(l1.contains(n1) || l2.contains(n1)){
                System.out.println("Already used this number.Another try: ");
            n1=io.nextInt();
            }
                if(l.contains(n1) ){
                    System.out.println("CORRECT");
                    l1.add(n1);
                }
                else{
                    System.out.println("WRONG");
                }
            
            System.out.println("Player 2,guess your choice--->");
            int n2=io.nextInt();
            while(l2.contains(n2) || l1.contains(n2)){
                System.out.println("Already used this number.Another try: ");
                  n2=io.nextInt();
            }
                if(l.contains(n2)){
                    System.out.println("CORRECT");
                    l2.add(n2);
                }
                else{
                    System.out.println("WRONG");
                }
            }
            System.out.println("The 5 numbers are: ");
            System.out.println(l);
            int count1=l1.size();
            int count2=l2.size();
            if(count1>count2){
                System.out.println("Winner is "+s1);
            }
            else{
                System.out.println("Winner is "+s2);
            }
        // System.out.println(l1);
        // System.out.println(l2);
    }
}
