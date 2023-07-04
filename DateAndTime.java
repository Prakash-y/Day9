package Java8;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class DateAndTime {

	public static void main(String[] args) {
		
		// LocalDate Api 
		LocalDate date = LocalDate.now();
		System.out.println(date);
		
		//Localtime
		LocalTime time = LocalTime.now();
		System.out.println(time);
		
		List<Integer> l1 = new ArrayList<Integer>();
		l1.add(10);
		l1.add(18);
		l1.add(20);
		System.out.println(l1);
		
		l1.forEach((a)->
		System.out.println(a));
		
		
		
	}
}
