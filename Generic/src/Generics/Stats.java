package Generics;

class A<T extends Number>{ //Integer and Double is subClass of Number
	T[] nums; // nums is Array of Type T
	
	A(T[] o){
		nums = o;
	}
	
	double average() {
		double sum = 0;
		for(int i=0;i<nums.length;i++) {
			sum += nums[i].doubleValue();
		}
		return sum/nums.length;
	}
	
}

public class Stats {
	public static void main(String[] args) {
		Integer [] arr = {1,2,3,4,5};		
		A<Integer> ob = new A<Integer>(arr);
		System.out.println(ob.average());
		
		Double []dnums = {3.2, 5.2, 3.2, 3.2, 2.1};
		A<Double> ob2 = new A<Double>(dnums);
		System.out.println(ob2.average());
		
		String str[] = {"1", "2", "3", "4", "5"};
		//A<String> ob3 = new A<String>(str); //String is not a subclass of Number
		//System.out.println(ob3.average());
	}
}
