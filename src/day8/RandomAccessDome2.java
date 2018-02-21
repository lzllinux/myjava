package day8;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessDome2 {
	public static void main(String[] args) throws IOException {
		RandomAccessFile raf = 
				new RandomAccessFile("l.txt", "rw");
		
		/**
		 * int read()
		 * ¶Áµ½Ä©Î²·µ»Ø-1
		 */
		int d =raf.read();
		System.out.println(d);
		raf.close();
		
		
		
		
		
		
		
	}
}
