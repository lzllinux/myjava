package swingdemo;

import java.awt.Dimension;
import java.awt.Rectangle;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;
import javax.swing.SwingConstants;
import javax.swing.UIManager;

public class demo1 extends JFrame{
	//定义按钮
	JButton jb1 = new JButton("b1");
	JButton jb2 = new JButton("b2");
	//定义容器
	JPanel jP = new JPanel();
	//定义标签
	JLabel usernamelabel = new JLabel("username");
	JLabel passwordlabel = new JLabel("password");
	JLabel commentslabel = new JLabel("comments");
	//定义文本框
	JTextField username = new JTextField(10);
	JPasswordField password = new JPasswordField(6);
	JTextArea comments = new JTextArea(4,15);
	
	
	public demo1()
	{
		setTitle("fiuas");
		//退出时关闭jvm
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLookAndFeel();
		//定义图片对象
		ImageIcon jb3 = new ImageIcon("jb1.jpg");
		//把图标对象添加到按钮
		JButton jb3image = new JButton(jb3);
		jb1.setBounds(0, 0, 50, 50);
		//设置文本换行
		comments.setLineWrap(true);
		comments.setWrapStyleWord(false);
		add(jb1);
		jP.add(jb2);
		jP.add(jb3image);
		//添加标签和文本框
		jP.add(usernamelabel);
		jP.add(username);
		jP.add(passwordlabel);
		jP.add(password);
		jP.add(commentslabel);
		jP.add(comments);
		//设置按钮jb1不可用
		//jb1.setEnabled(false);
		//jb1.setSize(13,55);
		//添加滚动窗体
		JScrollPane scroll = new JScrollPane(comments,
	            ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS,
	            ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		jP.add(scroll);
		add(jP);
		pack();
		setVisible(true);
	}
	/*
	 * 改变窗口风格
	 */
	public static void setLookAndFeel()
	{
		try {
			UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	public static void main(String[] args) {
		setLookAndFeel();
		demo1 jf = new demo1();
		//jf.setSize(new Dimension());==jf.setSize();
		//jf.setBounds(new Rectangle(500, 500, 500, 55));
		//jf.setSize(300,100);
		
	}
	
}
