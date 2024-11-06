public class Main
{
	public static void main(String[] args) throws InterruptedException {
		int h=12;
		int m=43;
		int s=43;
		while(true){
		     System.out.printf("\r%02d:%02d:%02d", h, m, s);
		    Thread.sleep(1000);
		    System.out.flush();
		    s=s+1;
		    if(s==60){
		        s=0;
		        m=m+1;
		    }
		    else if(m==60){
		        s=0;
		        m=0;
		        h+=1;
		    }
		    else if(h==13){
		        s=0;
		        m=0;
		        h=0;
		    }
		}
	}
}
