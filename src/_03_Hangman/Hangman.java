package _03_Hangman;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayDeque;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Hangman implements ActionListener {
ArrayDeque<String> wordbank = new ArrayDeque<>();
JFrame frame = new JFrame();
JPanel panel = new JPanel();
JLabel label = new JLabel();
JTextField box = new JTextField();
public void run() {
	frame.add(panel);
	panel.add(label);
	panel.add(box);
	box.addActionListener(this);
	frame.show();
	
	
}
public static void main(String[] args) {
new Hangman().run();
}
@Override
public void actionPerformed(ActionEvent arg0) {
	// TODO Auto-generated method stub
	
}
}
