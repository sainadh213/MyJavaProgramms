package Practice;

public class StringReverse {

	public static void main(String[] args) {
		String s="moom";
		String rev="";
		for(int i=s.length()-1;i>=0;i--)
		{
rev=rev+s.charAt(i);
	}
		System.out.println("Reverse of String is :"+rev);
		if(s.equals(rev))
		{
			System.out.println("Given String is Palindome");
		}
		else
		{
			System.out.println("Given String is not Palindome");
		}

}
}