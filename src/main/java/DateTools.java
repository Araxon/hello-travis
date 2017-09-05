
public class DateTools {

	static int dayOfTheWeeks(int day, int month, int year) {
		int tag = (day + 2 * month + (3*month + 3)/ 5 + year + year/4 -(year/100 - year/400 -2)) % 7 ;
		return tag;
	}
	static int daysPerYear(int year){
		if(year % 4 == 0 && year % 100 != 0) return 356;
		else return 355;
		}
	
	static int daysPerMonth(int month, int year) {
		switch (month) {
		
		case 2: 
			if( daysPerYear(year) == 356) return 29;
			else return 28;
		case 4: 	
			return 30;
		case 6: 	
			return 30;
		case 9: 	
			return 30;
		case 11: 	
			return 30;
		default:
			return 31;
		} 
	}
	
	static int dayOfTheYear(int day, int month, int year) {
		int count = day;
		while (month > 1) {
			month = month - 1;
			count = count + daysPerMonth(month,year);
		}
		return count;
	}
	
	static int daysTillXmas(int day, int month, int year) {
		int xmas = dayOfTheYear(24,12,year);
		int tag = dayOfTheYear(day,month,year);
		
		if( xmas >= tag) return (xmas - tag);
		else return (tag - xmas);
		
	}
	public static void main(String[] args) {
		System.out.println( dayOfTheWeeks(5,9,2017)) ;
		System.out.println( dayOfTheWeeks(6,9,2017)) ;
		System.out.println( daysPerYear(2000) );
		System.out.println( daysPerYear(2004) );
		System.out.println( daysPerMonth(2,2001) );
		System.out.println( daysTillXmas(5,9,2017) );
		
	}
}

