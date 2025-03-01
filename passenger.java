import java.util.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
public class passenger {
    String passengerName;
    int busNo;
    Date date;
    passenger(){
        Scanner booking_info = new Scanner(System.in);
        System.out.println("Enter name of passenger: " );
        passengerName = booking_info.next();
        System.out.println("Enter bus No: ");
        busNo= booking_info.nextInt();
        System.out.println("Enter date dd-mm-yyy");
        String datainput = booking_info.next();
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyy");
        try {
            date=dateFormat.parse(datainput);
        } catch (ParseException e) {
            
            e.printStackTrace();
        }
        booking_info.close();
    }
    public boolean isAvailable(ArrayList<passenger> passengerinfo,ArrayList<bus_info>buses){
        int capacity=0;
        for(bus_info b:buses){
            if(b.getbus()==busNo)
            {
                capacity=b.getcapacity();
            }
        }
            int booked = 0;
            for(passenger pass:passengerinfo){
               if(pass.busNo== busNo && pass.date.equals(date)) {
                booked++;
               }
            }
            return booked<capacity?true:false;
    }
}
