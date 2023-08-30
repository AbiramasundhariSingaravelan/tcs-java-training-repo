import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class LocaDateDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LocalDate today=LocalDate.now();
		//2023-08-30
		LocalDate yesterday=today.minusDays(1);
		LocalDate tomorrow=today.plusDays(1);
		LocalDate checkleapYear=LocalDate.of(2017, 1, 13);
		LocalDate checkLeapYear1=LocalDate.of(2016, 9, 23);
		String todayStr=today.format(DateTimeFormatter.ISO_DATE);
		String leapYearStr=checkleapYear.format(DateTimeFormatter.ISO_DATE);
		System.out.println("Today's Date: "+today);
		System.out.println("Yesterday's Date: "+yesterday);
		System.out.println("Tomorrow's Date: "+tomorrow);
		System.out.println("2017 is a leap year : " +checkleapYear.isLeapYear());
		System.out.println("2016 is a leap year : "+checkLeapYear1.isLeapYear());
		System.out.println("Today's Date into String: "+todayStr);
		System.out.println("Leap Year Date into String: "+leapYearStr);
	}

}
