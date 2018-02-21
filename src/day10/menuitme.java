package day10;

import java.awt.CheckboxMenuItem;
import java.awt.Frame;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;
import java.awt.MenuShortcut;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.awt.geom.Area;
import java.lang.reflect.Field;

public class menuitme {
	private Frame f = new Frame("ceshi");
	private MenuBar mb = new MenuBar();
	Menu file = new Menu("File");
	Menu edit = new Menu("edit");
	MenuItem newfile = new MenuItem("新建");
	MenuItem savefile = new MenuItem("保存");
	//添加快捷键
	MenuItem exItem = new MenuItem("exit",new MenuShortcut(KeyEvent.VK_X));
	CheckboxMenuItem autowrap = new CheckboxMenuItem("auto换行");
	Menu format = new Menu("格式");
	MenuItem copyItem = new MenuItem("复制");
	MenuItem pasteItem = new MenuItem("粘贴");
	MenuItem coItem = new MenuItem("复");
	MenuItem paItem = new MenuItem("粘");
	private TextArea ta = new TextArea(6,40);
	public void init()
	{
		
		ActionListener menuListener = new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String cmd = e.getActionCommand();
				ta.append(cmd);
				if(cmd.equals("exit"));
				{
					System.exit(0);
				}
			}
		}; 
		//添加事件
		exItem.addActionListener(menuListener);
		file.add(newfile);
		file.add(savefile);
		file.add(exItem);
		edit.add(autowrap);
		edit.add(copyItem);
		edit.add(pasteItem);
		format.add(paItem);
		format.add(coItem);
		//形成二级菜单
		edit.add(format);
		mb.add(edit);
		mb.add(file);
		f.setMenuBar(mb);
		f.addWindowListener(new WindowListener() {
			
			
			
			@Override
			public void windowClosing(WindowEvent e) {
				// TODO Auto-generated method stub
				System.exit(0);
			}

			@Override
			public void windowOpened(WindowEvent e) {
				// TODO Auto-generated method stub
				
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
			
			
		});
		f.add(ta);
		f.pack();
		f.setVisible(true);
	
	}
	public static void main(String[] args) {
		new menuitme().init();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
