package collection;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListMethods {

	public static void main(String[] args) {
		ArrayList<String> a=new ArrayList<String>();
		a.add("Green");
		a.add("Orange");
		a.add("Yellow");
		a.add("Red");
		a.add("Blue");
		System.out.println(a);
		System.out.println(a.get(2));
		Iterator <String> i=a.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
			
		}
		a.remove(2);
		System.out.println(a);
		System.out.println(a.contains("Orange"));
		System.out.println(a.contains("Yellow"));
	}

}
