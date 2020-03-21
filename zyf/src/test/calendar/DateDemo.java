package test.calendar;

import java.util.Date;

public class DateDemo {
	public static void main(String[] args) {
		Date date = new Date();
		int day = date.getDay();
		int hour = date.getHours();
		//date.parse(s);
		System.out.println(hour);
		System.out.println(day);
		System.out.println(date);
		
	}
}
