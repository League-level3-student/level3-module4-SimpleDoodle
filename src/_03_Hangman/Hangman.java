package _03_Hangman;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayDeque;
import java.util.Iterator;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Hangman implements ActionListener {
	ArrayDeque<StringBuilder> wordbank = new ArrayDeque<>();
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JLabel label = new JLabel();
	JTextField box = new JTextField();
	String random = "";
	StringBuilder rbuild = new StringBuilder();
	StringBuilder placeholder = new StringBuilder();
	int numberGames = 0;

	public void run1() {
		String games = JOptionPane.showInputDialog("How many games do you want to play? (Insert a numerical value)");
		numberGames = Integer.parseInt(games);
		run2();
	}

	public void run2() {
		frame.add(panel);
		panel.add(label);
		panel.add(box);
		box.addActionListener(this);
		for (int i = 0; i < numberGames; i++) {
			random = Utilities.readRandomLineFromFile("dictionary.txt");
			rbuild.append(random);
			wordbank.push(rbuild);
		}
		placeholder = wordbank.pop();
		label.setText(wordbank.getFirst().replace(0, wordbank.size()-1, "_").toString());
		frame.setVisible(true);
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);

	}

	public static void main(String[] args) {
		new Hangman().run1();
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub

	}
}
