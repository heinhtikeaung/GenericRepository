package Generics;

public class GenMethDemo { //Comparable is for Type Safety
	static <T extends Comparable<T>, V extends T > boolean isIn(T x, V[] y) { // V must be the same as T or a subclass of T
		for(int i=0;i<y.length;i++) {
			if(x == (y[i])) {
				return true;
			}			
		}
		return false;
		
	}
	
	public static void main(String[] args) {
		Integer nums[] = {1,2,3,4,5}; // must be Reference Type(Integer), not allow primitive type
		
		if(isIn(3,nums));{
			System.out.println("3 involked in nums");
		}
		
		String str[] = {"AA", "BB", "CC"};
		
		if(isIn("AA",str)) {
			System.out.println("AA involked in str");
		}
		
		if(isIn(2,str)) { //Error (because of Comparable)
			System.out.println("AA involked in str");
		}
				
	}
}
