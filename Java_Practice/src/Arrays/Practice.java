package Arrays;

import java.util.ArrayList;

public class Practice {

	public static void main(String[] args) {
	ArrayList<Integer>al=new ArrayList<>();
	al.add(1);
	al.add(2);
	al.add(3);
	al.add(4);
	System.out.println(al);
	al.add(4,5);
	System.out.println(al);
	al.set(2,6);
	for(int i:al)
	{
		System.out.println(i);
	}
	ArrayList a=new ArrayList<>();
	a.add(1);
	a.add("testyantra");
	a.add(3);
	a.add(4);
	System.out.println(al.containsAll(a));
	
	
	
	}

}
