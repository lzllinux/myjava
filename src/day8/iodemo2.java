package day8;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class iodemo2 {
	public static void main(String[] args) throws IOException {
		FileInputStream fs = new FileInputStream("fos.txt");
		byte[] data = new byte[100];
		int len = fs.read(data);
		String str = new String(data, 0, len,"UTF-8");
		System.out.println(str);
	}
}
