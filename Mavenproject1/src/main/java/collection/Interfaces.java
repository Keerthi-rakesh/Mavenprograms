package collection;

import java.util.LinkedList;
import java.util.List;

public class Interfaces{

	public static void main(String[] args) {
		List <Integer>l=new LinkedList <Integer>();
		l.add(10);
		l.add(12);
		l.add(14);
		l.add(16);
		System.out.println(l);
		System.out.println(l.get(2));
		l.set(1,13);
		System.out.println(l);
		System.out.println(l.size());
		System.out.println(l.isEmpty());
		l.remove(3);
		System.out.println(l);
		System.out.println(l.contains(10));
		System.out.println(l.contains(11));
		System.out.println(l.indexOf(14));
		l.add(14);
		System.out.println(l);
		System.out.println(l.lastIndexOf(14));

	}

}
