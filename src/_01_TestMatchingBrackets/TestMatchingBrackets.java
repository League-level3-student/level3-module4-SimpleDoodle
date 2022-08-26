package _01_TestMatchingBrackets;

import java.util.Iterator;
import java.util.Stack;

public class TestMatchingBrackets {
    /*
     * Use a Stack to complete the method for checking if every opening bracket
     * has a matching closing bracket
     */
	static Stack<Character> tack = new Stack<>();
	static int counter = 0;
	static char storage = ' ';
	static boolean empty = false;
	
    public static boolean doBracketsMatch(String b) {
StringBuilder st = new StringBuilder();
st.append(b);
for (int i = 0; i < st.length(); i++) {
	tack.push(st.charAt(i));

	}
int sSize = tack.size();
for (int i = 0; i < sSize; i++) {
	storage = tack.pop();
	if (storage == '}') {
		counter++;
	}
	else if (storage == '{') {
		if (counter != 0) {
			counter--;
		}
		else{
			empty = true;
		}
		//"{{}}}{
}
	
}
if (counter == 0 && empty == false) {
	return true;
}
else {
        return false;
}
    }
}