package day8;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessFiledemo {
	public static void main(String[] args) throws IOException {
		//Raf����ָ���ȡ
		RandomAccessFile raf = 
		new RandomAccessFile("l.txt", "rw");
		raf.write(97);
		raf.close();
	}
}
