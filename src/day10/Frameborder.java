package day10;
import java.awt.*;
import static java.awt.BorderLayout.*;
public class Frameborder {
	
	public static void main(String[] args) {
		Frame f = new Frame("���Դ���");
		Panel p = new Panel();
		p.add(new TextField(20));
		p.add(new Button("danji"));
		// ����Frame����ʹ��BorderLayout���ֹ�����
		f.setLayout(new BorderLayout(30, 5));
		f.add(new Button("��") , SOUTH);
		f.add(new Button("��") , NORTH);
		f.add(p);
		// Ĭ����ӵ��м�
		//f.add(new Button("��"));
		f.add(new Button("��") , EAST);
		f.add(new Button("��") , WEST);
		// ���ô���Ϊ��Ѵ�С
		f.pack();
		// ��������ʾ������Frame����Ĭ�ϴ�������״̬��
		f.setVisible(true);
		
	}
}
