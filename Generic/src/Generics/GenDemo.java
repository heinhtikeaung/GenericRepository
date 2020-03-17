package Generics;

// T is placeholder for actual Type that will be specify when Gen Object is created
class Gen<T>{ //Generic class 
	T ob; //Object of Type T
	
	Gen(T o){
		ob = o;
	}
	
	T getob() {
		return ob;
	}
	
	void showType() {
		System.out.println(ob.getClass().getName());
	}
}

public class GenDemo {
	public static void main(String[] args) {
		//Gen<int> o = new Gen<int>(88); // Error (Generic work only Reference Type)
		
		Gen<Integer> ob = new Gen<Integer>(88); //create a Gen Refeence  for Integers				
		ob.showType();		
		int v = ob.getob(); // No Cast needed
		System.out.println(v);
		
		Gen<String> ob1 = new Gen<String>("Testing"); //create a Gen Refeence  for String
		ob1.showType();
		String str = ob1.getob(); // No Cast needed
		System.out.println(str);
		
	}
}
