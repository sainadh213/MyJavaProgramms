package Collections;

import java.util.LinkedHashSet;

public class Linked_Hash_Set {

	public static void main(String[] args) {
		LinkedHashSet lhs=new LinkedHashSet<>();
		lhs.add("a");
		lhs.add("b");
		lhs.add("c");
		lhs.add("d");
		lhs.add("e");
		System.out.println(lhs);
		for(Object ob:lhs)
		{
			System.out.println(ob);
		}

	}

}
