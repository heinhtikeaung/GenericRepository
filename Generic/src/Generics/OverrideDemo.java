package Generics;

class AA<T>{
	T ob;
	
	AA(T o){
		ob = o;
	}
	
	T getob(){
		System.out.print("AA ");
		return ob;
	}
}

class BB<T> extends AA<T>{
	BB(T o){
		super(o);
	}
	
	T getob() {
		System.out.print("BB ");
		return ob;
	}
}

public class OverrideDemo {
	public static void main(String[] args) {
		AA <Integer> ob = new AA<Integer>(21);
		BB <Integer> ob2 = new BB<Integer>(21);
		BB <String> ob3 = new BB<String>("Hein");
		
		System.out.println(ob.getob());
		System.out.println(ob2.getob());
		System.out.println(ob3.getob());
	}
}
