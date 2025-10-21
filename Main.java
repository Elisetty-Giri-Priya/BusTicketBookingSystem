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
            int option = sc.nextInt();
            switch (option) {
                case 1:
                    System.out.println("Enter your Full Name");
                    sc.nextLine();
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
                    sc.nextLine();
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
                            Option = sc.nextInt();
                            switch (Option) {

                                case 3:
                                    b1.listTrips();
                                    break;
                                case 4:
                                    System.out.println("Enter date and time (format: yyyy-MM-dd ):");
                                    sc.nextLine();
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
                                    // LocalDateTime departuretime, String destination, int Bus_No
                                    System.out.println("Enter date and time (format: yyyy-MM-dd HH:mm):");
                                    sc.nextLine();
                                    String Input = sc.nextLine();
                                    DateTimeFormatter Formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
                                    LocalDateTime date_time = LocalDateTime.parse(Input, Formatter);
                                    System.out.println("Enter your Destination");
                                    String dest = sc.nextLine();
                                    System.out.println("Bus N0:");
                                    int busNo = Integer.parseInt(sc.nextLine());
                                    b1.searchSeats(date_time, dest, busNo);
                                    break;
                                case 6:
                                    // LocalDateTime departuretime, int Bus_no
                                    System.out.println("Enter date and time (format: yyyy-MM-dd HH:mm):");
                                    sc.nextLine();
                                    String in = sc.nextLine();
                                    DateTimeFormatter Format = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
                                    LocalDateTime date_Time = LocalDateTime.parse(in, Format);
                                    System.out.println("Bus No:");
                                    int num = Integer.parseInt(sc.nextLine());
                                    b1.displaySeats(date_Time, num);
                                    break;
                                case 7:
                                    // LocalDateTime departureTime, String Destination, int Bus_no, int seatNo
                                    System.out.println("Enter date and time (format: yyyy-MM-dd HH:mm):");
                                    sc.nextLine();
                                    String inp = sc.nextLine();
                                    DateTimeFormatter format = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
                                    LocalDateTime datetTime = LocalDateTime.parse(inp, format);
                                    System.out.println("Enter your Source");
                                    String Source = sc.nextLine();
                                    System.out.println("Enter your Destination");
                                    String desti = sc.nextLine();
                                    System.out.println("Bus No:");
                                    int bno = Integer.parseInt(sc.nextLine());
                                    b1.displaySeats(datetTime, bno);
                                    System.out.println("Enter your seat number:");
                                    int sno = Integer.parseInt(sc.nextLine());
                                    b1.bookSeat(datetTime, Source, desti, bno, sno);
                                    break;
                                case 8:
                                    System.out.println("Enter date and time (format: yyyy-MM-dd HH:mm):");
                                    sc.nextLine();
                                    String inpu = sc.nextLine();
                                    DateTimeFormatter formatt = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
                                    LocalDateTime datendTime = LocalDateTime.parse(inpu, formatt);
                                    System.out.println("Bus No:");
                                    int Cbno = Integer.parseInt(sc.nextLine());
                                    // b1.displaySeats(Cbno);
                                    System.out.println("Enter your seat number:");
                                    int Csno = Integer.parseInt(sc.nextLine());
                                    b1.cancelSeat(datendTime, Cbno, Csno);
                                    break;
                                case 9:
                                    b1.displayBookings();
                                    break;
                                // case 10:
                                // break;

                            }
                            if (Option == 10) {
                                break;
                            }
                        }
                        // } else if (Option == 10) {
                        // break;
                    } else {
                        System.out.println(
                                "Your User Name and password are not matched. Please enter your correct user name and password!");
                        break;
                    }
            }
        }
    }
}
