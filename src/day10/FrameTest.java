package day10;
import java.awt.*;
public class FrameTest {
	public static void main(String[] args) {
		Frame f = new Frame("窗口");
		//新建组建
		Panel p = new Panel();
		p.add(new TextField(20));
		p.add(new Button("单击我"));
		//将panel容器添加到Frame窗口中
		f.add(p);
		f.setBounds(300,250,300,250);
		f.setVisible(true);
	}
}
