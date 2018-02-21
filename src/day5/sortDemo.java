package day5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class sortDemo {
	public static void main(String[] args) {
		List<point> list =new ArrayList<point>();
		list.add(new point(4,2));
		list.add(new point(1,2));
		list.add(new point(3,2));
		list.add(new point(6,2));
		list.add(new point(9,2));
		list.add(new point(5,2));
		Collections.sort(list);
		System.out.println(list);
		
		
		
	}
}
