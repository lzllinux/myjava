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
			
			System.out.println("�ȴ�����");
			Socket socket = server.accept();
			System.out.println("�ͻ���������");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}
	
	public static void main(String[] args) {
		try {
			Server server = new Server();
			server.start();
		} catch (Exception e) {
			System.out.println("����������ʧ��");
		}
	}
	
}
