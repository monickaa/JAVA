import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner io = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int n = io.nextInt();
	    int num = 1;
	    for(int i=1;i<=n;i++)
	    {
	        if(i%2==1){
	            for(int j=1;j<=i;j++){
	                System.out.print(num);
	                if(j<i)
	                {
	                    System.out.print("*");
	                }
	                num++;
	            }
	        }
	        else
	        {
	           int temp=num+i-1;
	           for(int j=1;j<=i;j++){
	               System.out.print(temp);
	               if(j<i)
	               {
	                   System.out.print("*");
	               }
	               temp--;
	               num++;
	           }
	        }
	        System.out.println("");
	    }
		
	}
}

Output:
Enter the number of rows: 5
1
3*2
4*5*6
10*9*8*7
11*12*13*14*15
