
public class ArrayTools {

	
	static char[] createCharArrayWithNames() {
		String name = "Alexander" ;
		char[] a = new char[name.length()] ;
		for( int i = 0; i <= a.length; i++) {
			a[i] =    name.charAt(i) ;
		}
		
		return a ;
	}
	
	static float[] createFloatArrayWithNumbers(int count) {
		float[] arr = new float[count] ;
		
		for( int i = 0 ; i < arr.length ; i++) {
			arr[i] = (float)Math.random() * i ;  
		}
		return arr;
	}
	
	static void printArray(Array[] a) {
		System.out.print("{");
		
	}
	static void printA() {
		
		
	}
	
}
