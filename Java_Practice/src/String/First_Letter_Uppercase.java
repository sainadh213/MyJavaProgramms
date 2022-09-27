package String;

public class First_Letter_Uppercase {

	public static void main(String[] args) {
		String s="welcome to india";
		String[] sp = s.split(" ");
		String s1="";
		for(String s2:sp)
		{
			String fl=s2.substring(0,1).toUpperCase();
			String rem=s2.substring(1);
			s1=s1+" "+fl+rem;
			
		}
		 String s2=s1.trim();
		System.out.println(s2);

	}

}
