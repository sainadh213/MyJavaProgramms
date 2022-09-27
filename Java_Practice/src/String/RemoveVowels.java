package String;

public class RemoveVowels {

	public static void main(String[] args) {
		String s="sAinadh";
		String s1="";
		/*for(int i=0;i<s.length();i++)
		{
			char ch = s.charAt(i);
			
			if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' )
			{
				s1=s1;
			}
			else
			{
				s1=s1+ch;
			}
		}
		System.out.println(s1);*/
		String ss = s.replaceAll("[aeiouAEIOU]", "");
		System.out.println(ss);
	}

}
