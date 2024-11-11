package TRAVEL;
import java.util.*;
import java.text.*;
public class BOOKING {
	String name;
	int busno;
	Date date;
	BOOKING(Scanner sc){
		
		System.out.println("Enter your name: ");
		name=sc.next();
		System.out.println("Enter your busno: ");
		busno=sc.nextInt();
		System.out.println("Enter date(dd-mm-yy): ");
		String n=sc.next();
		
		SimpleDateFormat sdf=new SimpleDateFormat("dd-mm-yy");
		try {
			date=sdf.parse(n);
		}
		catch(ParseException e) {
			e.printStackTrace();
		}
	}
		public boolean isavailable(ArrayList<BUS> buses,ArrayList<BOOKING> bookings) {
			int booked=0;
			int capacity=0;
			
			for(BUS aa:buses) {
				if(aa.get_busno()==busno) {
					capacity=aa.get_cap();
				}
			}
			for(BOOKING dd:bookings) {
				if(dd.busno==busno && dd.date.equals(date)) {
					booked++;
					capacity--;
				}
			}
			
			return booked<capacity;
	}
}
