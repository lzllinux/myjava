package day4;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

import org.w3c.dom.css.ElementCSSInlineStyle;

public class colllection {
	public static void main(String[] args) {
/**
 * 创建集合
 */
	Collection c = new ArrayList();
	//添加元素
	c.add("java");
	c.add("c");
	System.out.println("元素个数为"+c.size());
	//删除元素
	c.remove("c");
	System.out.println("元素个数为"+c.size());
	//集合中是否包含某一元素
	System.out.println(c.contains("java"));
	Collection book = new ArrayList();
	book.add("java");
	book.add("python");
	//输出全部集合元素
	System.out.println(book);
	//检验A集合是否包含B集合
	System.out.println(c.containsAll(book));
	//用A集合减去B集合
	c.removeAll(book);
	System.out.println(c);
	System.out.println(book);
	c.clear();//清空集合
	book.retainAll(c);//把c集合的内容复制到集合book中
	book.add("php");
	book.add("java");
	/**
	 * Lambada表达式
	 */
	book.forEach(obj -> System.out.println(obj));
	//得到迭代器

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
