import java.util.Scanner;
public class demo {
    public static void main(String[] args) {
        Scanner io = new Scanner(System.in);       
        int a=io.nextInt();
        if(a>0 && (a&(a-1))==0){
            System.out.println("yes");
        }
        else{
            System.out.println("no");
        }
    }
}
