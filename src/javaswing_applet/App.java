package javaswing_applet;

import java.lang.reflect.InvocationTargetException;

import javax.swing.SwingUtilities;

public class App {

	public static void main(String[] args) 
	{
		
		SwingUtilities.invokeLater(()->
		{
			
				MainFrame frame = new MainFrame();
			
		});

	}

}
