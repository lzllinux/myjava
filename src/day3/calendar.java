package day3;

import java.util.Calendar;
import java.util.Date;
class calendar{
	public static void main(String[] args) {
		Calendar calendar = Calendar.getInstance();
		System.out.println(calendar);
		/**
		 * calendar Date »¥»»
		 */
		Date date = calendar.getTime();
		System.out.println(date);
		date.setTime(date.getTime()+1000*24*60*60);
		System.out.println(date);
		calendar.setTime(date);
		//System.out.println(calendar.get(DATE));
		calendar.set(Calendar.YEAR, 2008);
		System.out.println(calendar.getTime());
		calendar.set(Calendar.DAY_OF_MONTH, 8);
		System.out.println(calendar.getTime());
		System.out.println(calendar.get(Calendar.YEAR));
		/**
		 * get time fenliang de max
		 */
		int days = calendar.getActualMaximum(Calendar.DAY_OF_MONTH);
		System.out.println(days);
		
	}
}
