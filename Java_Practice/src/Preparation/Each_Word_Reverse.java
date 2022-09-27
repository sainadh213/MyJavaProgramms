package Preparation;

public class Each_Word_Reverse {
public static void main(String[] args) {
	String s="my name is busam sainadh";
	String[] sp = s.split(" ");
	for(int i=0;i<sp.length;i++) 
	{
		char[] ch = sp[i].toCharArray();
		for(int j=ch.length-1;j>=0;j--)
		{
			System.out.print(ch[j]);
		}
		System.out.print(" ");
	}
	
}
}
