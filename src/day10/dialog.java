package day10;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.FileDialog;
import java.awt.Frame;

public class dialog {
	public static void main(String[] args) {
		Frame f = new Frame();
		Button b1 = new Button("save");
		Button b2 = new Button("load");
		FileDialog d1 = new FileDialog(f, "load", FileDialog.LOAD);
		FileDialog d2 = new FileDialog(f, "save", FileDialog.SAVE);
		b1.addActionListener(e -> {
			d1.setVisible(true);
		});
		b2.addActionListener(e -> {
			d2.setVisible(true);
		});
		f.add(b1);
		f.add(b2,BorderLayout.NORTH);
		f.pack();
		f.setVisible(true);
		
		
	}
}
