package String;

import java.util.LinkedHashSet;

public class Position {

	public static void main(String[] args) {
		String s="khatham ta ta bye bye";
		String[] sl = s.split(" ");
		LinkedHashSet<String>ls=new LinkedHashSet<>();
		for(int i=0;i<sl.length;i++)
		{
			ls.add(sl[i]);
		}
		
		for(String st:ls)
		{
			
			for(int i=0;i<sl.length;i++)
			{
				if(st.equals(sl[i]))
				{
					System.out.println(st+" Position is : "+(i+1));
					break;
				}
			}
		}
		
		
	}

	
}
