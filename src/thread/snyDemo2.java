package thread;

public class snyDemo2 {
	public static void main(String[] args) {
		
		Shop shop = new Shop();
		Shop shop1 = new Shop();
		Thread t1 = new Thread() {
			public void run()
			{
				shop1.buy();
			}
		};
		Thread t2 = new Thread() {
			public void run()
			{
				shop.buy();
				
			}
		};
		t1.start();
		t2.start();
		
	}
}
class Shop{
	
	public void buy() {
		
		Thread thread = Thread.currentThread();
		try {
			System.out.println(thread.getName()+"java");
			thread.sleep(5000);
		
			synchronized (new Object()){
				System.out.println(thread.getName()+"php");
				thread.sleep(5000);
				
			}
			
			System.out.println(thread.getName()+"c++");
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
	}
	
	
}