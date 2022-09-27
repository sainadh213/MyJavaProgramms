package Practice;

public class StrongNumber {

	public static void main(String[] args) {
		int num=125,rem,strong=1;
		int cp=num,sum=1;
		//while(num>0)
		//{
			rem=num%10;
			num=num/10;		
		
			for(int j=rem;rem>0;j--)
			{
				sum=sum*j;
			}
		//}
		System.out.println(sum);
		/*
if(strong==cp)
{
System.out.println(strong+"strong");
	
	}
else
{
	System.out.println(strong+" not");
	}*/
}

}
