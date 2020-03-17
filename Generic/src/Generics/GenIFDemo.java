package Generics;

interface MinMax < T extends Comparable<T> >{
	T min();
	T max();
}

class MyClass < V extends Comparable<V> > implements MinMax{
	
	V [] vals;
	
	MyClass(V[] o){
		vals = o;
	}
	
	public V min() {
		V name = vals[0];
		
		for(int i=1;i<vals.length;i++) {
			if(vals[i].compareTo(name) < 0) { // compareTo() only work in Wrapper Class
				name = vals[i];					//if Both Object are equal this method return 0, else it returns other value
			}
		}
		return name;
	}
	
	public V max() {
		V name = vals[0];		
		for(int i=1;i<vals.length;i++) {
			if(vals[i].compareTo(name) > 0) {
				name = vals[i];
			}
		}
		return name;
	}
}

public class GenIFDemo {
	public static void main(String[] args) {
		Integer inums[] = {3,4,5,2,23};
		MyClass iob = new MyClass (inums);
		System.out.println("max: " + iob.max());
		System.out.println("min: " + iob.min());
		
		Character chs[] = {'a', 'b', 'c', 'd', 'e'};
		MyClass <Character> cob = new MyClass<Character> (chs);
		System.out.println("max: " + cob.max());
		System.out.println("min: " + cob.min());
	}
}
