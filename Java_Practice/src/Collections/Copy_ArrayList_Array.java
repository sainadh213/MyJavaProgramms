package Collections;

import java.util.ArrayList;
import java.util.Arrays;

public class Copy_ArrayList_Array {

	public static void main(String[] args) {
		ArrayList<String>a=new ArrayList<>();
		a.add("Sainadh");
		a.add("Teja");
		a.add("Sai Manoj");
		a.add("Srikanth");
		int si = a.size();
	  String ss[]=new String[si];
	  for(int i=0;i<si;i++)
	  {
		  ss[i]=a.get(i);
		 
	  }
	 
	 System.out.println(Arrays.toString(ss));
	}

}
