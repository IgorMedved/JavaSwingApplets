package javaswing_applet;

import java.awt.CardLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.Timer;

public class MainFrame extends JFrame implements StartButtonClickListener, ActionListener{
	
	private Timer mTimer;
	private Game mGame;
	private StartPanel mStartPanel;
	private CardLayout mCards;
	
	MainFrame()
	{
		super("Animation Demo");
		
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
		
		setSize(800,600);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
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
