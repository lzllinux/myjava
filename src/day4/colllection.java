package day4;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

import org.w3c.dom.css.ElementCSSInlineStyle;

public class colllection {
	public static void main(String[] args) {
/**
 * ��������
 */
	Collection c = new ArrayList();
	//���Ԫ��
	c.add("java");
	c.add("c");
	System.out.println("Ԫ�ظ���Ϊ"+c.size());
	//ɾ��Ԫ��
	c.remove("c");
	System.out.println("Ԫ�ظ���Ϊ"+c.size());
	//�������Ƿ����ĳһԪ��
	System.out.println(c.contains("java"));
	Collection book = new ArrayList();
	book.add("java");
	book.add("python");
	//���ȫ������Ԫ��
	System.out.println(book);
	//����A�����Ƿ����B����
	System.out.println(c.containsAll(book));
	//��A���ϼ�ȥB����
	c.removeAll(book);
	System.out.println(c);
	System.out.println(book);
	c.clear();//��ռ���
	book.retainAll(c);//��c���ϵ����ݸ��Ƶ�����book��
	book.add("php");
	book.add("java");
	/**
	 * Lambada���ʽ
	 */
	book.forEach(obj -> System.out.println(obj));
	//�õ�������

	Iterator it = book.iterator();
	while(it.hasNext())
	{
		String books = (String)it.next();
		System.out.println(books);
	}
	book.removeIf(ele -> ((String)ele).length() > 3);
	System.out.println(book);
	String[] ay = (String[]) book.toArray(new String[1]);
	System.out.println(ay.length);
	}

}
