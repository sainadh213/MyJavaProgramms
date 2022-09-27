package Preparation;

public class Occurance {
public static void main(String[] args) {
	String s="sainadh213";
	/*char ch='a';
	int count=0;
	for(int i=0;i<s.length();i++)
	{
		if(ch==s.charAt(i))
		{
			count++;
		}
	}
	System.out.println("The Chracter "+ch+" comes "+count+" times");*/
	System.out.println(s.length()-s.replace("a", "").length());
	System.out.println(s.replaceAll("[0-9]",""));
}
}
