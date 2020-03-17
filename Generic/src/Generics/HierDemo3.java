package Generics;

class Gn<T>{
	T ob;
	
	Gn(T o){
		ob = o;
	}
	
	T getob() {
		return ob;
	}
}

class Gn2<T> extends Gn<T>{
	Gn2(T o){
		super(o);
	}
}

public class HierDemo3 {
	public static void main(String[] args) {
		Gn <Integer> ob = new Gn<Integer>(20);
		Gn2 <Integer> ob2 = new Gn2<Integer>(21);
		Gn2<String> ob3 = new Gn2<String>("Testing");
		
		System.out.println(ob instanceof Gn2<?>);
		System.out.println(ob instanceof Gn<?>); 
		System.out.println(ob2 instanceof Gn2<?>);
		System.out.println(ob2 instanceof Gn<?>); // wildcard determine if ob2 is an object of any type of Gn2
		System.out.println(ob3 instanceof Gn2<?>);
		System.out.println(ob3 instanceof Gn<?>);
		
		// Generic Type information unavailable at run time (doesnt know ob2 is Integer or not)
		System.out.println(ob2 instanceof Gn2<Integer>); //Error
	}
}
