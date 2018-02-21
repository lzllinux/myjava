package day8;

import java.io.File;
import java.io.FileFilter;

public class file {
	public static void main(String[] args) {
		File dir = new File(".");
		//¹ýÂËÆ÷
		File[] subs = dir.listFiles(new FileFilter() {
			
			@Override
			public boolean accept(File file) {
				// TODO Auto-generated method stub
				
				return file.getName().startsWith(".");
			}
		});
		for(File sub : subs)
		{
			System.out.println(sub.getName());
		}
	
	
	}
}
