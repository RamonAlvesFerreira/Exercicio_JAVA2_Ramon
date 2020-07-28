package Questions;

public class Exercise3 {
	
	public static void main (String[] args) {
		
		String testeString = "dummy";
		
		printInvertedString(testeString);
		
	}
	
	public static void printInvertedString(String stringToSet) {
		
		String stringInvertida = "";
		
		for(int i = stringToSet.length() - 1; i >= 0 ; i--){

			stringInvertida += stringToSet.charAt(i);
						
		}
		System.out.println(stringInvertida);
		
	}

}
