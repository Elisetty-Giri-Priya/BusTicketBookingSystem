import java.text.DateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BusBooking b1 = new BusBooking();
        b1.intitialize();
        while (true) {
            System.out.println("1.Register");
            System.out.println("2.Login");
            System.out.println("Enter your Option:");
            int option = Integer.parseInt(sc.nextLine());
            switch (option) {
                case 1:
                    System.out.println("Enter your Full Name");
                    String fn = sc.nextLine();
                    System.out.println("Enter your Age");
                    int age = Integer.parseInt(sc.nextLine());
                    System.out.println("Enter your User Name");
                    String us = sc.nextLine();
                    System.out.println("Enter your password");
                    String ps = sc.nextLine();
                    System.out.println("Enter your phone");
                    String ph = sc.nextLine();
                    System.out.println("Enter your emailId");
                    String email = sc.nextLine();
                    b1.registerAUser(fn, age, us, ps, ph, email);
                    break;
                case 2:
                    System.out.println("Enter your user Name");
                    String usn = sc.nextLine();
                    System.out.println("Enter your passWord");
                    String psw = sc.nextLine();
                    boolean isfound = b1.userLogin(usn, psw);
                    int Option = 0;
                    if (isfound) {
                        System.out.println("Successfully Logined");
                        while (true) {
                            System.out.println("3.List Trips");
                            System.out.println("4.Search Trips");
                            System.out.println("5.Search Seats");
                            System.out.println("6.Display Seats");
                            System.out.println("7.Booking seats");
                            System.out.println("8.Cancel Seat");
                            System.out.println("9.Diplay bookings");
                            System.out.println("10.LogOut");
                            System.out.println("Enter your Option:");
                            Option = Integer.parseInt(sc.nextLine());
                            switch (Option) {

                                case 3:
                                    b1.listTrips();
                                    break;
                                case 4:
                                    System.out.println("Enter date and time (format: yyyy-MM-dd ):");
                                    String input = sc.nextLine();
                                    DateTimeFormatter inputFormat = DateTimeFormatter.ofPattern("yyyy-MM-dd");
                                    LocalDate date = LocalDate.parse(input, inputFormat);
                                    System.out.println("Enter your Source");
                                    String source = sc.nextLine();
                                    System.out.println("Enter your Destination:");
                                    String Destination = sc.nextLine();
                                    b1.searchTrips(date, source, Destination);
                                    break;
                                case 5:
                                    System.out.println("Enter the Trip_id: ");
                                    int id = Integer.parseInt(sc.nextLine());
                                    b1.searchSeats(id);
                                    break;
                                case 6:
                                    System.out.println("Enter the TripId:");
                                    int trid = Integer.parseInt(sc.nextLine());
                                    b1.displaySeats(trid);
                                    break;
                                case 7:
                                    System.out.println("Enter the TripId:");
                                    int tid = Integer.parseInt(sc.nextLine());
                                    b1.displaySeats(tid);
                                    System.out.println("Enter your seat number:");
                                    int sno = Integer.parseInt(sc.nextLine());
                                    b1.bookSeat(tid, sno);
                                    break;
                                case 8:
                                    System.out.println("Enter your Ticket Number: ");
                                    String ticket = sc.nextLine();
                                    b1.cancelSeat(ticket);
                                    break;
                                case 9:
                                    System.out.println("Enter the Trip Id:");
                                    int trip_id = Integer.parseInt(sc.nextLine());
                                    b1.displayBookings(trip_id);
                                    break;
                            }
                            if (Option == 10) {
                                break;
                            }
                        }
                    } else {
                        System.out.println(
                                "Your User Name and password are not matched. Please enter your correct user name and password!");
                        break;
                    }
            }
        }
    }
}
