package javaswing_applet;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JApplet;
import javax.swing.Timer;


public class Main extends JApplet implements ActionListener, StartButtonClickListener {

	private Timer mTimer;
	private Game mGame;
	private StartPanel mStartPanel;
	
	@Override
	public void destroy() {
		// TODO Auto-generated method stub
	}

	@Override
	public void init() {
		
		//mGame = new Game();
		mStartPanel = new StartPanel();
		mStartPanel.setListener(this);
		
		
		mTimer = new Timer (20,  this);
		mTimer.start();
		
		setSize(600,500);
		setLayout(new BorderLayout());
		
		add (mStartPanel, BorderLayout.CENTER);
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
		if (mGame!=null)
			mGame.update();
	}

	@Override
	public void onStartButtonClicked() {
		mGame = new Game();
		//remove(mStartPanel);
		add (mGame, BorderLayout.CENTER);
	}

}
