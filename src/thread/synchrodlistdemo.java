package thread;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class synchrodlistdemo {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("one");
		list.add("one");
		list.add("one");
		list.add("one");
		System.out.println(list);
		//תΪ�̰߳�ȫ�ļ���
		list = Collections.synchronizedList(list);
		
	}
	
}
