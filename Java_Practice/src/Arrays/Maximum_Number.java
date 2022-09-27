package Arrays;

public class Maximum_Number {

	public static void main(String[] args) {
		int a[]= {24,56,99,2,58,46};
		int max=a[0];
		for(int i=1;i<a.length;i++)
		{
			if(a[i]>max)
			{
				max=a[i];
			}
		}
		System.out.println(max);

	}

}
