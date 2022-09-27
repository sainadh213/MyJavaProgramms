package Arrays;

import java.util.Arrays;

public class Try {
public static void main(String[] args) {
		
		int a[]= {3,4,5,6,1,2};
//		Arrays.sort(a);
//		System.out.println(Arrays.hashCode(a));
		System.out.println(Arrays.toString(a));
//		for(int i=0;i<a.length;i++)
//		{
			boolean rot=true;
			int temp;
				if(rot==true)
				{
					temp=a[0];
					a[0]=a[a.length-1];
					a[a.length-1]=temp;
					for(int k=0;k<a.length;k++)
					{
						System.out.print(a[k]+" ");
					}
				}
				else if(rot==false)
				{
					for(int i=0;i<a.length;i++)
					{
						System.out.print(a[i]+" ");
					}
				}
			
//		}
	}
}
