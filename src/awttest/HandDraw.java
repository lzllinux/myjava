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

	//���û������
	private final int AREA_WIDTH = 5000;
	private final int AREA_HEIHT = 4000;
	//�����������
	private int perX = 0;
	private int perY = 0;
	
	//�����Ҽ��˵�
	PopupMenu pop = new PopupMenu();
	MenuItem redItem = new MenuItem("��ɫ");
	MenuItem greenItem = new MenuItem("��ɫ");
	MenuItem blueItem = new MenuItem("��ɫ");
	
	//����BufferImage����
	
	BufferedImage image = new BufferedImage(AREA_WIDTH, AREA_HEIHT, BufferedImage.TYPE_INT_ARGB_PRE);
	//��ȡimage����
	Graphics g = image.getGraphics();
	//���廭����ɫ
	
	private Color forecolor = new Color(255,0,0);
	//���崰��
	private DrawCanvas drawArea = new DrawCanvas();
	private Frame f = new Frame("����");
	
	public void init()
	{
		//�����Ҽ��˵��¼���������
		
		ActionListener menulistener = new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {

				if (e.getActionCommand().equals("��ɫ")) {
					forecolor = new Color(255, 0, 0);
				}
				if (e.getActionCommand().equals("��ɫ")) {
					forecolor = new Color(0, 255, 0);
				}
				if (e.getActionCommand().equals("��ɫ")) {
					forecolor = new Color(0, 0, 255);
				}
			}
		};
		//Ϊ�˵�����¼�������
		redItem.addActionListener(menulistener);
		greenItem.addActionListener(menulistener);
		blueItem.addActionListener(menulistener);
		//��ϲ˵�
		pop.add(blueItem);
		pop.add(greenItem);
		pop.add(redItem);
		//���˵���ӵ�drawArea������
		drawArea.add(pop);
		//��image���󱳾���Ϊ��ɫ
		g.fillRect(0, 0, AREA_WIDTH, AREA_HEIHT);
		//��������ƶ�����
		
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
		
		
		
		//��������¼�
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
