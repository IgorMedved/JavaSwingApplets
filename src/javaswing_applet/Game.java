package javaswing_applet;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.geom.Ellipse2D;
import java.awt.geom.RoundRectangle2D;
import java.awt.image.BufferedImage;

import javax.swing.JComponent;

public class Game extends JComponent {

	private Ellipse2D.Double mBall = new Ellipse2D.Double(100, 100, 15,15);
	private double mSpeed = 10.0;
	private int mXDirectionBall = 1;
	private int mYDirectionBall = 1;
	
	private BufferedImage mBuffer;
	
	@Override
	protected void paintComponent(Graphics g) 
	{
		if (mBuffer == null)
			mBuffer = new BufferedImage(getWidth(), getHeight(), BufferedImage.TYPE_INT_RGB);
			
		Graphics2D g2 = (Graphics2D)mBuffer.getGraphics();
		
		
		g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
		
		g2.setColor(Color.BLACK);
		g2.fillRect(0, 0, getWidth(), getHeight());
		
		g2.setColor(Color.RED);
		g2.fill(mBall);
		
		g2.setColor(Color.BLUE);
		g2.fill(new RoundRectangle2D.Double(200, 200, 100, 10, 20, 20));
		
		g.drawImage(mBuffer, 0, 0, null);
		
	}
	
	
	
	public void update()
	{
		mBall.x += mXDirectionBall*mSpeed;
		mBall.y += mYDirectionBall*mSpeed;
		
		if (mBall.x < 0)
		{
			mXDirectionBall =1;
			mBall.x = 0;
		}
		else if ( mBall.x > getWidth() - mBall.getBounds().width)
		{
			mXDirectionBall = -1;
			mBall.x = getWidth() - mBall.getBounds().width;
		}
		
		if (mBall.y < 0)
		{
			mYDirectionBall =1;
			mBall.y = 0;
		}
		else if ( mBall.y > getHeight() - mBall.getBounds().height)
		{
			mYDirectionBall = -1;
			mBall.y = getHeight() - mBall.getBounds().height;
		}
		
		repaint();
		
	}



	@Override
	public void update(Graphics g) {
		
		paint(g);
	}
	
	

}
