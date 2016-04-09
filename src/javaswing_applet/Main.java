package javaswing_applet;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JApplet;
import javax.swing.Timer;


public class Main extends JApplet implements ActionListener, StartButtonClickListener {

	private Timer mTimer;
	private Game mGame;
	private StartPanel mStartPanel;
	private CardLayout mCards;
	
	@Override
	public void destroy() {
		// TODO Auto-generated method stub
	}

	@Override
	public void init() {
		
		mGame = new Game();
		mCards = new CardLayout();
		mStartPanel = new StartPanel();
		mStartPanel.setListener(this);
		
		
		mTimer = new Timer (20,  this);
		mTimer.start();
		
		setSize(600,500);
		setLayout(mCards);
		
		add (mStartPanel, "start");
		add (mGame, "game");
		
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
		mCards.show(getContentPane(), "game");
	}

}
