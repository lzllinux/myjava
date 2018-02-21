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
	//定义按钮
	Button ok = new Button("确认");
	CheckboxGroup cbg = new CheckboxGroup();
	//定义单选框
	Checkbox male = new Checkbox("nan", cbg,true);
	Checkbox female =  new Checkbox("nv",cbg,false);
	Checkbox married = new Checkbox("是否已婚？" ,cbg, false);
	//定义下拉框
	Choice colorChooser = new Choice();
	//定义列表选择框
	List colorList = new List(6,true);
	//定义文本框
	TextArea ta = new TextArea(5,20);
	TextField name = new TextField(50);
	
	public void  init()
	{
		colorChooser.add("fihr");
		colorChooser.add("fih");
		colorChooser.add("fig");
		colorChooser.add("fir");
		colorChooser.add("fire");
		//创建文本框按钮
		Panel botton = new Panel();
		botton.add(name);
		botton.add(ok);
		f.add(botton,BorderLayout.SOUTH);
		// 创建一个装载了下拉选择框、三个Checkbox的Panel
		Panel checkPanel = new Panel();
		checkPanel.add(colorChooser);
		checkPanel.add(male);
		checkPanel.add(female);
		checkPanel.add(married);
		
		// 创建一个垂直排列组件的Box，盛装多行文本域、Panel
		Box topLeft = Box.createVerticalBox();
		topLeft.add(ta);
		topLeft.add(checkPanel);
		
		// 创建一个水平排列组件的Box，盛装topLeft、colorList
		Box top = Box.createHorizontalBox();
		top.add(topLeft);
		top.add(colorList);
				// 将top Box容器添加到窗口的中间
				f.add(top);
		f.pack();
		f.setVisible(true);
	}
	
	public static void main(String[] args) {
		new commoncomponent().init();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

