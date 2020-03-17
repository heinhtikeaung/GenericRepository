package Generics;

class NonGen{  
	Object ob; 
	
	NonGen(Object o){
		ob = o;
	}
	
	Object getob() {
		return ob;
	}
	
	void showType() {
		System.out.println(ob.getClass().getName());
	}
}

public class NonGenDemo {
	public static void main(String[] args) {
		NonGen ob = new NonGen(88); 				
		ob.showType();		
		int v = (Integer)(ob.getob()); //  Casting needed
		System.out.println(v);
		
		NonGen ob1 = new NonGen("Testing"); 
		ob1.showType();
		String str = (String)(ob1.getob()); // Casting needed
		System.out.println(str);
		
		ob = ob1; // java Compiler Error
		v = (Integer)(ob.getob());
	}
}
