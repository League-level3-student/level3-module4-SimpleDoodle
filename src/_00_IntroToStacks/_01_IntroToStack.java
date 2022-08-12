package _00_IntroToStacks;

import java.util.Iterator;
import java.util.Random;
import java.util.Stack;

import javax.swing.JOptionPane;

public class _01_IntroToStack {
    public static void main(String[] args) {
        // 1. Create a Stack of Doubles
        //    Don't forget to import the Stack class
Stack<Double> doub = new Stack<Double>();
        // 2. Use a loop to push 100 random doubles between 0 and 100 to the Stack.
Random r = new Random();
Double random;
for (int i = 0; i < 100; i++) {
	random = r.nextDouble()*100;
	doub.push(random);
}
String s = JOptionPane.showInputDialog("Enter a number between 0 and 99");
int i = Integer.parseInt(s);
String k = JOptionPane.showInputDialog("Enter another a number between "+ i + 1 + " and 100");
int j = Integer.parseInt(k);
Double dd;
System.out.println("Popping elements off stack...");
System.out.println("Elements betweeen " + i + " and" + j+":");
while (! doub.isEmpty()) {
	dd = doub.pop();
	if (i <= dd && dd <= j) {
		System.out.println(dd);
	}
}

        // 3. Ask the user to enter in two numbers between 0 and 100, inclusive. 

        // 4. Pop all the elements off of the Stack. Every time a double is popped that is
        //    between the two numbers entered by the user, print it to the screen.


        // EXAMPLE:
        // NUM 1: 65
        // NUM 2: 75

        // Popping elements off stack...
        // Elements between 65 and 75:
        // 66.66876846
        // 74.51651681
        // 70.05110654
        // 69.21350456
        // 71.54506465
        // 66.47984807
        // 74.12121224
    }
}
