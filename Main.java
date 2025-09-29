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
                    int age = sc.nextInt();
                    System.out.println("Enter your User Name");
                    sc.nextLine();
                    String us = sc.nextLine();
                    System.out.println("Enter your password");
                    String ps = sc.nextLine();
                    System.out.println("Enter your phone");
                    String ph = sc.nextLine();
                    System.out.println("Enter your emailId");
                    String email = sc.nextLine();
                    b1.registerAUser(fn, age, ps, us, ph, email);
                    break;
                case 2:
                    System.out.println("Enter your user Name");
                    sc.nextLine();
                    String usn = sc.nextLine();
                    System.out.println("Enter your passWord");
                    String psw = sc.nextLine();
                    boolean isfound = b1.userLogin(usn, psw);
                    if (isfound) {
                        System.out.println("Successfully Logined");
                        while (true) {
                            System.out.println("3.List Buses");
                            System.out.println("4.Search Buses");
                            System.out.println("5.Search Seats");
                            System.out.println("6.Display Seats");
                            System.out.println("7.Booking seats");
                            System.out.println("8.Cancel Seat");
                            System.out.println("9.Diplay bookings");
                            System.out.println("Enter your Option:");
                            int Option = sc.nextInt();
                            switch (Option) {

                                case 3:
                                    b1.listBuses();
                                    break;
                                case 4:
                                    System.out.println("From:");
                                    sc.nextLine();
                                    String Source = sc.nextLine();
                                    // sc.nextLine();
                                    System.out.println("To:");
                                    String Destination = sc.nextLine();
                                    b1.searchBuses(Source, Destination);
                                    break;
                                case 5:

                                    System.out.println("Bus N0:");
                                    int busNo = sc.nextInt();
                                    b1.searchSeats(busNo);
                                    break;
                                case 6:
                                    System.out.println("Bus No:");
                                    int num = sc.nextInt();
                                    b1.displaySeats(num);

                                    break;
                                case 7:
                                    System.out.println("Enter your UserName:");
                                    sc.nextLine();
                                    String uname = sc.nextLine();
                                    System.out.println("Bus No:");
                                    int bno = sc.nextInt();
                                    b1.displaySeats(bno);
                                    System.out.println("Enter your seat number:");
                                    int sno = sc.nextInt();
                                    b1.bookSeat(uname, bno, sno);
                                    break;
                                case 8:
                                    System.out.println("Enter your UserName:");
                                    sc.nextLine();
                                    String usname = sc.nextLine();
                                    System.out.println("Bus No:");
                                    int Cbno = sc.nextInt();
                                    // b1.displaySeats(Cbno);
                                    System.out.println("Enter your seat number:");
                                    int Csno = sc.nextInt();
                                    b1.cancelSeat(usname, Cbno, Csno);
                                    break;
                                case 9:
                                    b1.displayBookings();

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
