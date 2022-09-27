package String;

public class Reverse_Without_Length {

	public static void main(String[] args) {
		String s="sainadh";
			char []c=s.toCharArray();
			String s1="";
			int count=0;
			for(char ch:c)
			{
				count++;
				s1=ch+s1;
			}
			
      System.out.println(s1);
      System.out.println(count);
	}

}
