package _03_Hangman;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayDeque;
import java.util.Iterator;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Hangman implements ActionListener, KeyListener {
	ArrayDeque<StringBuilder> wordbank = new ArrayDeque<>();
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JLabel label = new JLabel();
	JLabel tries = new JLabel();
	JTextField box = new JTextField();
	String random = "";
	StringBuilder placeholder = new StringBuilder();
	StringBuilder underscore;
	int counter = 5;

	public void run() {
		frame.add(panel);
		panel.add(label);
		panel.add(tries);
		panel.add(box);
		// box.addActionListener(this);
		box.addKeyListener(this);
		box.setColumns(1);
		random = Utilities.readRandomLineFromFile("dictionary.txt");
		StringBuilder rbuild = new StringBuilder();
		rbuild.append(random);
		wordbank.push(rbuild);
		underscore = new StringBuilder();
		placeholder = wordbank.pop();
		System.out.println(placeholder.toString());
		for (int i = 0; i < placeholder.length(); i++) {
			underscore.append("_ ");
		}
		tries.setText("" + counter);
		label.setText(underscore.toString());
		frame.setVisible(true);
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
		frame.pack();
	}

	public static void main(String[] args) {
		new Hangman().run();
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		if (e.getKeyCode() == e.VK_ENTER) {
			if (box.getText().length() == 1) {
				String answer;
				answer = box.getText();
				if (placeholder.indexOf(answer) != -1) {
					for (int i = 0; i < placeholder.length(); i++) {
						if (i == placeholder.indexOf(answer)) {
							placeholder.replace(i, i + 1, "1");
							underscore.replace(i * 2, i * 2 + 2, answer + " ");
						}
					}
				}
				else {
					counter-=1;
					tries.setText(""+counter);
				}
				box.setText("");
				label.setText(underscore.toString());
				if (counter == 0) {
					System.exit(0);
				}
				if (underscore.indexOf("_") == -1) {
					int pressed = JOptionPane.showConfirmDialog(null, "Do you wish to continue?");
					if (pressed == JOptionPane.YES_OPTION) {
						run();
					}
					else {
						System.exit(0);
					}
				}

			}

		}
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub

	}
}
