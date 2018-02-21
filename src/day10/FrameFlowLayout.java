package day10;

import java.awt.*;

public class FrameFlowLayout {
	public static void main(String[] args) {
		Frame f = new Frame();
		f.setLayout(new FlowLayout(FlowLayout.CENTER, 20, 5));
		for(int i=0;i<10;i++)
		{
			f.add(new Button("°´Å¥"+i));
		}
		f.pack();
		f.setVisible(true);
		
		
	}
}
