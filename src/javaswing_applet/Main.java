package javaswing_applet;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JApplet;
import javax.swing.Timer;


public class Main extends JApplet implements ActionListener {

	private Timer mTimer;
	private Game mGame;
	
	@Override
	public void destroy() {
		// TODO Auto-generated method stub
	}

	@Override
	public void init() {
		
		mGame = new Game();
		
		mTimer = new Timer (20,  this);
		mTimer.start();
		
		setSize(600,500);
		setLayout(new BorderLayout());
		
		add (mGame, BorderLayout.CENTER);
	}

	@Override
	public void start() {
		mTimer.start();
	}

	@Override
	public void stop() {
		mTimer.stop();
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		mGame.update();
	}

}
