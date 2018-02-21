package day10;

public class Threaddemo2 {
	public static void main(String[] args) {
		
		 new Thread() {
			public void run()
			{
				for(int i=0;i<10;i++)
				{
					System.out.println("hg");
				}
			}
		}.start();
		Thread main = Thread.currentThread();
		System.out.println(main);
		
		
		
		
		
		
		
		
		
	}
}
