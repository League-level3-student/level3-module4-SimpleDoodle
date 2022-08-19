package _01_TestMatchingBrackets;

import java.util.Iterator;
import java.util.Stack;

public class TestMatchingBrackets {
    /*
     * Use a Stack to complete the method for checking if every opening bracket
     * has a matching closing bracket
     */
	static Stack<String> sstack = new Stack<>();
	static int counter = 0;
    public static boolean doBracketsMatch(String b) {

sstack.push(b);
for (int i = 0; i < sstack.size()-1; i++) {
	if (sstack.pop().equals("}")) {
		counter++;
	}
	else if (sstack.pop().equals("{")) {
		if (counter >0) {
			counter--;
		}

	}
	
}
if (counter == 0) {
	return true;
}
else {
        return false;
}
    }
}