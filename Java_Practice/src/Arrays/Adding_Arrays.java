package Arrays;

public class Adding_Arrays {
public static void main(String[] args) {
	int a[]= {5,4,3,1,2,1};
	int b[]= {1,2,3,4,5,6,7,8};
	int length=a.length;
	if(a.length<b.length)
	{
		length=b.length;
	}
	for(int i=0;i<length;i++)
	{
		try 
		{
			System.out.print(a[i]+b[i]+" ");
			}
		catch(Exception e)
		{
			if(a.length>b.length)
			{
				System.out.print(a[i]+" ");
			}
			else
			{
				System.out.print(b[i]+" ");
			}
		}
	}
}
}
