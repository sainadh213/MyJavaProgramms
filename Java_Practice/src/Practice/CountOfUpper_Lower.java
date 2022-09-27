package Practice;

public class CountOfUpper_Lower {

	public static void main(String[] args) {
		String s="BusAmSaiNadh";
		int lower=0,upper=0;
		for(int i=0;i<s.length();i++)
		{
			char ch = s.charAt(i);
			if(ch>=65 && ch<=90)
			{
				upper++;
			}
			else
			{
				lower++;
			}
		}
		System.out.println("Lower : "+lower);
		System.out.println("Upper: "+upper);

	}

}
