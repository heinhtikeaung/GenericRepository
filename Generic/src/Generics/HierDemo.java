package Generics;

class Go1<T>{
	T ob;
	Go1(T o){
		ob = o;
	}
	T getob() {
		return ob;
	}
}

class Go2<T,V> extends Go1<T>{ // subClass can define second type parameter called V
	V ob2;
	
	Go2(T o, V o2){
		super(o);
		ob2 = o2;
	}
	V getob2() {
		return ob2;
	}
}

public class HierDemo {
	public static void main(String[] args) {
		Go2 <String, Integer> x = 
				new Go2<String,Integer>("Hein: ", 21);
		
		System.out.println(x.getob());
		System.out.println(x.getob2());
	}
}
