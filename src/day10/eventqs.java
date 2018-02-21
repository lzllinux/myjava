package day10;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Frame;
import java.awt.TextField;
import java.awt.event.*;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class eventqs {
	public static void main(String[] args) {
		Frame f = new Frame("ceshi");
		TextField tf = new TextField(20);
		Button b1 = new Button("anniu");
		//定义事件监听器
		class anniulistener implements ActionListener{
			TextField mail;
			//定义事件处理器
			public anniulistener(TextField mail){
				this.mail = mail;
			}
			public void actionPerformed(ActionEvent e) 
			{
				System.out.println("fjo"+mail.getText());
				//tf.setText("java");
			}
		}
		//定义窗口事件
		class mylistener implements WindowListener
		{
//			public void windowClosing(WindoEvent e)
//			{
//				System.exit(0);
//			}

			@Override
			public void windowOpened(WindowEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void windowClosing(WindowEvent e) {
				// TODO Auto-generated method stub
				System.exit(0);
			}

			@Override
			public void windowClosed(WindowEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void windowIconified(WindowEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void windowDeiconified(WindowEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void windowActivated(WindowEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void windowDeactivated(WindowEvent e) {
				// TODO Auto-generated method stub
				
			}
		}
		
		
		
		//注册事件监听器
		f.addWindowListener(new mylistener());
		b1.addActionListener(new anniulistener(tf));
		f.add(tf);
		f.add(b1,BorderLayout.NORTH);
		f.setVisible(true);
		
		
		
		
		
		
		
		
		
		
	}
}
