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
		//set �滻Ԫ��
		String two = list.set(1,"2");
		System.out.println(list+two);
		for(int i=0;i<list.size();i++)
		{
			//������ŵ�Ԫ��
			String str = list.get(i);
			System.out.println(str);
		}
		//��ָ��λ�ò���Ԫ��
		list.add(1, "3");
		System.out.println(list);
		List<String> listq = new ArrayList<String>();
		List<String> sublist = list.subList(1, 3);
		System.out.println(sublist);
		System.out.println(list);
		list.subList(0,2).clear();
		System.out.println(list);
		String[] arr= {"java","php"};
		//����ת����
		List<String> list2 = Arrays.asList(arr);
		System.out.println(list2);
		//���ƹ�����
		List<String> li = new ArrayList<String>(list);
		//����list
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
