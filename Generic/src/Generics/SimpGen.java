package Generics;

class TwoGen<T extends Comparable<T>, V extends Number>{
	T ob1;
	V ob2;
	
	TwoGen(T a, V b){
		ob1 = a;
		ob2 = b;
	}
	
	void showTypes() {
		System.out.println(ob1.getClass().getName());
		System.out.println(ob2.getClass().getName());
	}
	
	T getob1() {
		return ob1;
	}
	
	V getob2() {
		return ob2;
	}
}

public class SimpGen {
	public static void main(String[] args) {
		TwoGen<String,Integer> ob = new TwoGen <String,Integer>("Hein", 21);
		ob.showTypes();
		System.out.println(ob.getob1());
		System.out.println(ob.getob2());
	}
}
