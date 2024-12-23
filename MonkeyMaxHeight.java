import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner io = new Scanner(System.in);
        System.out.print("Enter the height: ");
        int n = io.nextInt();
        System.out.print("Enter up minutes: ");
        int u = io.nextInt();
        System.out.print("Enter down minutes: ");
        int d = io.nextInt(); 
        int currentHeight=0;
        int time = 0;        
        while (currentHeight < n) {
            time++; 
            currentHeight += u;
            if (currentHeight >= n) {
                break;
            }
            currentHeight -= d;
            time++;
        }
        System.out.println("Time required to reach height: " + time + " minutes");
    }
}
