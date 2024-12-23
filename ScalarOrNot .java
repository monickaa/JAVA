// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class Main {
    public static void main(String[] args) {
       int n=3;
       int m=3;
       int sum=0;
       int ans=0;
       int mat[][]=new int[n][m];
       Scanner io=new Scanner(System.in);
       for(int i=0;i<n;i++){
           for(int j=0;j<m;j++){
               mat[i][j]=io.nextInt();
           }
       }
       int d=mat[0][0];
       for(int i=0;i<n;i++){
           for(int j=0;j<m;j++){
               if(i==j){
                   if(mat[i][j]==d){
                        sum+=mat[i][j];
                   }
               }
           }
       }
        for(int i=0;i<n;i++){
           for(int j=0;j<m;j++){
               ans+=mat[i][j];
           }
       }
       System.out.println(sum);
       System.out.println(ans);
       if(sum==ans){
           System.out.println("Yes");
       }
       else{
           System.out.println("No");
       }
    }
}
