// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class Main {
    public static int lcs(String s1,String s2){
        int n=s1.length();
        int m=s2.length();
        int dp[][]=new int[n+1][m+1];
        for(int i=1;i<=n;i++){
            for(int j=1;j<=m;j++){
                if(s1.charAt(i-1)==s2.charAt(j-1)){
                    dp[i][j]=dp[i-1][j-1]+1;
                }
                else{
                    dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1]);
                }
            }
        }
        for(int i=0;i<=n;i++){
            for(int j=0;j<=m;j++){
            System.out.print(dp[i][j]);
            }
            System.out.println();
        }
        return dp[n][m];
    }
    public static void main(String[] args) {
        String s1="abaaba";
        String s2="babbab";
        System.out.println(lcs(s1,s2));
    }
}
