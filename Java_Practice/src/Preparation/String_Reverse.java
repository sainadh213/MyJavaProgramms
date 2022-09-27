package Preparation;

public class String_Reverse {
	public static void main(String[] args) {
		String s="busam sainadh";
		char[] ss = s.toCharArray();
		String s1="";
		for(int i=s.length()-1;i>=0;i--)
		{
			s1=s1+s.charAt(i);
		}
		System.out.println(s1);
		
		
		/*for(char ch:ss)
		{
			s1=ch+s1;
		}
		System.out.println(s1);*/
		
		
		/*StringBuffer sb=new StringBuffer(s);
		StringBuffer rev = sb.reverse();
		System.out.println(rev);*/
		StringBuilder sb=new StringBuilder(s);
		StringBuilder rev = sb.reverse();
		System.out.println(rev);
	}

}
