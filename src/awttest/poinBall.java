package awttest;

import java.util.Random;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class poinBall {

	//�����Ⱥ͸߶�
	private final int TABLE_WIDTH = 300;
	private final int TABLE_HEIGHT = 400;
	//���ĵĴ�ֱλ��
	private final int RACKET_Y = 340;
	//���ĵĸ߶ȺͿ��
	private final int RACKET_HEIGHT = 20;
	private final int RACKET_WIDTH = 60;
	//С��Ĵ�С
	private final int BALL_SIZE = 16;
	private Frame f = new Frame("ball_game");
	//���������
	Random rand = new Random();
	//С��������ٶ�
	private int ySpeed = 10;
	//����-0.5~0.5֮��ı���
	private double xyRate = rand.nextDouble() - 0.5;
	//С������ٶ�
	private int xSpeed = (int)(ySpeed*xyRate*2);
	//����С������
	private int ballX = rand.nextInt(200) + 20;
	private int ballY = rand.nextInt(10) + 20;
	//racketX�������ĵ�ˮƽ����
	private int racketX = rand.nextInt(200);
	private MyCanvas tableArea = new MyCanvas();
	Timer timer;
	//��Ϸ������־
	private boolean isLose = false;
	
	public void init()
	{
		
		//����zhuomain��Ѵ�С
		tableArea.setPreferredSize(new Dimension(TABLE_WIDTH, TABLE_HEIGHT));
		f.add(tableArea);
		//ʹ�������ڲ��ඨ����̼�����
		
		
			KeyAdapter keyProcessor = new KeyAdapter()
			{
				public void keyPressed(KeyEvent ke)
				{
					// �����������Ҽ�ʱ������ˮƽ����ֱ���١�����
					if (ke.getKeyCode() == KeyEvent.VK_LEFT)
					{
						if (racketX > 0)
						racketX -= 10;
					}
					if (ke.getKeyCode() == KeyEvent.VK_RIGHT)
					{
						if (racketX < TABLE_WIDTH - RACKET_WIDTH)
						racketX += 10;
					}
				}
			};
		
		//����¼�������
		f.addKeyListener(keyProcessor);
		tableArea.addKeyListener(keyProcessor);
		
		ActionListener taskPerformer = new ActionListener() {
			
			
			public void actionPerformed(ActionEvent e) {
				
			
				//���С���������
				if(ballX <= 0 || ballX >= TABLE_WIDTH - BALL_SIZE)
				{
					xSpeed -= xSpeed;
				}
				
				if (ballY >= RACKET_Y - BALL_SIZE &&
						(ballX < racketX || ballX > racketX + RACKET_WIDTH))
					{
						timer.stop();
						// ������Ϸ�Ƿ���������Ϊtrue��
						isLose = true;
						tableArea.repaint();
					}
					// ���С��λ������֮�ڣ��ҵ�������λ�ã�С�򷴵�
					else if (ballY  <= 0 ||
						(ballY >= RACKET_Y - BALL_SIZE
							&& ballX > racketX && ballX <= racketX + RACKET_WIDTH))
					{
						ySpeed = -ySpeed;
					}
					// С����������
					ballY += ySpeed;
					ballX += xSpeed;
					tableArea.repaint();
				}
				
			};
		timer = new Timer(100, taskPerformer);
		timer.start();
		f.pack();
		f.setVisible(true);
		
	}	
	public static void main(String[] args)
	{
	new poinBall().init();
	}
				
			
		
		
	
	
	class MyCanvas extends Canvas
	{
		// ��дCanvas��paint������ʵ�ֻ滭
		public void paint(Graphics g)
		{
			// �����Ϸ�Ѿ�����
			if (isLose)
			{
				g.setColor(new Color(255, 0, 0));
				g.setFont(new Font("Times" , Font.BOLD, 30));
				g.drawString("��Ϸ�ѽ�����" , 50 ,200);
			}
			// �����Ϸ��δ����
			else
			{
				// ������ɫ��������С��
				g.setColor(new Color(240, 240, 80));
				g.fillOval(ballX , ballY , BALL_SIZE, BALL_SIZE);
				// ������ɫ������������
				g.setColor(new Color(80, 80, 200));
				g.fillRect(racketX , RACKET_Y
					, RACKET_WIDTH , RACKET_HEIGHT);
			}
		}
	}
}