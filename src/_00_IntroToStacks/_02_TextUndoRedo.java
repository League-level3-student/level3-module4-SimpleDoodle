package _00_IntroToStacks;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Stack;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class _02_TextUndoRedo implements KeyListener {
	/*
	 * Create a JFrame with a JPanel and a JLabel.
	 * 
	 * Every time a key is pressed, add that character to the JLabel. It should look
	 * like a basic text editor.
	 * 
	 * Make it so that every time the BACKSPACE key is pressed, the last character
	 * is erased from the JLabel.
	 * 
	 * Save that deleted character onto a Stack of Characters.
	 * 
	 * Choose a key to be the Undo key. Make it so that when that key is pressed,
	 * the top Character is popped off the Stack and added back to the JLabel.
	 */
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JLabel label = new JLabel();
	Stack<Character> charstack = new Stack<>();
	StringBuilder placeholder = new StringBuilder();

	public static void main(String[] args) {
		_02_TextUndoRedo start = new _02_TextUndoRedo();
		start.run();
	}
	public void run() {
		frame.add(panel);
		panel.add(label);
		frame.addKeyListener(this);
		label.addKeyListener(this);
		placeholder.append("");
		label.setText(placeholder.toString());
		frame.pack();
		frame.setVisible(true);
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		if (e.getKeyCode() == e.VK_BACK_SPACE) {
			if (placeholder.length() > 0) {
		charstack.push(placeholder.charAt(placeholder.length()-1));
		placeholder.deleteCharAt(placeholder.length()-1);
			}
		}
		else if (e.getKeyCode() == e.VK_ENTER) {
			if ( charstack.size() > 0) {
			placeholder.append(charstack.pop());
			}
		}
		else {
			placeholder.append(e.getKeyChar());
		}
		label.setText(placeholder.toString());
		frame.pack();
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
