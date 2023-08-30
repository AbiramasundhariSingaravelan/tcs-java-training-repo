import java.time.LocalTime;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;

public class LocalTimeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LocalTime currentTime=LocalTime.now();
		LocalTime time=LocalTime.of(10,45,12);
		LocalTime startTime=LocalTime.of(10,0,0);//10.00 A.M
		LocalTime endTime=LocalTime.of(11,0,0);//11.00 A.M
		LocalTime maxTime=startTime.plusHours(1);
		LocalTime minTime=endTime.minusHours(1);
		LocalTime addMts=startTime.plusMinutes(20);//10.20 
		LocalTime reduceMts=endTime.minusMinutes(10);
		ZoneId zone1=ZoneId.of("Asia/Kolkata");
		ZoneId zone2=ZoneId.of("Asia/Tokyo");
		LocalTime IndiaTime=LocalTime.now(zone1);
		LocalTime JapanTime=LocalTime.now(zone2);
		long hours=ChronoUnit.HOURS.between(IndiaTime,JapanTime);
		long minutes=ChronoUnit.MINUTES.between(IndiaTime,JapanTime);
		System.out.println("Current Time: "+currentTime);
		System.out.println("Any Specific Time: "+time);
		System.out.println("Exam Duration: "+maxTime +" HR");
		System.out.println("Reduced 1 Hr: "+minTime +" Hr");
		System.out.println("Added Minutes: "+addMts +" Minutes");
		System.out.println("Reduced Minutes: "+reduceMts +" Minutes");
		System.out.println("Current Time in India: "+IndiaTime);
		System.out.println("Current Time in Japan: "+JapanTime);
		System.out.println("Hour Difference b/w Zones: "+hours);
		System.out.println("Minute Difference b/w Zones: "+minutes);
	}
}
