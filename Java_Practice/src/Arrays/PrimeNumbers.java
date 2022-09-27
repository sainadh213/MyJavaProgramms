package Arrays;

public class PrimeNumbers {

	public static void main(String[] args) {
		int a[]= {2,3,4,5,6,7,8,9,10};
		//String prime="";
		for(int i=0;i<a.length;i++)
		{
			int count=0;
			int num=a[i];
			for(int j=2;j<=num;j++)
			{
				if(num%j==0)
				{
					count++;
				}
			}
			if(count==1)
			{
				System.out.println(num+" Is Prime Number");
				//prime=prime+" "+num;
			}
		}
		//System.out.println(prime);

	}

}
