package Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;

public class Hash_Set {

	public static void main(String[] args) {
		HashSet hs=new HashSet();
		hs.add("sainadh");
		hs.add(213);
		hs.add('@');
		hs.add("");
		hs.add("gmail.com");
		hs.add(true);
		ArrayList al=new ArrayList<>(hs);
		//System.out.println(al);;
		
		System.out.println(hs);
		/*for(Object ob:hs)
		{
			System.out.println(ob);
		}
		Iterator it = hs.iterator();
		while (it.hasNext()) {
		System.out.println(it.next());
			
		}*/

	}

}
