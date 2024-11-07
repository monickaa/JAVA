import java.util.*;
class HelloWorld {
    public static int predict()
    {
        Scanner io=new Scanner(System.in);
        System.out.println("What is your predicted value?");
        int pre=io.nextInt();
        return pre;
        
    }
    public static int[] score(int val)
    {
        int hint=hintChances(val);
        int pre=predict();
        int a=Math.abs((pre-val));
        int hu=(hint*25);
        int s=Math.abs(300-hu-a);
        return new int[] {pre,s,hint};
    }
    
    
    public static int hintChances(int val)
    {
        Scanner io=new Scanner(System.in);
        int hint=3;
        int count=0;
            
            String hnt[]=new String[3];
            hnt[0]=val>150?"the value is greater than 150" : "the value is greater than 150";
            hnt[1]=val%2==0?"The value is even number" :
            "The value is odd number";
            hnt[2]=val%3==0?"The number is divisible by 3" : "the number is not divisible by 3";
            
            
                for(int i=0;i<3;i++){
                    System.out.println("Do you need a hint? Y/N");
            String c = io.next();
                    if (c.equalsIgnoreCase("Y")) {
                   System.out.println(hnt[i]);
                   
                   count++;
            }
            else {
                return count;
            }
            }
            return count;
            
            
    }
    
    
    public static void main(String[] args) {
        Scanner io=new Scanner(System.in);
        System.out.println("Instructions :");
        System.out.println("> Two teams can participate");
        System.out.println("> A initial score 300 will be individually provided for both teams");
        System.out.println("> A team can use three chances to get hint by selecting Y/N");
        System.out.println("> For each hints the score will get reduced by 25");
        System.out.println("---------------------------------");
        System.out.println("* Lets's start the Game *");
        System.out.print("Team 1 : ");
        String team1=io.next();
        System.out.print("Team 2 : ");
        String team2=io.next();
        System.out.println("--------------------------");
        System.out.println("--------Chance for ---------");
        int t1=(int)(Math.random()*301);
        int t2=(int)(Math.random()*301);
        int sc1[]=score(t1);
        int pre1=sc1[0],s1=sc1[1],hint1=sc1[2];
        System.out.println("--------------------------");
        System.out.println("--------Team2---------");
        int sc2[]=score(t2); 
        int pre2=sc2[0],s2=sc2[1],hint2=sc2[2];
        System.out.println("--------------------------");
        System.out.println("Result : ");
        System.out.println(team1+":\n You have used "+hint1+"chances");
        System.out.println("your predicted value is "+pre1);
        System.out.println("your given value is "+t1);
        System.out.println("your final score is "+s1);
        System.out.println(team2+":\n You have used "+hint2+"chances");
        System.out.println("your predicted value is "+pre2);
        System.out.println("your given value is "+t2);
        System.out.println("your final score is "+s2);
        System.out.println("--------------------------");
        if(s1 > s2){
            System.out.println(team1 + " is winner of this game");
        }
        else if(s1<s2)
        {
            System.out.println(team2 + " is winner of this game");
        }
        else{
            System.out.println("match draw");
        }
    }
}
