package com.playground.ttt;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.GraphicsEnvironment;
import java.util.Calendar;

import javax.swing.JFrame;

/**
 * @author DGraf
 *
 */
public class TicTacToe extends JFrame implements Runnable {

	private GamePanel gp;

	public TicTacToe() {
		super();
		this.setPreferredSize(new Dimension(200, 200));
		
		createComponents();
		
		gp.init();
		
		pack();
	}

	private void createComponents() {
		Container p = getContentPane();
		gp = new GamePanel(p);
	}

	public void run() {
		this.setVisible(true);
	}

	private static void checkHeadless() {
		/*
		 * Troubleshooting for finding Headless advice from stack overflow:
		 * https://stackoverflow.com/a/75931990
		 */
		boolean headless = GraphicsEnvironment.isHeadless();
		if (!headless) return;

		System.out.printf("Headless: %s", headless);
		System.out.println();

		/*
		 * Exit gracefully here.
		 * Advice on exiting: https://www.baeldung.com/java-system-exit
		 * Advice on codes: https://tldp.org/LDP/abs/html/exitcodes.html
		 */
		System.exit(ABORT);
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		checkHeadless();
		
		TicTacToe app = new TicTacToe();
		
		EventQueue.invokeLater(app);
		
		System.out.println(Calendar.JANUARY);
	}
}
