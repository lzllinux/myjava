package day8;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
//׷�Ӷ�д���Ӳ���true
public class iodemo {
	public static void main(String[] args) throws IOException {
		FileOutputStream fos = new FileOutputStream("fos.txt");
		String str ="���Ϸ���������Ƥ��hiŶ";
		byte[] data = str.getBytes("UTF-8");
		
		fos.write(data);
		System.out.println("д�����");
		
		fos.close();
		
		
	}
}
