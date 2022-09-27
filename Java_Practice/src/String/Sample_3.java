package String;

public class Sample_3 {

	public static void main(String[] args) {
		String s="a11b22c33";
		//char[] ch = s.toCharArray();
		int count=0;
		for(int i=0;i<s.length();i++)
		{
			//char c = ch[i];
			char c = s.charAt(i);
			System.out.println(c);
			if(c==49)
			{
				int a=c-48;
				count=count+a;
			}
			 else if(c==50)
			 {
				 int b=c-48;
				 count=count+b;
			 }
			 else if(c==51)
			 {
				 int c1=c-48;
				 count=count+c1;
			 }
		}
		System.out.println(count);
	}

}
