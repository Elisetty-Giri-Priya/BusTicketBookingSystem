import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class BusBooking {
    // ArrayList<Bus> buses = new ArrayList<Bus>();
    HashMap<Integer, Bus> buses = new HashMap<Integer, Bus>();

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

        // BookingDetails d7 = new BookingDetails();
        // d7.user_Name = "naveen";
        // d7.user_Phone = "1234354556";
        // d7.user_Age = 27;
        // d7.user_Destination = "Bengalore";
        // d7.bus_no = 12343;
        // d7.seat_No = 24;
        // bookings.add(d7);

        // BookingDetails d8 = new BookingDetails();
        // d8.user_Name = "priya";
        // d8.user_Phone = "1234354556";
        // d8.user_Age = Bus.TRAVEL_SEATS;
        // d8.user_Destination = "Bengalore";
        // d8.bus_no = 12343;
        // d8.seat_No = 22;
        // bookings.add(d8);

        Bus b2 = new Bus();
        b2.BusNo = 12345;
        b2.BusType = "Travels";
        b2.Source = "Kodur";
        b2.Destination = "Madanapalli";
        b2.seats = new int[Bus.TRAVEL_SEATS];
        b2.TotalSeats = b2.AvailableSeats = Bus.TRAVEL_SEATS;
        buses.put(b2.BusNo, b2);

        // BookingDetails d5 = new BookingDetails();
        // d5.user_Name = "naveen";
        // d5.user_Phone = "1234354556";
        // d5.user_Age = 27;
        // d5.user_Destination = "Madanapalli";
        // d5.bus_no = 12345;
        // d5.seat_No = 24;
        // bookings.add(d5);

        // BookingDetails d6 = new BookingDetails();
        // d6.user_Name = "priya";
        // d6.user_Phone = "1234354556";
        // d6.user_Age = Bus.TRAVEL_SEATS;
        // d6.user_Destination = "Madanapalli";
        // d6.bus_no = 12345;
        // d6.seat_No = 22;
        // bookings.add(d6);

        Bus b3 = new Bus();
        b3.BusNo = 12348;
        b3.BusType = "Travels";
        b3.Source = "Kodur";
        b3.Destination = "Bengalore";
        b3.seats = new int[Bus.TRAVEL_SEATS];
        b3.TotalSeats = b3.AvailableSeats = Bus.TRAVEL_SEATS;
        buses.put(b3.BusNo, b3);

        // BookingDetails d1 = new BookingDetails();
        // d1.user_Name = "naveen";
        // d1.user_Phone = "1234354556";
        // d1.user_Age = 27;
        // d1.user_Destination = "Bengalore";
        // d1.bus_no = 12348;
        // d1.seat_No = 24;
        // bookings.add(d1);

        // BookingDetails d2 = new BookingDetails();
        // d2.user_Name = "priya";
        // d2.user_Phone = "1234354556";
        // d2.user_Age = Bus.TRAVEL_SEATS;
        // d2.user_Destination = "Bengalore";
        // d2.bus_no = 12348;
        // d2.seat_No = 22;
        // bookings.add(d2);

        Bus b4 = new Bus();
        b4.BusNo = 12346;
        b4.BusType = "Express";
        b4.Source = "Kodur";
        b4.Destination = "Madanapalli";
        b4.seats = new int[Bus.EXPRESS_SEATS];
        b4.TotalSeats = b4.AvailableSeats = Bus.EXPRESS_SEATS;
        buses.put(b4.BusNo, b4);

        // BookingDetails d3 = new BookingDetails();
        // d3.user_Name = "naveen";
        // d3.user_Phone = "1234354556";
        // d3.user_Age = 27;
        // d3.user_Destination = "Madanapalli";
        // d3.bus_no = 12346;
        // d3.seat_No = 24;
        // bookings.add(d3);

        // BookingDetails d4 = new BookingDetails();
        // d4.user_Name = "priya";
        // d4.user_Phone = "1234354556";
        // d4.user_Age = Bus.TRAVEL_SEATS;
        // d4.user_Destination = "Madanapalli";
        // d4.bus_no = 12346;
        // d4.seat_No = 22;
        // bookings.add(d4);
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

    public void bookingSeats(String name, String phone, int age, int Bus_no, int seatNo) {
        Bus curr_bus = buses.get(Bus_no);

        BookingDetails bookingDetails = new BookingDetails();
        bookingDetails.user_Name = name;
        bookingDetails.user_Phone = phone;
        bookingDetails.user_Age = age;
        bookingDetails.bus_no = Bus_no;
        bookingDetails.user_Destination = curr_bus.Destination;
        bookingDetails.bus_Type = curr_bus.BusType;
        bookingDetails.seat_No = seatNo;
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
            k = l--;
            System.out.println();
        }

    }

    public void seatCancellation(String name, String phone, int age, int Bus_no, int seatNo) {

        Bus curr_bus = buses.get(Bus_no);
        if (curr_bus.BusNo == Bus_no) {
            BookingDetails b1 = new BookingDetails();
            b1.user_Name = name;
            b1.user_Phone = phone;
            b1.user_Age = age;
            b1.bus_no = Bus_no;
            b1.user_Destination = curr_bus.Destination;
            b1.bus_Type = curr_bus.BusType;
            b1.seat_No = seatNo;
            bookings.remove(b1);

            int[] s = curr_bus.seats;

            s[seatNo] = 0;
            curr_bus.AvailableSeats++;

        }
    }

}
