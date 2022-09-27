package Preparation;

public class Count_Words {
	public static void main(String[] args) {
		String s="my name is busam sainadh";
		int count =1;
		/*String[] sp = s.split(" ");
		System.out.println("count of words is : "+sp.length);
		for(String ss:sp)
		{
			count++;
		}
		System.out.println("count of words is :"+count);*/
		for(int i=0;i<s.length();i++)
		{
		if(s.charAt(i)==' '&& s.charAt(i+1)!=' ')
		{
			count++;
		}
		}
		System.out.println("Count of Words is : "+count);
	}

}
