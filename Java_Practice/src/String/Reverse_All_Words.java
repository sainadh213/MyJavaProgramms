package String;

public class Reverse_All_Words {

	public static void main(String[] args) {
		String s="Hyd Test Yantra";
		String s1="";
		String[] s2 = s.split(" ");
		for(String s3:s2)
		{
			s1=s3+" "+s1;
		}
  System.out.println(s1);
		/*String s="Test Yantra Hyd";
		
		String []s2=s.split(" ");
		for(String s3:s2)
		{
			
			char[]ch=s3.toCharArray();
			String s1="";
			for(char c:ch)
			{
			s1=c+s1;
		}
		System.out.print(s1+" ");*/
	}
	}


