package Generics;

class Go<T>{
	T ob;
	
	Go(T o){
		ob = o;
	}
	
	T getob() {
		return ob;
	}
}

public class RawDemo {
	public static void main(String[] args) {
		Go<Integer> iob = new Go<Integer>(99); // Create Go Object for Integer
		Go<String> sob = new Go<String>("Generic");
		
		Go<Double> raw = new Go<Double>(23.23);
		double d = (Double) raw.getob();
		System.out.println(d);
		
		int i = (Integer) raw.getob();
	}
}
