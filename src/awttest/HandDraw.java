package awttest;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.MenuItem;
import java.awt.PopupMenu;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.awt.image.BufferedImage;

public class HandDraw {

	//设置画区宽度
	private final int AREA_WIDTH = 5000;
	private final int AREA_HEIHT = 4000;
	//定义鼠标坐标
	private int perX = 0;
	private int perY = 0;
	
	//定义右键菜单
	PopupMenu pop = new PopupMenu();
	MenuItem redItem = new MenuItem("红色");
	MenuItem greenItem = new MenuItem("绿色");
	MenuItem blueItem = new MenuItem("蓝色");
	
	//定义BufferImage对象
	
	BufferedImage image = new BufferedImage(AREA_WIDTH, AREA_HEIHT, BufferedImage.TYPE_INT_ARGB_PRE);
	//获取image对象
	Graphics g = image.getGraphics();
	//定义画笔颜色
	
	private Color forecolor = new Color(255,0,0);
	//定义窗口
	private DrawCanvas drawArea = new DrawCanvas();
	private Frame f = new Frame("画画");
	
	public void init()
	{
		//定义右键菜单事件监听武器
		
		ActionListener menulistener = new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {

				if (e.getActionCommand().equals("红色")) {
					forecolor = new Color(255, 0, 0);
				}
				if (e.getActionCommand().equals("绿色")) {
					forecolor = new Color(0, 255, 0);
				}
				if (e.getActionCommand().equals("蓝色")) {
					forecolor = new Color(0, 0, 255);
				}
			}
		};
		//为菜单添加事件监听器
		redItem.addActionListener(menulistener);
		greenItem.addActionListener(menulistener);
		blueItem.addActionListener(menulistener);
		//组合菜单
		pop.add(blueItem);
		pop.add(greenItem);
		pop.add(redItem);
		//将菜单添加到drawArea对象中
		drawArea.add(pop);
		//将image对象背景改为白色
		g.fillRect(0, 0, AREA_WIDTH, AREA_HEIHT);
		//监听鼠标移动动作
		
		drawArea.addMouseMotionListener(new MouseMotionAdapter()
		{
			public void mouseDragged(MouseEvent e)
			{
				if(perX >0 && perY >0)
				{
					g.setColor(forecolor);
					g.drawLine( perX, perY, e.getX(), e.getY());
					
				}
				
				perX = e.getX();
				perY = e.getY();
				drawArea.repaint();
			}
			
		});
		
		
		
		//监听鼠标事件
		drawArea.addMouseListener(new MouseAdapter()
		{
			
			public void mouseReleased(MouseEvent e)
			{
				if(e.isPopupTrigger())
				{
					pop.show(drawArea, e.getX(), e.getY());
				}
				perX = -1;
				perY = -1;
			}
		});
		f.add(drawArea);
		f.pack();
		f.setVisible(true);
		
		
	}
	public static void main(String[] args) {
		new HandDraw().init();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	class DrawCanvas extends Canvas{
		public void paint(Graphics g)
		{
			g.drawImage(image, 0, 0, null);
		}
	}
	
	
	
	
	
	
	
}
