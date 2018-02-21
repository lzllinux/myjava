package day8;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class copy {

	public static void main(String[] args) throws IOException {
		FileInputStream copy = new FileInputStream("a");
		FileOutputStream newcopy = new FileOutputStream("m");
		byte[] temp = new byte[1024];
		int len=-1;
		while((len=copy.read(temp))!=-1)
		{
			newcopy.write(temp,0,len);
			
		}
		System.out.println("¸´ÖÆÍê±Ï");
		copy.close();
		newcopy.close();
	}
}
