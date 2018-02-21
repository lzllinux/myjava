package day10;

import java.awt.Button;
import java.awt.Frame;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

public class griderbag {
	private Frame f = new Frame();
	private GridBagLayout gb = new GridBagLayout();
	private GridBagConstraints gbc = new GridBagConstraints();
	private Button[] bs = new Button[10];
	public void init()
	{
		f.setLayout(gb);
		for(int i=0;i<10;i++)
		{
			bs[i]=new Button("°´Å¥"+i);
		}
		gbc.fill = GridBagConstraints.SOUTH;
		gbc.weightx = 1;
		gbc.gridheight = 2;
		addButton(bs[0]);
		addButton(bs[1]);
		addButton(bs[2]);
		gbc.gridwidth = GridBagConstraints.REMAINDER;
		addButton(bs[0]);
		
		
		
		
		
		
		f.pack();
		f.setVisible(true);
	}
	public void addButton(Button button)
	{
		gb.setConstraints(button, gbc);
		f.add(button);
	}
	public static void main(String[] args) {
		new griderbag().init();
	}
}
