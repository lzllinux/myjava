package day8;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class copydemo {
	public static void main(String[] args) throws IOException {
		RandomAccessFile cpye= new RandomAccessFile("xyz.avi", "r");
		RandomAccessFile newcpye = new RandomAccessFile("a", "rw");
		int d=-1;
		while((d=cpye.read())!=-1)
		{
			newcpye.write(d);
		}
		System.out.println("¸´ÖÆÍê±Ï");
		cpye.close();
		newcpye.close();
	}
}
