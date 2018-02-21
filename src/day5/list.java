package day5;

import java.util.List;
import java.util.Random;
import java.util.zip.ZipEntry;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

class list {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list = new ArrayList<String>();
		list.add("one");
		list.add("two");
		list.add("three");
		list.add("foiur");
		//set 替换元素
		String two = list.set(1,"2");
		System.out.println(list+two);
		for(int i=0;i<list.size();i++)
		{
			//返回序号的元素
			String str = list.get(i);
			System.out.println(str);
		}
		//在指定位置插入元素
		list.add(1, "3");
		System.out.println(list);
		List<String> listq = new ArrayList<String>();
		List<String> sublist = list.subList(1, 3);
		System.out.println(sublist);
		System.out.println(list);
		list.subList(0,2).clear();
		System.out.println(list);
		String[] arr= {"java","php"};
		//数组转集合
		List<String> list2 = Arrays.asList(arr);
		System.out.println(list2);
		//复制构造器
		List<String> li = new ArrayList<String>(list);
		//排序list
		List<Integer> list3 =new ArrayList<Integer>();
		Random random = new Random();
		for(int i=0;i<10;i++)
		{
			list3.add(random.nextInt(100));
		}
		System.out.println(list3);
		Collections.sort(list3);
		System.out.println(list3);
		
		
		

	}

}
