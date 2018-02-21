package day8;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class CopyeDome2 {
	public static void main(String[] args) throws IOException {
		RandomAccessFile copy = new RandomAccessFile("a","r");
		RandomAccessFile newcopy = new RandomAccessFile("b", "rw");
		byte[] buf = new byte[1024*10];
		int len = -1; 
		while((len = copy.read(buf))!=-1)
		{
			newcopy.write(buf,0,len);
		}
		System.out.println("–¥»ÎÕÍ±œ");
		copy.close();
		newcopy.close();
	}
}
