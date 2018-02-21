package day10;

import day5.map;

public class ThreadDemo1 {
	public static void main(String[] args) {
		
		Mythread1 r1 = new Mythread1();
		Mythread2 r2 = new Mythread2();
		Thread t1 = new Thread(r1);
		Thread t2 = new Thread(r2);
		t1.start();
		t2.start();
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
class Mythread1 implements Runnable{
	public void run()
	{
		for(int i=0;i<1000;i++)
		{
			System.out.println("who are you");
		}
	}
}
class Mythread2 implements Runnable{
	public void run()
	{
		for(int i=0;i<1000;i++)
		System.out.println("who I am");
	}
	

}