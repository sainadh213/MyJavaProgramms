package Collections;

import java.util.LinkedList;
import java.util.Queue;

public class Queuee {

	public static void main(String[] args) {
		Queue q=new LinkedList();
		q.add("b");
		q.offer("z");
		q.add("a");
		q.add("b");
		q.add("c");
		q.add("d");
		System.out.println(q);
		System.out.println(q.peek());
		System.out.println("The Removed element is : "+q.poll());
		for(Object ob:q)
		{
			System.out.println(ob);
		}
		System.out.print("The removed elements are : ");
		while (!(q.isEmpty())) {
			System.out.print(q.poll()+" ");
			
		}
		System.out.println();
		System.out.println(q);
	}

}
