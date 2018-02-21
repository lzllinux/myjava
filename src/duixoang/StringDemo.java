package duixoang;

import java.util.Random;

import javax.xml.ws.LogicalMessage;

class StringDemo {
public static void main(String[] args) {
	String str = "thinking in java";
	/**
	 * ����in���ַ����г��ֵ�λ��
	 */
	int index = str.indexOf("in");
	System.out.println("index:"+index);
	/**
	 * ��ָ��λ�ò���
	 */
	index=str.indexOf("in",3);
	System.out.println("index2:"+index);
	/**
	 * �������һ�γ��ֵ�λ��
	 */
	index = str.lastIndexOf("in");
	System.out.println("index3:"+index);
	/**
	 * substring��ȡ�Ӵ�()fanwei
	 */
	String newstr = str.substring(2,6);
	System.out.println("newstr:"+newstr);
	/**
	 * һ��������ָ��λ������ȡ
	 */
	newstr = str.substring(6);
	System.out.println("newstr:"+newstr);
	/**
	 * trim()ȥ���հ�
	 */
	newstr = str.trim( );
	System.out.println("newstr:"+newstr);
	/**
	 * cahrAt()��ȡ��ǰ�ַ����±���ַ�
	 */
	char newchar = str.charAt(5);
	System.out.println("newchar:"+newchar);
	/**
	 * boolean starts
	 * boolean ends
	 * �ж��ַ�����ʲô��ʼ��β
	 */
	boolean starts = str.startsWith("thin");
	System.out.println(starts);
	boolean ends = str.endsWith("fvha");
	System.out.println(ends);
	/**
	 * ��Сдת��
	 * ��:String toUpperCase()
	 * С:String toLowerCase()
	 */
	String toupperstr = str.toUpperCase();
	System.out.println(toupperstr);
	String lower = str.toLowerCase();
	System.out.println(lower);
	/**
	 * String valueOf();String�ľ�̬����
	 * ����������ת��
	 * String
	 */
	int a = 56;
	String A = String.valueOf(a);
	System.out.println(A);
	/**
	 * StringBuiler�ɱ��ַ���
	 */
	
	String str1 = "java c python";
	/**
	 *��Stringת��ΪStringBuilder
	 *�������вι���
	 *�����޲�������moren��ʾ���ַ���
	 */
	StringBuilder builder = new StringBuilder(str1);
	/**
	 * ʹ��StringBuilder��toString()
	 * str=builder.toString()
	 */
	/**
	 * ׷������
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
	 * ɾ��ָ���ַ���
	 */
	builder.delete(1, 5);
	System.out.println(builder.toString());
	/**
	 * insert(int index,String str)
	 * ��ָ���ַ�������ָ��λ��
	 */
	builder.insert(5, "javajavajava");
	System.out.println(builder.toString());
	/**
	 * reverse()
	 * ��ת�ַ���
	 */
	builder.reverse();
	System.out.println(builder.toString());
	/**
	 * StringBuffer
	 */
	
	char[] arry = {'j','a','v','a'};
	/**
	 * ���ַ�����ƴ�ӳ��ַ���
	 */
	String lineStr=new String(arry,1,3);
	System.out.println(lineStr);
	System.out.println("Random:--------------------");
	System.out.println("�����Random��");
	double value = Math.random();
	System.out.println(value);
	/**
	 * if Random���в��� ��Ϊͬһ����
	 * �����Ҳ��ͬ
	 */
	Random r = new Random();
	int invalue = r.nextInt(100);
	System.out.println(invalue);
	System.out.println("System��");
	/**
	 * ��õ�ǰʱ��ĺ�����
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
	System.out.println("��װ��");
	
	
	System.out.println(Integer.MAX_VALUE);
	Integer i1 =new Integer(12);
	Integer i2 =new Integer("90");
	System.out.println("i1="+i1+"i2+"+i2);
	String in1 = "12";
	/*
	 * ת���ɰ�װ��String����Ҳ����valueOfת��Ϊ�ַ���
	 */
	Integer inclass = new Integer(in1);
	/*
	 * Integer->String
	 */
	String stri1 = i2.toString();
	String stri2 = i1+"";
	String stri3 = String.valueOf(in1);
	System.out.println("װ��");
	int j = 6;
	Integer iclass = j;
	System.out.println("����");
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
	
	
		
	

