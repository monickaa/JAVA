import java.util.*;  
public class Main extends Thread{
    public void run(){
        String brr[]={"Ajay","Alice","Bob","John"};
        int n=brr.length;
        for(int i=0;i<n;i++){
            System.out.println(brr[i]);
        try{
            Thread.sleep(2000);
        }
        catch(InterruptedException e){
            System.out.println("Thread interrupted");
        }
        }
        
    }
    public static void main(String[] args) {
        Main t=new Main();
        t.start();
        String arr[]={"Monicka","Monika","Vaishnavi","Sinthana"};
        int m=arr.length;
        for(int i=0;i<m;i++){
            System.out.println(arr[i]);
            try{
                Thread.sleep(2000);
            }
            catch(InterruptedException e){
                System.out.println("Thread interrupted");
            }
        }
        
    }
}
