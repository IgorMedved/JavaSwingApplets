package javaswing_applet;

import javax.swing.JPanel;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import javax.swing.JButton;
import java.awt.Insets;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class StartPanel extends JPanel {

	private StartButtonClickListener mListener;
	
	
	public StartPanel() {
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWeights = new double[]{0.0};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0};
		setLayout(gridBagLayout);
		
		JLabel lblSwingAppletDemo = new JLabel("Swing Applet Demo");
		lblSwingAppletDemo.setFont(new Font("Tahoma", Font.PLAIN, 20));
		GridBagConstraints gbc_lblSwingAppletDemo = new GridBagConstraints();
		gbc_lblSwingAppletDemo.anchor = GridBagConstraints.SOUTH;
		gbc_lblSwingAppletDemo.weighty = 0.5;
		gbc_lblSwingAppletDemo.insets = new Insets(0, 0, 5, 0);
		gbc_lblSwingAppletDemo.gridx = 0;
		gbc_lblSwingAppletDemo.gridy = 0;
		add(lblSwingAppletDemo, gbc_lblSwingAppletDemo);
		
		JButton btnStartNewSimulation = new JButton("Start New Simulation");
		btnStartNewSimulation.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (mListener != null)
					mListener.onStartButtonClicked();
			}
		});
		GridBagConstraints gbc_btnStartNewSimulation = new GridBagConstraints();
		gbc_btnStartNewSimulation.insets = new Insets(20, 0, 0, 0);
		gbc_btnStartNewSimulation.anchor = GridBagConstraints.NORTH;
		gbc_btnStartNewSimulation.weighty = 0.5;
		gbc_btnStartNewSimulation.gridx = 0;
		gbc_btnStartNewSimulation.gridy = 1;
		add(btnStartNewSimulation, gbc_btnStartNewSimulation);

	}


	public void setListener(StartButtonClickListener listener) {
		mListener = listener;
		
	}

}
