package collection;

import java.util.HashSet;
import java.util.Set;

public class SetClass {

	public static void main(String[] args) {
		Set <Integer>s=new HashSet <Integer>();
		Set <Integer>s1=new HashSet <Integer>();
		s.add(1);
		s.add(2);
		s.add(3);
		s.add(4);
		s1.add(10);
		s1.add(11);
		s1.add(12);
		s1.add(13);
		System.out.println(s);
		System.out.println(s1);
		s.addAll(s1);
		System.out.println(s);
		System.out.println(s.size());
		System.out.println(s1.size());
		System.out.println(s.isEmpty());
		System.out.println(s.contains(3));
		System.out.println(s.containsAll(s1));
		System.out.println(s1.containsAll(s));
		s.remove(12);
		System.out.println(s);
		s.removeAll(s1);
		System.out.println(s);
		s1.clear();
		System.out.println(s1);

	}

}
