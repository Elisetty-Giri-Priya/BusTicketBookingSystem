// import java.time.LocalDate;
import java.time.LocalDateTime;

public class Trip {
    public int tripId;
    public LocalDateTime departureTime;
    // public LocalDate departure_date=departureTime.toLocalDate();
    public LocalDateTime arrivalTime;
    // public LocalDate arrival_date=arrivalTime.toLocalDate();
    public String source;
    public String destination;
    public int busno;
    public int[] busseats; 
    public int AvailableSeats;

    static public int travel_seats=21;
    static public int express_seats=31;

} 
