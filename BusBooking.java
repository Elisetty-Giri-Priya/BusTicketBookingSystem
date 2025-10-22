import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class BusBooking {

    HashMap<Integer, Bus> buses = new HashMap<Integer, Bus>();
    // HashMap<Integer, User> users = new HashMap<Integer, User>();
    ArrayList<BookingDetails> bookings = new ArrayList<BookingDetails>();
    ArrayList<UserRegister> registerations = new ArrayList<UserRegister>();
    ArrayList<Trip> trips = new ArrayList<>();
    String curr_user = "";

    public void intitialize() {
        Bus b1 = new Bus();
        b1.BusNo = 12343;
        b1.BusType = "Express";
        // b1.Source = "Kodur";
        // b1.Destination = "Bengalore";
        b1.seats = new int[Bus.EXPRESS_SEATS];
        b1.TotalSeats = b1.AvailableSeats = Bus.EXPRESS_SEATS;
        buses.put(b1.BusNo, b1);

        Bus b2 = new Bus();
        b2.BusNo = 12345;
        b2.BusType = "Travels";
        // b2.Source = "Kodur";
        // b2.Destination = "Madanapalli";
        b2.seats = new int[Bus.TRAVEL_SEATS];
        b2.TotalSeats = b2.AvailableSeats = Bus.TRAVEL_SEATS;
        buses.put(b2.BusNo, b2);

        Bus b3 = new Bus();
        b3.BusNo = 12348;
        b3.BusType = "Travels";
        // b3.Source = "Kodur";
        // b3.Destination = "Bengalore";
        b3.seats = new int[Bus.TRAVEL_SEATS];
        b3.TotalSeats = b3.AvailableSeats = Bus.TRAVEL_SEATS;
        buses.put(b3.BusNo, b3);

        Bus b4 = new Bus();
        b4.BusNo = 12346;
        b4.BusType = "Express";
        // b4.Source = "Kodur";
        // b4.Destination = "Madanapalli";
        b4.seats = new int[Bus.EXPRESS_SEATS];
        b4.TotalSeats = b4.AvailableSeats = Bus.EXPRESS_SEATS;
        buses.put(b4.BusNo, b4);

        Trip t1 = new Trip();
        t1.tripId = 1;
        t1.departureTime = LocalDateTime.of(2025, 10, 19, 5, 00, 00);
        t1.arrivalTime = LocalDateTime.of(2025, 10, 19, 11, 30, 00);
        t1.source = "Kodur";
        t1.destination = "Bangalore";
        t1.busno = 12345;
        t1.busseats = new int[Trip.travel_seats];
        t1.AvailableSeats = Trip.travel_seats;
        trips.add(t1);

        Trip t2 = new Trip();
        t1.tripId = 2;
        t2.departureTime = LocalDateTime.of(2025, 10, 19, 18, 00, 00);
        t2.arrivalTime = LocalDateTime.of(2025, 10, 20, 2, 00, 00);
        t2.source = "Bangalore";
        t2.destination = "Kodur";
        t2.busno = 12345;
        t2.busseats = new int[Trip.travel_seats];
        t2.AvailableSeats = Trip.travel_seats;
        trips.add(t2);

        Trip t3 = new Trip();
        t3.tripId = 3;
        t3.departureTime = LocalDateTime.of(2025, 10, 19, 8, 00, 00);
        t3.arrivalTime = LocalDateTime.of(2025, 10, 19, 11, 30, 00);
        t3.source = "Tirupati";
        t3.destination = "Madanapalli";
        t3.busno = 12343;
        t3.busseats = new int[Trip.express_seats];
        t3.AvailableSeats = Trip.express_seats;
        trips.add(t3);

        Trip t4 = new Trip();
        t4.tripId = 4;
        t4.departureTime = LocalDateTime.of(2025, 10, 19, 1, 30, 00);
        t4.arrivalTime = LocalDateTime.of(2025, 10, 19, 17, 00, 00);
        t4.source = "madanapalli";
        t4.destination = "Tirupati";
        t4.busno = 12348;
        t4.busseats = new int[Trip.travel_seats];
        t4.AvailableSeats = Trip.travel_seats;
        trips.add(t4);

        Trip t5 = new Trip();
        t5.tripId = 5;
        t5.departureTime = LocalDateTime.of(2025, 10, 19, 7, 30, 00);
        t5.arrivalTime = LocalDateTime.of(2025, 10, 19, 9, 30, 00);
        t5.source = "Tirupati";
        t5.destination = "Kodur";
        t5.busno = 12348;
        t5.busseats = new int[Trip.travel_seats];
        t5.AvailableSeats = Trip.travel_seats;
        trips.add(t5);

        Trip t6 = new Trip();
        t6.tripId = 6;
        t6.departureTime = LocalDateTime.of(2025, 10, 19, 10, 00, 00);
        t6.arrivalTime = LocalDateTime.of(2025, 10, 19, 12, 30, 00);
        t6.source = "kodur";
        t6.destination = "Tirupati";
        t6.busno = 12348;
        t6.busseats = new int[Trip.travel_seats];
        t6.AvailableSeats = Trip.travel_seats;
        trips.add(t6);

        Trip t7 = new Trip();
        t7.tripId = 7;
        t7.departureTime = LocalDateTime.of(2025, 10, 19, 13, 30, 00);
        t7.arrivalTime = LocalDateTime.of(2025, 10, 19, 15, 00, 00);
        t7.source = "Tirupati";
        t7.destination = "Kodur";
        t7.busno = 12348;
        t7.busseats = new int[Trip.travel_seats];
        t7.AvailableSeats = Trip.travel_seats;
        trips.add(t7);

        Trip t8 = new Trip();
        t8.tripId = 8;
        t8.departureTime = LocalDateTime.of(2025, 10, 19, 16, 00, 00);
        t8.arrivalTime = LocalDateTime.of(2025, 10, 19, 18, 00, 00);
        t8.source = "Kodur";
        t8.destination = "Tirupati";
        t8.busno = 12348;
        t8.busseats = new int[Trip.travel_seats];
        t8.AvailableSeats = Trip.travel_seats;
        trips.add(t8);

        Trip t9 = new Trip();
        t9.tripId = 9;
        t9.departureTime = LocalDateTime.of(2025, 10, 19, 7, 30, 00);
        t9.arrivalTime = LocalDateTime.of(2025, 10, 19, 11, 00, 00);
        t9.source = "Madanapalli";
        t9.destination = "Bangalore";
        t9.busno = 12346;
        t9.busseats = new int[Trip.express_seats];
        t9.AvailableSeats = Trip.express_seats;
        trips.add(t9);

        Trip t10 = new Trip();
        t10.tripId = 10;
        t10.departureTime = LocalDateTime.of(2025, 10, 19, 12, 00, 00);
        t10.arrivalTime = LocalDateTime.of(2025, 10, 19, 16, 00, 00);
        t10.source = "Bangalore";
        t10.destination = "Madanapalli";
        t10.busno = 12346;
        t10.busseats = new int[Trip.express_seats];
        t10.AvailableSeats = Trip.express_seats;
        trips.add(t10);

        // second date
        Trip t11 = new Trip();
        t11.tripId = 11;
        t11.departureTime = LocalDateTime.of(2025, 10, 20, 5, 00, 00);
        t11.arrivalTime = LocalDateTime.of(2025, 10, 21, 11, 30, 00);
        t11.source = "Kodur";
        t11.destination = "Bangalore";
        t11.busno = 12345;
        t11.busseats = new int[Trip.travel_seats];
        t11.AvailableSeats = Trip.travel_seats;
        trips.add(t11);

        Trip t12 = new Trip();
        t12.tripId = 12;
        t12.departureTime = LocalDateTime.of(2025, 10, 20, 18, 00, 00);
        t12.arrivalTime = LocalDateTime.of(2025, 10, 21, 2, 00, 00);
        t12.source = "Bangalore";
        t12.destination = "Kodur";
        t12.busno = 12345;
        t12.busseats = new int[Trip.travel_seats];
        t12.AvailableSeats = Trip.travel_seats;
        trips.add(t12);

        Trip t13 = new Trip();
        t13.tripId = 13;
        t13.departureTime = LocalDateTime.of(2025, 10, 20, 8, 00, 00);
        t13.arrivalTime = LocalDateTime.of(2025, 10, 20, 11, 30, 00);
        t13.source = "Tirupati";
        t13.destination = "Madanapalli";
        t13.busno = 12343;
        t13.busseats = new int[Trip.express_seats];
        t13.AvailableSeats = Trip.express_seats;
        trips.add(t13);

        Trip t14 = new Trip();
        t14.tripId = 14;
        t14.departureTime = LocalDateTime.of(2025, 10, 20, 1, 30, 00);
        t14.arrivalTime = LocalDateTime.of(2025, 10, 20, 17, 00, 00);
        t14.source = "madanapalli";
        t14.destination = "Tirupati";
        t14.busno = 12348;
        t14.busseats = new int[Trip.travel_seats];
        t14.AvailableSeats = Trip.travel_seats;
        trips.add(t14);

        Trip t15 = new Trip();
        t15.tripId = 15;
        t15.departureTime = LocalDateTime.of(2025, 10, 20, 7, 30, 00);
        t15.arrivalTime = LocalDateTime.of(2025, 10, 20, 9, 30, 00);
        t15.source = "Tirupati";
        t15.destination = "Kodur";
        t15.busno = 12348;
        t15.busseats = new int[Trip.travel_seats];
        t15.AvailableSeats = Trip.travel_seats;
        trips.add(t15);

        Trip t16 = new Trip();
        t16.tripId = 16;
        t16.departureTime = LocalDateTime.of(2025, 10, 20, 10, 00, 00);
        t16.arrivalTime = LocalDateTime.of(2025, 10, 20, 12, 30, 00);
        t16.source = "kodur";
        t16.destination = "Tirupati";
        t16.busno = 12348;
        t16.busseats = new int[Trip.travel_seats];
        t16.AvailableSeats = Trip.travel_seats;
        trips.add(t16);

        Trip t17 = new Trip();
        t17.tripId = 17;
        t17.departureTime = LocalDateTime.of(2025, 10, 20, 13, 30, 00);
        t17.arrivalTime = LocalDateTime.of(2025, 10, 20, 15, 00, 00);
        t17.source = "Tirupati";
        t17.destination = "Kodur";
        t17.busno = 12348;
        t17.busseats = new int[Trip.travel_seats];
        t17.AvailableSeats = Trip.travel_seats;
        trips.add(t17);

        Trip t18 = new Trip();
        t18.tripId = 18;
        t18.departureTime = LocalDateTime.of(2025, 10, 20, 16, 00, 00);
        t18.arrivalTime = LocalDateTime.of(2025, 10, 20, 18, 00, 00);
        t18.source = "Kodur";
        t18.destination = "Tirupati";
        t18.busno = 12348;
        t18.busseats = new int[Trip.travel_seats];
        t18.AvailableSeats = Trip.travel_seats;
        trips.add(t18);

        Trip t19 = new Trip();
        t19.tripId = 19;
        t19.departureTime = LocalDateTime.of(2025, 10, 20, 7, 30, 00);
        t19.arrivalTime = LocalDateTime.of(2025, 10, 20, 11, 00, 00);
        t19.source = "Madanapalli";
        t19.destination = "Bangalore";
        t19.busno = 12346;
        t19.busseats = new int[Trip.express_seats];
        t19.AvailableSeats = Trip.express_seats;
        trips.add(t19);

        Trip t20 = new Trip();
        t20.tripId = 20;
        t20.departureTime = LocalDateTime.of(2025, 10, 20, 12, 00, 00);
        t20.arrivalTime = LocalDateTime.of(2025, 10, 20, 16, 00, 00);
        t20.source = "Bangalore";
        t20.destination = "Madanapalli";
        t20.busno = 12346;
        t20.busseats = new int[Trip.express_seats];
        t20.AvailableSeats = Trip.express_seats;
        trips.add(t20);

        // User u1 = new User();
        // u1.UserName = "priya";
        // u1.User_Phone = "8247780548";
        // u1.UserAge = 21;
        // u1.User_Id = 121;
        // users.put(121, u1);

        // User u2 = new User();
        // u2.UserName = "naveen";
        // u2.User_Phone = "7019462108";
        // u2.UserAge = 27;
        // u2.User_Id = 122;
        // users.put(122, u2);

        // User u3 = new User();
        // u3.UserName = "hari";
        // u3.User_Phone = "123456789";
        // u3.UserAge = 21;
        // u3.User_Id = 123;
        // users.put(123, u3);

        // User u4 = new User();
        // u4.UserName = "bala";
        // u4.User_Phone = "987654321";
        // u4.UserAge = 20;
        // u4.User_Id = 124;
        // users.put(124, u4);

        // User u5 = new User();
        // u5.UserName = "lav";
        // u5.User_Phone = "6701651212";
        // u5.UserAge = 21;
        // u5.User_Id = 125;
        // users.put(125, u5);

        // User u6 = new User();
        // u6.UserName = "Ammu";
        // u6.User_Phone = "9010046682";
        // u6.UserAge = 21;
        // u6.User_Id = 126;
        // users.put(126, u6);

        // User u8 = new User();
        // u8.UserName = "jyo";
        // u8.User_Phone = "0987654321";
        // u8.UserAge = 22;
        // u8.User_Id = 127;
        // users.put(127, u8);

        // UserRegister r1 = new UserRegister();
        // r1.fullName = "Priya";
        // r1.age = 23;
        // r1.password = "@2003";
        // r1.userName = "priya";
        // r1.phone = "8247780548";
        // r1.email = "priya@gmail.com";
        // registerations.add(r1);

        // UserRegister r2 = new UserRegister();
        // r2.fullName = "Giri";
        // r2.age = 23;
        // r2.password = "@2004";
        // r2.userName = "giri";
        // r2.phone = "123456789";
        // r2.email = "giri@gmail.com";
        // registerations.add(r2);

        // UserRegister r3 = new UserRegister();
        // r3.fullName = "Naveen";
        // r3.age = 27;
        // r3.password = "@Navee";
        // r3.userName = "naveen";
        // r3.phone = "7019462108";
        // r3.email = "naveen@gmail.com";
        // registerations.add(r3);

        // UserRegister r4 = new UserRegister();
        // r4.fullName = "lavanya";
        // r4.age = 23;
        // r4.password = "@2025";
        // r4.userName = "Lavanya";
        // r4.phone = "760165100";
        // r4.email = "lavanya@gmail.com";
        // registerations.add(r4);

    }

    public void searchTrips(LocalDate departureDate, String source, String destination_) {
        System.out.printf("%7s %20s %20s %15s %15s %15s\n", "Trid_id", "Departure_time", "Arrival_time", "Source",
                "Destination",
                "Bus_no");
        for (int i = 0; i < trips.size(); i++) {
            Trip curr_trip = trips.get(i);
            if (curr_trip.departureTime.toLocalDate().equals(departureDate) && curr_trip.source.equals(source)
                    && curr_trip.destination.equals(destination_)) {
                System.out.printf("%8d %20s %20s %15s %15s %15d\n", curr_trip.tripId, curr_trip.departureTime,
                        curr_trip.arrivalTime,
                        curr_trip.source, curr_trip.destination, curr_trip.busno);
            }
        }
    }

    public void listTrips() {
        System.out.printf("%20s %20s %15s %15s %15s\n", "Departure_time", "Arrival_time", "Source", "Destination",
                "Bus_no");
        for (int i = 0; i < trips.size(); i++) {
            Trip curr_trip = trips.get(i);
            System.out.printf("%20s %20s %15s %15s %15d\n", curr_trip.departureTime, curr_trip.arrivalTime,
                    curr_trip.source, curr_trip.destination, curr_trip.busno);
        }
    }

    public void searchSeats(int trip_id) {
        System.out.printf("%5s\n", "AvailableSeats");
        for (int i = 0; i < trips.size(); i++) {
            Trip curr_Trip = trips.get(i);
            if (curr_Trip.tripId == trip_id) {
                System.out.printf("%5d\n", curr_Trip.AvailableSeats);
            }
        }
    }

    public void bookSeat(int TripId, int seatNo) {
        for (int i = 0; i < trips.size(); i++) {
            Trip curr_trip = trips.get(i);
            if (curr_trip.tripId == TripId) {
                BookingDetails bookingDetails = new BookingDetails();
                bookingDetails.userName = curr_user;
                bookingDetails.tid = TripId;
                bookingDetails.bus_no = curr_trip.busno;
                bookingDetails.source = curr_trip.source;
                bookingDetails.destination = curr_trip.destination;
                bookingDetails.seat_No = seatNo;
                bookingDetails.BookedAt = curr_trip.departureTime;
                bookingDetails.status = BookingStatus.booked;
                bookings.add(bookingDetails);
                int[] s = curr_trip.busseats;
                if (s[seatNo] == 0) {
                    s[seatNo] = 1;
                    curr_trip.AvailableSeats--;
                } else {
                    System.out.println("This seat is already booked");
                }
                break;
            }
        }
    }

    public void displaySeats(int tripiid) {
        for (int i = 0; i < trips.size(); i++) {
            Trip curr_trip = trips.get(i);
            if (curr_trip.tripId == tripiid) {
                int[] s = curr_trip.busseats;
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
                break;
            }
        }
    }

    public void cancelSeat(int tripId, int seatNo) {
        boolean isFound = false;
        for (int i = 0; i < bookings.size(); i++) {
            BookingDetails curr_booking = bookings.get(i);
            if (curr_booking.tid == tripId) {
                isFound = true;
                curr_booking.status = BookingStatus.cancelled;
                for (int j = 0; j < trips.size(); j++) {
                    Trip curr_trip = trips.get(j);
                    if (curr_trip.tripId == tripId) {
                        int[] s = curr_trip.busseats;
                        s[seatNo] = 0;
                        curr_trip.AvailableSeats++;
                        break;
                    }
                }
                break;
            }
        }
        if (!isFound) {
            System.out.println("The seat is not cancelled.Because the seat is not booked");
        }
    }

    public void displayBookings() {
        System.out.printf("%15s %10s %10s %30s %15s\n", "User_Name", "Bus_No", "SeatNo", "BookedAt", "status");
        for (int i = 0; i < bookings.size(); i++) {
            BookingDetails curr_Booking = bookings.get(i);
            System.out.printf("%15s %10d %10d %30s %15s\n", curr_Booking.userName, curr_Booking.bus_no,
                    curr_Booking.seat_No, curr_Booking.BookedAt, curr_Booking.status);
        }
    }

    public void registerAUser(String fullname, int age, String username, String password, String phone, String email) {
        boolean isFound = false;
        for (int i = 0; i < registerations.size(); i++) {
            UserRegister curr_Register = registerations.get(i);
            if (curr_Register.userName.equals(username)) {
                isFound = true;
                System.out.println("User name is already exist. Please give unique userName");
                break;
            }
        }
        if (!isFound) {
            UserRegister u1 = new UserRegister();
            u1.fullName = fullname;
            u1.age = age;
            u1.userName = username;
            u1.password = password;
            u1.phone = phone;
            u1.email = email;
            registerations.add(u1);
            System.out.println("Successfully Registered");
        }
    }

    public boolean userLogin(String username, String Password) {
        boolean isFound = false;
        for (int i = 0; i < registerations.size(); i++) {
            UserRegister curr_Registeration = registerations.get(i);
            if (curr_Registeration.userName.equals(username) && curr_Registeration.password.equals(Password)) {
                isFound = true;
                curr_user = username;
            }
        }
        return isFound;
    }

}
