package String;

public class Sum {

	public static void main(String[] args) {
		/*int num=541,rem,sum=0;
		while(num>0)
		{
			rem=num%10;
			num=num/10;
			sum=sum+rem;
		}
		System.out.println(sum);
		int num1=sum,rem1,sum1=0;
		
		
		while(num1>0)
		{
			rem1=num1%10;
			num1=num1/10;
			sum1=sum1+rem1;
		}
System.out.println(sum1);*/
		int num=541;
		while(num>=9)
		{
			int sum=0;
			while(num!=0)
			{
				sum=sum+num%10;
				num=num/10;
			}
			num=sum;
		}
		System.out.println(num);
			
	}

}
