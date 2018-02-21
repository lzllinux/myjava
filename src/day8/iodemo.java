package day8;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
//追加读写，加参数true
public class iodemo {
	public static void main(String[] args) throws IOException {
		FileOutputStream fos = new FileOutputStream("fos.txt");
		String str ="加上佛理工过胡搜皮带hi哦";
		byte[] data = str.getBytes("UTF-8");
		
		fos.write(data);
		System.out.println("写入完毕");
		
		fos.close();
		
		
	}
}
