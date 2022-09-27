package Practice;

public class MaxValue {
public static void max(int args[])
{
	int max=args[0];
	for(int i=1;i<args.length;i++)
	{
		if(args[i]>max)
		{
			max=args[i];
		}
	}
	System.out.println("Lowest No :"+max);
	}
	public static void main(String[] args) {
		int a[]= {589,4532,246,5763,1245};
		max(a);
		
	}
}
