package day2;

import java.util.Date;

class data {
	public static void main(String[] args) {
		Date now = new Date();
		System.out.println(now);
		long time = now.getTime();
		System.out.println(time);
		time += 1000*60*60*24;
		now.setTime(time);
		System.out.println(now);
	}
}
