package day5;

import java.util.LinkedList;
import java.util.Queue;

public class queue {
public static void main(String[] args) {
	Queue<String> que = new LinkedList<String>();
	que.offer("one");
	que.offer("two");
	que.offer("three");
	que.offer("four");
	System.out.println(que);
	//poll����
	String str = que.poll();
	System.out.println(str);
	System.out.println(que);
	//peekֻ���ã�������
	str = que.peek();
	System.out.println(str);
	System.out.println(que);
	
}
}
