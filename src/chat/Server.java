package chat;

import java.net.ServerSocket;
import java.net.Socket;

public class Server {

	
	private ServerSocket server;
	
	public Server()throws Exception
	{
		server = new ServerSocket(8085);
		
	}
	
	public void start()
	{
		try {
			
			System.out.println("等待连接");
			Socket socket = server.accept();
			System.out.println("客户端连接了");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}
	
	public static void main(String[] args) {
		try {
			Server server = new Server();
			server.start();
		} catch (Exception e) {
			System.out.println("服务器启动失败");
		}
	}
	
}
