/**
 * 
 */
package com.playground.TTT;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.EventQueue;
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

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		TicTacToe app = new TicTacToe();
		
		EventQueue.invokeLater(app);
		
		System.out.println(Calendar.JANUARY);
	}
}
