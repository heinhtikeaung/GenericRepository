package Generics;

class MGen<T extends Number>{
	T ob;
	T vals[];
	
	MGen(T o, T[]nums){
		ob = o;
		vals = new T[10]; //Cant create array of Type T (Compiler dont know what type of array create)
		vals = nums;
	}
}

public class GenArrays {
	public static void main(String[] args) {
		Integer [] arr = {1,2,3,4,5};
		
		MGen<Integer> ob = new MGen<Integer>(2,arr);
		
		MGen<Integer> ob2 [] = new MGen<Integer>[10];
		MGen<?> ob3 [] = new MGen<?>[10]; // create array of Reference using wildcard
	}
}
