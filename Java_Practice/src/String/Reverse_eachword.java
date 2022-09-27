package String;

public class Reverse_eachword {

	public static void main(String[] args) {
		String s="busam sainadh";
		String s1[]=s.split(" ");
		String rev="";
			for(int i=0;i<s1.length;i++)
		{
			
			/*char[] ch = s1[i].toCharArray();
			for(int j=ch.length-1;j>=0;j--)
			{
				System.out.print(ch[j]);
			}
			System.out.print(" ");*/
				rev=s1[i]+" "+rev;
		}
  System.out.println(rev);
	}

}
