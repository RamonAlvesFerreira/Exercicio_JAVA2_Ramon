package Questions;

import java.nio.charset.Charset;

public class Exercise2 {
	
	
	public static void main (String[] args) {
		
		String testeString = "Dummy Games";
		
		printStrinOnDiferentLines(testeString);
		
	}
	
	public static void printStrinOnDiferentLines(String stringToSet) {
		
		for(int i = 0; i < stringToSet.length(); i++) {

			System.out.println(stringToSet.charAt(i));
						
		}
		
	}
	
}
