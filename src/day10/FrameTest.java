package day10;
import java.awt.*;
public class FrameTest {
	public static void main(String[] args) {
		Frame f = new Frame("����");
		//�½��齨
		Panel p = new Panel();
		p.add(new TextField(20));
		p.add(new Button("������"));
		//��panel������ӵ�Frame������
		f.add(p);
		f.setBounds(300,250,300,250);
		f.setVisible(true);
	}
}
