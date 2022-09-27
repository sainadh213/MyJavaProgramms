package String;

import java.util.Arrays;

public class Assignment_2 {

	public static void main(String[] args) {
		/*int a[]= {0,1,0,0,1,1,0,1};
		int temp;
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]>a[j])
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		
		System.out.println(Arrays.toString(a));*/
		int []a= {0,1,0,0,1,1,0,1};
		int []b=new int[a.length];
		int m=0;
		int n=b.length-1;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>0)
			{
				b[n]=a[i];
				n--;
	
			}
			else
			{
				b[n]=a[i];
				m++;
			}
		}
		System.out.println(Arrays.toString(b));

	}
}
