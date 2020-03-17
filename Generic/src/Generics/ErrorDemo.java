package Generics;

class MyGen<T,V>{
	T ob1;
	V ob2;
	
	void set(T o) {
		ob1 = o;		
	}
	void set(V o) {
		ob2 = o;
	}
}

class MyGen2<T>{
	static T ob;
	
	static T getob() {
		
	}
}

public class ErrorDemo {

}
