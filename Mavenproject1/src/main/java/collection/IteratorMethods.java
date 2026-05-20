package collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class IteratorMethods {

	public static void main(String[] args) {
		Set <Integer> s=new HashSet <Integer>();
		s.add(10);
		s.add(11);
		s.add(12);
		s.add(13);
		System.out.println(s);
		Iterator <Integer> i=s.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
			
		}
		i.remove();
		System.out.println(s);
		
		

	}

}
