package day7;

import java.io.FileWriter;
import java.io.*;
public class newFile {
	public static void main(String[] args) {
		try (
			FileWriter fw = new FileWriter("lzl.txt"))
			{
				fw.write("uagfyaiof\r\n");
				fw.write("filarew");
				
			}
		 catch (Exception e) {
			// TODO: handle exception
		}
	
	}
}
