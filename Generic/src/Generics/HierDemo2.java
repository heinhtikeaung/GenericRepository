package Generics;

class NG{ // Non Generic Class(Non Generic Class can be superclass of Generic Class)
	int num;
	
	NG(int n){
		num = n;
	}
	
	int getnum() {
		return num;
	}
}

class G<T> extends NG{
	T ob;
	G(int i, T o){
		super(i);
		ob = o;
	}
	T getob() {
		return ob;
	}
}

public class HierDemo2 {
	public static void main(String[] args) {
		G <String> ob =
				new G<String>(21, "Hein");
		
		System.out.println(ob.getob());
		System.out.println(ob.getnum());
	}
}
