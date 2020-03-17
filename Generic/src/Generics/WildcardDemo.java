package Generics;

class Gene <T extends Number>{
	T[] nums;
	
	Gene(T[] o){
		nums = o;
	}
	
	double average() {
		double sum = 0.0;
		for(int i=0;i<nums.length;i++) {
			sum += nums[i].doubleValue();
		}
		return sum/nums.length;
	}
	
	boolean same(Gene<?> ob) { // ? means WildCard argument(represent unknow Type)
		if(average()==ob.average()) {  //average() means iob.average()
			return true;
		}
		else {
			return false;
		}
	}
}

public class WildcardDemo {
	public static void main(String[] args) {
		Integer [] arr = {1,2,3,4,5};		
		Gene<Integer> ob = new Gene<Integer>(arr);
		System.out.println(ob.average());
		
		Double []dnums = {1.0, 2.0, 3.0, 4.0, 5.0};
		Gene<Double> ob2 = new Gene<Double>(dnums);
		System.out.println(ob2.average());
		
		Float [] farr = {1.0F, 2.0F, 3.0F, 4.0F, 5.0F};
		Gene<Float> ob3 = new Gene<Float>(farr);
		System.out.println(ob3.average());
		
		System.out.println("Integer == Double : " + ob.same(ob2));
		System.out.println("Integer == Double : " + ob.same(ob3));
	}
}
