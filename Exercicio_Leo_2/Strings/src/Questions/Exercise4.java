package Questions;

public class Exercise4 {
	

	
	public static void main(String[] args) {
		
		String x = "762";
		
		
		stringToInt(x);
		
	}
	
	public static void stringToInt(String stringToSet) {
		
		int i = 0;
		
		for(int j = 0; j < stringToSet.length(); j++) {
			
			i = i * 10;
			i = i + (int) stringToSet.charAt(j) - (int) '0';
			
			
		}
		System.out.println(i);
	}

}
