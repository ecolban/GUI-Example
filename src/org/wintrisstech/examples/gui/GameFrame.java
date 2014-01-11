package org.wintrisstech.examples.gui;

import java.awt.BorderLayout;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class GameFrame extends JFrame implements Runnable {

	public static void main(String[] args) {
		SwingUtilities.invokeLater(new GameFrame());
	}

	@Override
	public void run() {
		setTitle("My Game");
		// set the layout and add all the components
		// ...
		// For instance ...
		setPreferredSize(Toolkit.getDefaultToolkit().getScreenSize());
		setLayout(new BorderLayout());
		JPanel gb = new GameBoard();
		add(gb, BorderLayout.CENTER);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		pack();
		setVisible(true);
	}

}
