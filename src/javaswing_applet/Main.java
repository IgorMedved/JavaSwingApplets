package javaswing_applet;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JApplet;
import javax.swing.Timer;


public class Main extends JApplet implements ActionListener {

	private Timer timer;
	
	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		System.out.println("destroy");
	}

	@Override
	public void init() {
		
		timer = new Timer (500,  this);
		timer.start();
		
		setSize(600,500);
		setLayout(new BorderLayout());
		
		add (new Game(), BorderLayout.CENTER);
		System.out.println("init");
	}

	@Override
	public void start() {
		// TODO Auto-generated method stub
		System.out.println("start");
		timer.start();
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		System.out.println("stop");
		timer.stop();
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		System.out.println("Timer is running");
	}

}
