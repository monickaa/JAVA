// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner io=new Scanner(System.in);
        int n=io.nextInt();
        int m=io.nextInt();
        int len=m*n;
        int count=0;
        int mat[][]=new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                mat[i][j]=io.nextInt();
                if(mat[i][j]==0){
                    count+=1;
                }
            }
        }
        int nonzero=len-count;
        System.out.println(nonzero);
        System.out.println(count);
        if(count>nonzero){
            System.out.println("This is a sparse matrix");
        }
        else{
            System.out.println("This is not a sparse matrix");
        }
}
}
