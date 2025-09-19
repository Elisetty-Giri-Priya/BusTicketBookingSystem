import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BusBooking b1 = new BusBooking();
        b1.intitialize();
        while (true) {
            System.out.println("1.Search Buses");
            System.out.println("2.List Buses");
            System.out.println("3.Search Seats");
            System.out.println("4.Display Seats");
            System.out.println("5.Booking seats");
            System.out.println("6.Seat Cancellation");
            System.out.println("Enter your Option:");
            int option = sc.nextInt();
            switch (option) {
                case 1:
                    System.out.println("From:");
                    sc.nextLine();
                    String Source = sc.nextLine();
                    // sc.nextLine();
                    System.out.println("To:");
                    String Destination = sc.nextLine();
                    b1.searchBuses(Source, Destination);

                    break;
                case 2:
                    b1.listBuses();
                    break;
                case 3:

                    System.out.println("Bus N0:");
                    int busNo = sc.nextInt();
                    b1.searchSeats(busNo);
                    break;
                case 4:
                    System.out.println("Bus No:");
                    int num = sc.nextInt();
                    b1.displaySeats(num);

                    break;
                case 5:
                    System.out.println("Enter your Userid:");
                    int id = sc.nextInt();
                    System.out.println("Bus No:");
                    int bno = sc.nextInt();
                    b1.displaySeats(bno);
                    System.out.println("Enter your seat number:");
                    int sno = sc.nextInt();
                    b1.bookSeat(id, bno, sno);
                    break;
                case 6:
                    System.out.println("Enter your Userid:");
                    int Uid = sc.nextInt();
                    System.out.println("Bus No:");
                    int Cbno = sc.nextInt();
                    // b1.displaySeats(Cbno);
                    System.out.println("Enter your seat number:");
                    int Csno = sc.nextInt();
                    b1.cancelSeat(Uid,Cbno,Csno);
            }
        }
    }
}
