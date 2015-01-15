package com.playground.TTT;

import static java.awt.GridBagConstraints.CENTER;
import static java.awt.GridBagConstraints.NONE;
import static java.awt.GridBagConstraints.NORTH;
import static java.awt.GridBagConstraints.WEST;

import java.awt.Component;
import java.awt.Container;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class GamePanel extends JPanel {
	
	private JButton oneButton;
	private JButton twoButton;
	private JButton threeButton;
	private JButton fourButton;
	private JButton fiveButton;
	private JButton sixButton;
	private JButton sevenButton;
	private JButton eightButton;
	private JButton nineButton;
	private GridBagConstraints gbc;
	
	private ButtonListener bListener;
	private JLabel playerLabel;
	private JLabel turnLabel;

	public GamePanel(Container p) {
		super();
		
		createComponents();
		
		GridBagLayout gbl = new GridBagLayout();
		setLayout(gbl);
		setBorder(BorderFactory.createEtchedBorder());
		
		gbc = new GridBagConstraints();
		gbc.insets = new Insets(2, 2, 2, 2);
		
		bListener = new ButtonListener(playerLabel, turnLabel);
		
		addListeners();
		
		p.add(this);
	}

	private void createComponents() {
		playerLabel = new JLabel("Player X turn.");
		oneButton = new JButton(" ");
		twoButton = new JButton(" ");
		threeButton = new JButton(" ");
		fourButton = new JButton(" ");
		fiveButton = new JButton(" ");
		sixButton = new JButton(" ");
		sevenButton = new JButton(" ");
		eightButton = new JButton(" ");
		nineButton = new JButton(" ");
		turnLabel = new JLabel(ButtonListener.TURN + "0");
	}
	
	private void addListeners() {
		oneButton.addActionListener(bListener);
		twoButton.addActionListener(bListener);
		threeButton.addActionListener(bListener);
		fourButton.addActionListener(bListener);
		fiveButton.addActionListener(bListener);
		sixButton.addActionListener(bListener);
		sevenButton.addActionListener(bListener);
		eightButton.addActionListener(bListener);
		nineButton.addActionListener(bListener);
	}
	
	public void init() {
		addComponent(0, 0, 3, 1, NONE, NORTH, this, playerLabel);
		addComponent(0, 1, 1, 1, NONE, CENTER, this, oneButton);
		addComponent(1, 1, 1, 1, NONE, CENTER, this, twoButton);
		addComponent(2, 1, 1, 1, NONE, CENTER, this, threeButton);
		addComponent(0, 2, 1, 1, NONE, CENTER, this, fourButton);
		addComponent(1, 2, 1, 1, NONE, CENTER, this, fiveButton);
		addComponent(2, 2, 1, 1, NONE, CENTER, this, sixButton);
		addComponent(0, 3, 1, 1, NONE, CENTER, this, sevenButton);
		addComponent(1, 3, 1, 1, NONE, CENTER, this, eightButton);
		addComponent(2, 3, 1, 1, NONE, CENTER, this, nineButton);
		addComponent(0, 4, 3, 1, NONE, WEST, this, turnLabel);
	}
	
	private void addComponent(int x, int y, int width, int height,
			int fill, int anchor, Container cont, Component comp) {
		if(comp != null) {
			gbc.gridx = x;
			gbc.gridy = y;
			gbc.gridwidth = width;
			gbc.gridheight = height;
			gbc.fill = fill;
			gbc.anchor = anchor;
			cont.add(comp, gbc);
		}
	}
}
