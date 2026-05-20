package collection;

import java.util.ArrayList;
import java.util.List;

public class ListClass {

	public static void main(String[] args) {
		List <String> l =new ArrayList <String>();
		l.add("A");
		l.add("B");
		l.add("C");
		l.add("D");
		System.out.println(l);
		for(String i: l) {
			System.out.println(i);
			
		}
	}

}
