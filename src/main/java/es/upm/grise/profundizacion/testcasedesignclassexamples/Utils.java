package es.upm.grise.profundizacion.testcasedesignclassexamples;

import java.util.Vector;

public class Utils {

	private static Vector<Character> buffer;
	private static int index;

	public static void initialize(char[] keystrokes) {
		buffer = new Vector<Character>();
		for(char i : keystrokes)
			buffer.add(i);
		index = 0;
	}

	public static void showStatus(boolean status) {
		System.out.println("Status is: " + status);		
	}

	public static int ord(char ch) {
		return (int)ch;
	}

	public static boolean keyStat() {
		if(index >= buffer.size())
			return false;
		if(buffer.get(index) == (char)255) {
			index++;
			return false;
		}
		return true;
	}
	
	public static char getKey() {
		char ch = buffer.get(index);
		index ++;
		
		switch (ch) {
		case 13: System.out.println();
		case 27: System.out.print("ESC");
		default: System.out.print(ch);
		}
		
		return ch;
	}

}
