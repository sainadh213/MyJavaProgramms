package String;

import java.util.LinkedHashSet;

public class Each_Word_Occurence {

	public static void main(String[] args) {
		String s="welcome to india welcome to tyss";
		String[] s1 = s.split(" ");
		LinkedHashSet<String>ls=new LinkedHashSet<>();
		for(int i=0;i<s1.length;i++)
		{
			ls.add(s1[i]);
			
		}
		
		for(String st:ls)
		{
			//System.out.print(st+" ");
			int count=0;
			for(int j=0;j<s1.length;j++)
			{
				if(st.equals(s1[j]))
				{
					count++;
				}
			}
			
			System.out.println(st+"-"+count+" Times");
		}
	}

}
