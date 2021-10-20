package es.upm.grise.profundizacion.testcasedesignclassexamples;

import static es.upm.grise.profundizacion.testcasedesignclassexamples.Utils.*;

public class ClassExample {

	public void exampleInTheSlides() {
		@SuppressWarnings("unused")
		int i;
		char ch;
		int keys;
		boolean scape = false;
		boolean status = false;
		
		i = 0;
		
		do {
			while(!keyStat()) {
				// null statement
			}
			
			// keystat only detects that a character is available
			ch = getKey();
			keys = ord(ch);
			
			if(keys == 27)
				scape = true;
			else
				if (keys != 13)
					status = !status;
			
			showStatus(status);
			
		} while (!(keys == 13 || scape));	
		
		// nothing else
	}	
	
	public void extraExample1(int a, int b) {
		if ((a > 0) && (b > 0))
			if (a > 10)
				b = 0;
			else
				a++;
		else
			a = 0;
	}
	
	public void extraExample2(int a, int b) {
		if ((a > 0) && (b > 0))
			if (a >= 10)
				b = 0;
			else
				a++;
		
		if((a <= 10) && (b == 0))
			b = b + a;
		else
			a = 0;
	}
	
	public void extraExample3(int a, int b) {
		while ((a > 0) && (b > 0)) {
			if (a >= 10)
				b = 0;
			else
				a++;
		}
	}
	

}
