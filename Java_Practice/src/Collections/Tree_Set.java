package Collections;

import java.util.Iterator;
import java.util.TreeSet;

public class Tree_Set {

	public static void main(String[] args) {
		TreeSet ts=new TreeSet<>();
		ts.add("a");
		ts.add("b");
		ts.add("c");
		ts.add("d");
		ts.add("e");
		System.out.println(ts);
		Iterator i = ts.iterator();
		while (i.hasNext()) {
			System.out.println(i.next());
		}
		System.out.print("In Descendending Order : ");
		Iterator di = ts.descendingIterator();
		while (di.hasNext()) {
			System.out.print(di.next()+" ");
			
		}
		
		
		/*ts.add("f");
		ts.add("a");
		ts.add("c"); 
		ts.add("d");
		ts.remove("d");
		System.out.println("this set contains d: "+ts.contains("d")); 
		ts.removeAll(ts);
		System.out.println(ts);
		System.out.println("Ascending Order is");
		Iterator it=ts.iterator();
		while(it.hasNext()) {
		System.out.println(it.next());
		}*/
	}

}
