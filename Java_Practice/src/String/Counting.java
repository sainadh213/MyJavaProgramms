package String;

public class Counting {

	public static void main(String[] args) {
		String s="a11b22c33";
		int num=0;
		int sum=0;
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)>='0' && s.charAt(i)<='9')
			{
				int n=s.charAt(i)-48;
				num=num*10+n;
			}
			else
			{
				sum=sum+num;
				num=0;
			}
		}
		System.out.println(num+sum);

	}

}
