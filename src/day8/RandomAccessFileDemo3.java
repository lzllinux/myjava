package day8;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessFileDemo3 {
	public static void main(String[] args) throws IOException {
		/**
		 * ��д������������
		 */
		RandomAccessFile raf = new RandomAccessFile("q","rw");
		//д��int���ֵ
		int max = Integer.MAX_VALUE;
		raf.write(max>>>24);
		raf.write(max>>>16);
		raf.write(max>>>8);;
		raf.write(max);
		raf.writeInt(max);
		
		long point = raf.getFilePointer();
		System.out.println(point);
		raf.seek(4);
		int x = raf.readInt();
		System.out.println(x);
		raf.close();
		
		
		
		
	}
}
