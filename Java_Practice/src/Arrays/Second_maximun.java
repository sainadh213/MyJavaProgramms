package Arrays;

public class Second_maximun {

	public static void main(String[] args) {
		int a[]={51,88,94,24,57,14};
		int max=a[0];
		int secmax=a[0];
		for(int i=1;i<a.length;i++)
		{
			if(a[i]>max)
			{
				secmax=max;
				max=a[i];
			}
			else if(a[i]>secmax)
			{
				secmax=a[i];
			}
		}
		System.out.println(secmax);

	}

}
