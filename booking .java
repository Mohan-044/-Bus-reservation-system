import java.util.*;
public class booking {
    public static void main(String[]args){
        ArrayList<bus_info> buses = new ArrayList<bus_info>();
        ArrayList<passenger> passengerinfo = new ArrayList<passenger>();
        buses.add(new bus_info (1,45,true));
        buses.add(new bus_info (2,50,false));
        buses.add(new bus_info (3,48,true));
        int userOption =1;
        Scanner input =new Scanner(System.in);
        for(bus_info b:buses){
            b.displaybusinfo();
        }
        while(userOption==1){
            System.out.println("Enter 1 to book and 2 to exit");
            userOption = input.nextInt();
            if(userOption==1){
            System.out.println("Booking.....");
            passenger passenger =new passenger();
            if(passenger.isAvailable(passengerinfo,buses)){
                System.out.println("Your booking is confirmed");
            }
            }
        }
        input.close();
    }
}
