package String;

import java.util.LinkedHashSet;

public class Assignment_1 {

	public static void main(String[] args) {
		String s[]= {"test","yantra","hyderabad"};
		for(int i=0;i<s.length;i++)
		{
			 int count=0;
			char[] ch= s[i].toCharArray();
			LinkedHashSet<Character> ls=new LinkedHashSet<>();
			for(int j=0;j<ch.length;j++)
			{
				ls.add(ch[j]);
			}
				
			for(char ch1:ls)
			{	
				if(ch1=='a'||ch1=='e'||ch1=='i'||ch1=='o'||ch1=='u')
				{
					count++;
				}
			}
			System.out.println(s[i]+" - "+count);
			
		}
	}
}
