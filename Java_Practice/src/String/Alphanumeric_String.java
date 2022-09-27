package String;

public class Alphanumeric_String {

	public static void main(String[] args) {
		String s="sainadh213@gmail.com";
		String s1="";
		String s2="";
		String s3="";
		for(int i=0;i<s.length();i++)
		{
			char ch = s.charAt(i);
			//if(ch>='a'&&ch<='z')
			if(ch>=97&&ch<=122)
			{
				s1=s1+ch;
			}
			//else if(ch>='0'&&ch<='9')
			else if(ch>=48&&ch<=57)
			{
				s2=s2+ch;
			}
			else
			{
			s3=s3+ch;	
			}
			}
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		}
		

	}

