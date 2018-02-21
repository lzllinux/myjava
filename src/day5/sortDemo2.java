package day5;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class sortDemo2 {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("java");
		list.add("tom");
		list.add("merry");
		list.add("Lady gaga");
		list.add("kobe");
		Collections.sort(list,new MyComparator());
		System.out.println(list);
		 Comparator<String> com1 = new Comparator<String>() {
			
			@Override
			public int compare(String o1, String o2) {
				// TODO Auto-generated method stub
				return o1.length()-o2.length();
			}
		};
		
	}
}
/**
 * 定义额外的比较器
 * @author Administrator
 *
 */
class MyComparator implements Comparator<String>
{

	@Override
	public int compare(String o1, String o2) {
		/**
		 * 
		 */
		return o1.length()-o2.length();
	}
	
}