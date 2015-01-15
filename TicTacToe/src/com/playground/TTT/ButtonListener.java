package com.playground.TTT;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;

public class ButtonListener implements ActionListener {
	
	public static final String TURN = "Turn: ";
	
	private boolean xTurn = true;
	private int turnCount = 0;
	
	private JLabel playerLabel;
	private JLabel turnLabel;
	
	public ButtonListener(JLabel pLabel, JLabel tLabel) {
		playerLabel = pLabel;
		turnLabel = tLabel;
	}
	
	@Override
	public void actionPerformed(ActionEvent evt) {
		String player = getPlayerString();
		JButton source = (JButton)evt.getSource();
		
		source.setText(player);
		source.setEnabled(false);
		
		xTurn = !xTurn;
		turnCount++;
		
		setLabelText(turnCount);
	}
	
	private void setLabelText(int turnCount) {
		turnLabel.setText(TURN + turnCount);
		if(turnCount < 9) {
			playerLabel.setText("Player " + getPlayerString() + " turn.");
		} else {
			playerLabel.setText("GAME OVER!");
		}
	}

	private String getPlayerString() {
		if(xTurn) {
			return "X";
		} else {
			return "O";
		}
	}
	
	public int getTurnCount() {
		return turnCount;
	}
}
