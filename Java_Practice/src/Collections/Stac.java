package Collections;

import java.util.Stack;

public class Stac {

	public static void main(String[] args) {
		Stack s=new Stack();//last in first out
		s.add(6);
		s.add(1,"testyantra");
		s.push("hyderabad");
		s.push("hyderabad");
		s.push("apeejay");
		System.out.println(s);
		System.out.println(s.peek());
		System.out.println(s);
		System.out.println(s.pop());
			System.out.println(s);

	}

}
