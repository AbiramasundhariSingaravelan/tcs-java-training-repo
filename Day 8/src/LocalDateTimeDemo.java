import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoField;
import java.time.temporal.Temporal;
public class LocalDateTimeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LocalDateTime dateTime=LocalDateTime.now(); 
		LocalDateTime uniqueTime=LocalDateTime.of(2017,2,13,15,50);
		DateTimeFormatter format=DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
		String formattedDateTime=dateTime.format(format);
		Period period=Period.ofDays(20);
		Temporal temp=period.addTo(LocalDate.now());
		System.out.println("Period:" +temp);
		System.out.println("Before Formatting: "+dateTime);
		System.out.println("After Formatting: "+formattedDateTime);
		System.out.println("Day Of the Week: "+uniqueTime.get(ChronoField.DAY_OF_WEEK));
		System.out.println("Day Of the Month: "+uniqueTime.get(ChronoField.DAY_OF_YEAR));
		System.out.println("Day Of the Year: "+uniqueTime.get(ChronoField.DAY_OF_MONTH));
		System.out.println("Hour of the Day: "+uniqueTime.get(ChronoField.HOUR_OF_DAY));
		
		
	
	}

}
