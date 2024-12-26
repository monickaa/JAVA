/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner io=new Scanner(System.in);
		int n=io.nextInt();
		int arr[];
		arr=new int[n];
		for(int i=0;i<n;i++){
		    arr[i]=io.nextInt();
		}
// 		for(int i=0;i<n;i++){
// 		    System.out.print(arr[i]+" ");
// 		}
        int count=0;
        for(int i=0;i<n;i++){
		    if(arr[i]==0){
		        count+=1;
		    }
		}
		for(int i=0;i<count;i++){
		      arr[i]=0;
		}
		for(int i=count;i<n;i++){
		      arr[i]=1;
		}
		for(int i=0;i<n;i++){
		      System.out.print(arr[i]+" ");
		}
		
		
		
	}
}
