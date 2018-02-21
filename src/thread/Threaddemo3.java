package thread;

public class Threaddemo3 {

	
	//设置后台线程
	public static void main(String[] args) {
		Thread java = new Thread() {
			public void run()
			{
				for(int i=0;i<10;i++)
				{
					System.out.println("java");
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				System. out.println("java1");
			}
			
		};
		
		Thread php = new Thread() {
			public void run()
			{
				while(true) {
				System.out.println("php");
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				}
			}
		};
		
		php.setDaemon(true);
		java.start();
		php.start();
		while(true);
		
		
	}
}
