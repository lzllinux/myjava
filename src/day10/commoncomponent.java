package day10;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.Choice;
import java.awt.Frame;
import java.awt.List;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.TextField;

import javax.swing.Box;

public class commoncomponent {
	
	Frame f = new Frame();
	//���尴ť
	Button ok = new Button("ȷ��");
	CheckboxGroup cbg = new CheckboxGroup();
	//���嵥ѡ��
	Checkbox male = new Checkbox("nan", cbg,true);
	Checkbox female =  new Checkbox("nv",cbg,false);
	Checkbox married = new Checkbox("�Ƿ��ѻ飿" ,cbg, false);
	//����������
	Choice colorChooser = new Choice();
	//�����б�ѡ���
	List colorList = new List(6,true);
	//�����ı���
	TextArea ta = new TextArea(5,20);
	TextField name = new TextField(50);
	
	public void  init()
	{
		colorChooser.add("fihr");
		colorChooser.add("fih");
		colorChooser.add("fig");
		colorChooser.add("fir");
		colorChooser.add("fire");
		//�����ı���ť
		Panel botton = new Panel();
		botton.add(name);
		botton.add(ok);
		f.add(botton,BorderLayout.SOUTH);
		// ����һ��װ��������ѡ�������Checkbox��Panel
		Panel checkPanel = new Panel();
		checkPanel.add(colorChooser);
		checkPanel.add(male);
		checkPanel.add(female);
		checkPanel.add(married);
		
		// ����һ����ֱ���������Box��ʢװ�����ı���Panel
		Box topLeft = Box.createVerticalBox();
		topLeft.add(ta);
		topLeft.add(checkPanel);
		
		// ����һ��ˮƽ���������Box��ʢװtopLeft��colorList
		Box top = Box.createHorizontalBox();
		top.add(topLeft);
		top.add(colorList);
				// ��top Box������ӵ����ڵ��м�
				f.add(top);
		f.pack();
		f.setVisible(true);
	}
	
	public static void main(String[] args) {
		new commoncomponent().init();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

