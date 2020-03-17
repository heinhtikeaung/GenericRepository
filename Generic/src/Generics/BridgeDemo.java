package Generics;

class Ae<T>{
	T ob;
	
	Ae(T o){
		ob = o;
	}
	
	T getob() {
		System.out.println("Ae ");
		return ob;
	}
}

class Be extends Ae<String>{
	Be(String str){
		super(str);
	}
	
	String getob() {
		System.out.println("Be ");
		return ob;
	}
}

public class BridgeDemo {
	public static void main(String[] args) {
		Be ob = new Be("Hein") ;
		System.out.println(ob.getob());
		
		Ae <Integer> ob2 = new Ae<Integer>(23);
		System.out.println(ob2.getob());
	}
}
