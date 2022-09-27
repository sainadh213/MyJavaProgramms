package Preparation;

public class Remove_Duplicates {
public static void main(String[] args) {
	String s="sainadh";
	String s1="";
	for(int i=0;i<s.length();i++)
	{
		char ch = s.charAt(i);
		int n = s1.indexOf(ch);
		if(n==-1)
		{
			s1=s1+ch;
		}
	}
	System.out.println(s1);
}
}

