package chat;

import java.net.Socket;

public class Client {

	private Socket socket;
	public Client()throws Exception
	{
		System.out.println("java");
		socket = new Socket("localhost", 8080);
		System.out.println("与服务端建立连接");
	}
	//启动客户端
	public void start(){
		
	}
	public static void main(String[] args) {
		try {
			Client client = new Client();
			client.start();
			
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("启动失败");
		}
		
		
		
		
		
	}
}
