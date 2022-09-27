package Preparation;

public class Unique {
public static void main(String[] args) {
	String s="SAINADH";
	String s1="";

	for(char c='A';c<='Z';c++)
	{
		int count=0;
		for(int i=0;i<s.length();i++)
		{
			if(c==s.charAt(i))
			{
				count++;
			}
		}
		if(count==1)
		{
			s1=s1+c;
		}
	}
	System.out.println(s1);
}
}
