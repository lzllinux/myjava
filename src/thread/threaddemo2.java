package thread;

import java.text.SimpleDateFormat;
import java.util.Date;

public class threaddemo2 {

	
	//线程优先级
	public static void main(String[] args) throws InterruptedException {
		while(true) {
			Date now = new Date();
			//System.out.println(now);
			SimpleDateFormat sdf = 
			new SimpleDateFormat("HH:mm:ss");
			String str = sdf.format(now);
			System.out.println(str);
			
			Thread.sleep(1000);
		}
		
		
		
		
		
	}
	
}
