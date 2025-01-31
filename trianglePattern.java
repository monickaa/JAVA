import java.util.*;
class Main {
    public static void main(String[] args) {
        int n=10;
        for(int i=1;i<=n;i++){
            if(i%2!=0){
                for(int j=1;j<=n;j++){
                    if(j%2==0){
                        System.out.print("0"+" ");
                    }
                    else{
                        System.out.print("1"+" ");
                    }
                }
            }
            else{
                for(int j=1;j<=n;j++){
                    if(j%2!=0){
                        System.out.print("0"+" ");
                    }
                    else{
                        System.out.print("1"+" ");
                    }
                }
            }
            System.out.println();
        }
    }
}
