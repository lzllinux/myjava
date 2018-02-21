package day2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

class simpleDate {

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/**
		 * SimpleDateFormat
		 */
		Date now = new Date();
		SimpleDateFormat sdf = 
		new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	String str = sdf.format(now);
	System.out.println(str);
	long time = now.getTime();
	time += 48954644;
	now.setTime(time);
	System.out.println(sdf.format(now));
	Date dat = null;
	try {
		dat = sdf.parse(str);
	} catch (ParseException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	System.out.println(dat);
	

}}
