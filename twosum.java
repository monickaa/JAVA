import java.util.*;
class HelloWorld {
    public static void main(String[] args) {
       Scanner io=new Scanner(System.in);
       
       int tar=io.nextInt();
       int arr[]={2,7,11,15,16,20};
       int n=arr.length;
       int[] res=master(arr,tar);
       if(res.length==2){
            System.out.println(res[0]+" "+res[1]);
       }
       else{
           System.out.println("No result found");
       }
    }
    public static int [] master(int arr[],int tar){
        int s=0;
        int e=arr.length-1;
        while(s<e){
            if(arr[s]+arr[e]==tar){
                return new int [] {s,e};
            }
            else if(arr[s]+arr[e]>tar){
                e--;
            }
            else{
                s++;
            }
        }
        return new int[]{};
    }
}
