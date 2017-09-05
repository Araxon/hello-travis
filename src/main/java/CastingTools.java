
public class CastingTools {

	
	
	static void printChars() {
		
		for(int i= 33 ; i < 127; i++) {
			char c = (char)i ;
			System.out.println(c);
			System.out.println(i);
		}
	}
	
	static int stringToInt(String number) {
		Integer i = new Integer(number);
		return i.intValue() ;
		// return Integer.parseInt(number);
	}
	
	
	public static void main(String[] args) {
		printChars();
	}
}
