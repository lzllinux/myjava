package day9;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class OOsdemo {
	public static void main(String[] args) throws IOException {
		Person p= new Person();
		p.setName("hfias");
		p.setAge(17);
		p.setGender("nan");
		List<String> otherInfo = new ArrayList<String>();
		otherInfo.add("gt");
		otherInfo.add("linux");
		otherInfo.add("qt");
		p.setOtherInof(otherInfo);
		FileOutputStream fos = new FileOutputStream("person.obj");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(p);
		System.out.println("–¥»ÎÕÍ±œ");
		oos.close();
	}
}
