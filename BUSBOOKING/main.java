package TRAVEL;
import java.util.*;
public class MASTER {
	public static void main(String[] args) {
		ArrayList<BUS> buses=new ArrayList<>();
		ArrayList<BOOKING> bookings=new ArrayList<>();
		
		buses.add(new BUS(1,true,50));
		buses.add(new BUS(2,true,55));
		buses.add(new BUS(3,true,2));
		
		for(BUS b:buses) {
			b.display();
		}
		int ch=1;
		Scanner sc=new Scanner(System.in);
		while(ch==1) {
			System.out.println("Enter 1 to book ");
			System.out.println("Enter 2 to exit ");
			System.out.println("Enter 3 to display ");
			ch=sc.nextInt();
			if(ch==1) {
				BOOKING book=new BOOKING(sc);
				if(book.isavailable(buses,bookings)) {
					System.out.println("Confirmed your booking.Seat has been booked");
					bookings.add(book);
					
				}
				else {
					System.out.println("Sorry!!Seat is full");
				}
			}
			else if(ch==3) {
				int count=0;
				for(BUS l:buses) {
					for(BOOKING m:bookings) {
						if(m.busno==l.get_busno()) {
							count++;
						}
					}
				}
				System.out.print("Bus No:"+get_busno());
				System.out.print("Seats booked:"+count);
				System.out.print("Seats available:"+capacity);
			}
		}
		sc.close();
		
	}
}
