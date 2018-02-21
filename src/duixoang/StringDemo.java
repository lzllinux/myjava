package duixoang;

import java.util.Random;

import javax.xml.ws.LogicalMessage;

class StringDemo {
public static void main(String[] args) {
	String str = "thinking in java";
	/**
	 * 返回in在字符串中出现的位置
	 */
	int index = str.indexOf("in");
	System.out.println("index:"+index);
	/**
	 * 从指定位置查找
	 */
	index=str.indexOf("in",3);
	System.out.println("index2:"+index);
	/**
	 * 查找最后一次出现的位置
	 */
	index = str.lastIndexOf("in");
	System.out.println("index3:"+index);
	/**
	 * substring获取子串()fanwei
	 */
	String newstr = str.substring(2,6);
	System.out.println("newstr:"+newstr);
	/**
	 * 一个参数从指定位置往后取
	 */
	newstr = str.substring(6);
	System.out.println("newstr:"+newstr);
	/**
	 * trim()去掉空白
	 */
	newstr = str.trim( );
	System.out.println("newstr:"+newstr);
	/**
	 * cahrAt()获取当前字符串下标的字符
	 */
	char newchar = str.charAt(5);
	System.out.println("newchar:"+newchar);
	/**
	 * boolean starts
	 * boolean ends
	 * 判断字符串以什么开始结尾
	 */
	boolean starts = str.startsWith("thin");
	System.out.println(starts);
	boolean ends = str.endsWith("fvha");
	System.out.println(ends);
	/**
	 * 大小写转换
	 * 大:String toUpperCase()
	 * 小:String toLowerCase()
	 */
	String toupperstr = str.toUpperCase();
	System.out.println(toupperstr);
	String lower = str.toLowerCase();
	System.out.println(lower);
	/**
	 * String valueOf();String的静态方法
	 * 将其他类型转成
	 * String
	 */
	int a = 56;
	String A = String.valueOf(a);
	System.out.println(A);
	/**
	 * StringBuiler可变字符串
	 */
	
	String str1 = "java c python";
	/**
	 *将String转换为StringBuilder
	 *可以用有参构造
	 *可以无参数构造moren表示空字符串
	 */
	StringBuilder builder = new StringBuilder(str1);
	/**
	 * 使用StringBuilder的toString()
	 * str=builder.toString()
	 */
	/**
	 * 追加内容
	 */
	builder.append("hfaishufds");
	System.out.println(builder.toString());
	/**
	 * replace(int start,int end,String str)
	 * 
	 */
	builder.replace(1,8,"hiaewu");
	System.out.println(builder.toString());
	/**
	 * delete(int start,int end)
	 * 删除指定字符串
	 */
	builder.delete(1, 5);
	System.out.println(builder.toString());
	/**
	 * insert(int index,String str)
	 * 将指定字符串插入指定位置
	 */
	builder.insert(5, "javajavajava");
	System.out.println(builder.toString());
	/**
	 * reverse()
	 * 翻转字符串
	 */
	builder.reverse();
	System.out.println(builder.toString());
	/**
	 * StringBuffer
	 */
	
	char[] arry = {'j','a','v','a'};
	/**
	 * 用字符数组拼接成字符串
	 */
	String lineStr=new String(arry,1,3);
	System.out.println(lineStr);
	System.out.println("Random:--------------------");
	System.out.println("随机数Random类");
	double value = Math.random();
	System.out.println(value);
	/**
	 * if Random中有参数 视为同一对象
	 * 随机数也相同
	 */
	Random r = new Random();
	int invalue = r.nextInt(100);
	System.out.println(invalue);
	System.out.println("System类");
	/**
	 * 获得当前时间的毫秒数
	 */
	long startTime = System.currentTimeMillis();
	try {
		Thread.sleep(200);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	long endTime = System.currentTimeMillis();
	System.out.println(endTime-startTime);
	String path = System.getProperty("java.version");
	System.out.println(path);
	System.out.println("包装类");
	
	
	System.out.println(Integer.MAX_VALUE);
	Integer i1 =new Integer(12);
	Integer i2 =new Integer("90");
	System.out.println("i1="+i1+"i2+"+i2);
	String in1 = "12";
	/*
	 * 转换成包装类String传入也可以valueOf转换为字符串
	 */
	Integer inclass = new Integer(in1);
	/*
	 * Integer->String
	 */
	String stri1 = i2.toString();
	String stri2 = i1+"";
	String stri3 = String.valueOf(in1);
	System.out.println("装箱");
	int j = 6;
	Integer iclass = j;
	System.out.println("拆箱");
	Integer iclass1 = new Integer(5);
	int i = iclass1;
	Integer ii1 = Integer.valueOf(12);
	Integer ii2 = Integer.valueOf(12);
	System.out.println(ii1==ii2);
	int ii3 = ii1.intValue();
	String tri1 = "123";
	int ii4 = Integer.parseInt(stri1);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
	
	
		
	

