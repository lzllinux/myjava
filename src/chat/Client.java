package chat;

import java.net.Socket;

public class Client {

	private Socket socket;
	public Client()throws Exception
	{
		System.out.println("java");
		socket = new Socket("localhost", 8080);
		System.out.println("�����˽�������");
	}
	//�����ͻ���
	public void start(){
		
	}
	public static void main(String[] args) {
		try {
			Client client = new Client();
			client.start();
			
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("����ʧ��");
		}
		
		
		
		
		
	}
}
