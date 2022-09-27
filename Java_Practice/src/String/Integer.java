package String;

import java.util.Arrays;
import java.util.LinkedHashSet;

public class Integer {

	public static void main(String[] args) {
		String s="1234321423142341";
		char ch[]=s.toCharArray();
		Arrays.sort(ch);
		LinkedHashSet<Character>c=new LinkedHashSet<>();
	  String s1="";
	  for(int i=0;i<ch.length;i++)
	  {
		   c.add(ch[i]);
		   
	  }
	  System.out.println(c);
	  for(char cc:c)
	  {
		  for(int j=0;j<ch.length;j++)
		  {
			  if(cc==ch[j])
			  {
				  System.out.print(cc+" ");
			  }
		  }
		  System.out.println();
	  }


	}

}
