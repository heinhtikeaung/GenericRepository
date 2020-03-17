package Generics;

class GenConos{
	double val;
	<T extends Number> GenConos(T arg){
		val = arg.doubleValue();
	}
	
	void show() {
		System.out.println(val);
	}
}

public class GenConsDemo {
	public static void main(String[] args) {
		GenConos ob = new GenConos(30);
		ob.show();
		
		GenConos ob1 = new GenConos(30.2);
		ob1.show();
	}
}
