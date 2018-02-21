package thread;

import javax.print.attribute.standard.MediaName;

public class threaddemo {
	public static void main(String[] args) {
		Thread main = Thread.currentThread();
		long id = main.getId();
		System.out.println("id:"+id);
		
		String name = main.getName();
		System.out.println("name:"+name);
		
		int priority = main.getPriority();
		System.out.println("priority:"+priority);
		
		boolean isAlive = main.isAlive();
		System.out.println(isAlive);
		
		boolean isDaemon = main.isDaemon();
		System.out.println(isDaemon);
		
		
	}
	
	
}
