import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class BusBooking {

    HashMap<Integer, Bus> buses = new HashMap<Integer, Bus>();
    HashMap<Integer, User> users = new HashMap<Integer, User>();
    ArrayList<BookingDetails> bookings = new ArrayList<BookingDetails>();

    public void intitialize() {
        Bus b1 = new Bus();
        b1.BusNo = 12343;
        b1.BusType = "Express";
        b1.Source = "Kodur";
        b1.Destination = "Bengalore";
        b1.seats = new int[Bus.EXPRESS_SEATS];
        b1.TotalSeats = b1.AvailableSeats = Bus.EXPRESS_SEATS;
        buses.put(b1.BusNo, b1);

        Bus b2 = new Bus();
        b2.BusNo = 12345;
        b2.BusType = "Travels";
        b2.Source = "Kodur";
        b2.Destination = "Madanapalli";
        b2.seats = new int[Bus.TRAVEL_SEATS];
        b2.TotalSeats = b2.AvailableSeats = Bus.TRAVEL_SEATS;
        buses.put(b2.BusNo, b2);

        Bus b3 = new Bus();
        b3.BusNo = 12348;
        b3.BusType = "Travels";
        b3.Source = "Kodur";
        b3.Destination = "Bengalore";
        b3.seats = new int[Bus.TRAVEL_SEATS];
        b3.TotalSeats = b3.AvailableSeats = Bus.TRAVEL_SEATS;
        buses.put(b3.BusNo, b3);

        Bus b4 = new Bus();
        b4.BusNo = 12346;
        b4.BusType = "Express";
        b4.Source = "Kodur";
        b4.Destination = "Madanapalli";
        b4.seats = new int[Bus.EXPRESS_SEATS];
        b4.TotalSeats = b4.AvailableSeats = Bus.EXPRESS_SEATS;
        buses.put(b4.BusNo, b4);

        User u1 = new User();
        u1.UserName = "priya";
        u1.User_Phone = "8247780548";
        u1.UserAge = 21;
        u1.User_Id = 121;
        users.put(121, u1);

        User u2 = new User();
        u2.UserName = "naveen";
        u2.User_Phone = "7019462108";
        u2.UserAge = 27;
        u2.User_Id = 122;
        users.put(122, u2);

        User u3 = new User();
        u3.UserName = "hari";
        u3.User_Phone = "123456789";
        u3.UserAge = 21;
        u3.User_Id = 123;
        users.put(123, u3);

        User u4 = new User();
        u4.UserName = "bala";
        u4.User_Phone = "987654321";
        u4.UserAge = 20;
        u4.User_Id = 124;
        users.put(124, u4);

        User u5 = new User();
        u5.UserName = "lav";
        u5.User_Phone = "6701651212";
        u5.UserAge = 21;
        u5.User_Id = 125;
        users.put(125, u5);

        User u6 = new User();
        u6.UserName = "Ammu";
        u6.User_Phone = "9010046682";
        u6.UserAge = 21;
        u6.User_Id = 126;
        users.put(126, u6);

        User u8 = new User();
        u8.UserName = "jyo";
        u8.User_Phone = "0987654321";
        u8.UserAge = 22;
        u8.User_Id = 127;
        users.put(127, u8);
    }

    public void searchBuses(String from, String to) {
        System.out.printf("%10s %10s %15s %30s\n", "Bus_No", "Type", "Source", "Destination");
        List<Bus> list = List.copyOf(buses.values());

        for (int i = 0; i < list.size(); i++) {
            Bus currentBus = list.get(i);
            if (currentBus.Source.equals(from) && currentBus.Destination.equals(to)) {

                System.out.printf("%10d %10s %15s %30s\n", currentBus.BusNo, currentBus.BusType, currentBus.Source,
                        currentBus.Destination);
            }
        }

    }

    public void listBuses() {
        System.out.printf("%10s %10s %15s %30s\n", "Bus_No", "Type", "Source", "Destination");
        List<Bus> list = List.copyOf(buses.values());
        for (int i = 0; i < list.size(); i++) {
            Bus bus = list.get(i);
            System.out.printf("%10d %10s %15s %30s\n", bus.BusNo, bus.BusType, bus.Source, bus.Destination);

        }
    }

    public void searchSeats(int Bus_No) {

        Bus bookSeat = buses.get(Bus_No);

        System.out.printf("%10d %10s %15s %30s %5d %5d\n", bookSeat.BusNo, bookSeat.BusType, bookSeat.Source,
                bookSeat.Destination,
                bookSeat.TotalSeats, bookSeat.AvailableSeats);
    }

    public void bookSeat(int userId, int Bus_no, int seatNo) {
        Bus curr_bus = buses.get(Bus_no);
        User curr_user = users.get(userId);
        BookingDetails bookingDetails = new BookingDetails();
        bookingDetails.bus_no = curr_bus.BusNo;
        bookingDetails.seat_No = seatNo;
        bookingDetails.user_Id = curr_user.User_Id;
        bookingDetails.BookedAt = LocalDateTime.now();
        bookingDetails.status=BookingStatus.booked;
        bookings.add(bookingDetails);

        int[] s = curr_bus.seats;
        if (s[seatNo] == 0) {
            s[seatNo] = 1;
            curr_bus.AvailableSeats--;
        } else {
            System.out.println("This seat is already booked");
        }

    }

    public void displaySeats(int Bus_no) {

        Bus curr_bus = buses.get(Bus_no);

        int[] s = curr_bus.seats;
        int count = 0;
        for (int k = 1; k < s.length; k++) {
            count = 0;
            int l = 0;
            for (l = k; count < 5; l++) {

                System.out.printf("%2d ", s[l], " ");
                if (count == 1) {
                    System.out.print("  ");
                }
                count++;
            }
            l--;
            k = l;
            System.out.println();
        }

    }

    public void cancelSeat(int userId, int Bus_no, int seatNo) {

        Bus curr_Bus = buses.get(Bus_no);
        for (int i = 0; i < bookings.size(); i++) {
            BookingDetails curr_Booking = bookings.get(i);
            if (curr_Booking.user_Id == userId && curr_Booking.bus_no == curr_Bus.BusNo) {
                // bookings.remove(curr_Booking);
                curr_Booking.status=BookingStatus.cancelled;
                int[] s = curr_Bus.seats;
                s[seatNo] = 0;
                curr_Bus.AvailableSeats++;
                break;
            }
            else{
                System.out.println("The seat is not cancelled.Because the seat is not booked");
            }

        }

    }
    public void displayBookings(){
      System.out.printf("%10s %10s %10s %30s %15s\n", "User_id", "Bus_No", "SeatNo", "BookedAt","status");  
      for(int i=0;i<bookings.size();i++){
        BookingDetails curr_Booking=bookings.get(i);
        System.out.printf("%10d %10d %10d %30d %15s\n", curr_Booking.user_Id,curr_Booking.bus_no,curr_Booking.seat_No,curr_Booking.BookedAt,curr_Booking.status);
      }
    }

}
