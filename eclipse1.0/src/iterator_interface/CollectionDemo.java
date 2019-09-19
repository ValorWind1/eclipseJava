package iterator_interface;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionDemo {
	
	public static void main(String[] args) {
		
		// collections = collection of elements/objects
		
		Collection c = new ArrayList();
		c.add(4);
		c.add(10);
		c.add(7);
		
		System.out.println(c);
		
		Iterator itobj = c.iterator();
		
		while(itobj.hasNext()) {
			System.out.println(itobj.next());
		}
		
	
		
		
		
	}

}
