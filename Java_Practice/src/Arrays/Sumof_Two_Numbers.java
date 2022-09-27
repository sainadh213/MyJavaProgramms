package Arrays;

public class Sumof_Two_Numbers {

	public static void main(String[] args) {
		int a[]= {1,5,4,2,3,6,10};
		for(int i=0; i<a.length; i++)
		{
			for(int j=0; j<a.length; j++)
			{
				if(a[i]+a[j]==7)
				{
					System.out.println(a[i]+"+"+a[j]+" =7 ");
				}
				else if(a[i] - a[j] == 7)
				{
					System.out.println(a[i]+"-"+a[j]+" =7 ");
				}
			}
		}

	}

}
