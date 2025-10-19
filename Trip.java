import java.time.LocalDateTime;

public class Trip {
    public LocalDateTime departureTime;
    public LocalDateTime arrivalTime;
    public String source;
    public String destination;
    public int busno;
    public int[] busseats; 
    public int AvailableSeats;

    static public int travel_seats=21;
    static public int express_seats=31;

} 
