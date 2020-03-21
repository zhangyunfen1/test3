package test.calendar;

import java.util.Calendar;
import java.util.Date;

public class CalendarDemo {
	public static void main(String[] args) {
		Calendar currentTime = Calendar.getInstance();
//		int year = currentTime.get(Calendar.YEAR);
//		System.out.println(year);
//		int month = currentTime.get(Calendar.MONTH);
//		System.out.println(month);
//		int date = currentTime.get(Calendar.DAY_OF_MONTH);
//		System.out.println(date);
//		int hour = currentTime.get(Calendar.HOUR_OF_DAY);
//		System.out.println(hour);
//		int minute = currentTime.get(Calendar.MINUTE);
//		System.out.println(minute);
//		System.out.println(year+"年"+(month+1)+"月"+date+"日"+hour+"时"+minute+"分");
//		int m = currentTime.get(Calendar.AM_PM);
//		System.out.println(m);
//		currentTime.add(Calendar.YEAR,5);
//		int year1 = currentTime.get(Calendar.YEAR);
//		System.out.println(year1);
		int day = currentTime.getFirstDayOfWeek();
		int year2 = currentTime.getActualMaximum(Calendar.YEAR);
		System.out.println(year2);
		//currentTime.after(when)
		int year = currentTime.getMaximum(Calendar.HOUR_OF_DAY);
		int day1 = currentTime.getMaximum(Calendar.DAY_OF_WEEK);
		System.out.println(day1);
		System.out.println(year);
		System.out.println(day);
	}


}
