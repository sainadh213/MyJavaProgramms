package Practice;

public class SecondHighest {
	public static void max(int[] args) {
		int max=args[0], secondmax=args[0];
		for(int i=1;i<args.length;i++)
		{
			if(args[i]>max)
			{
				secondmax=max;
			max=args[i];
		}
		else if(args[i]>secondmax)
		{
			secondmax=args[i];
		}
		}
		System.out.println("Second Highest No :"+secondmax);
	}

	public static void main(String[] args) {
		int a[]= {5321,2458,213,5647,8963};
		max(a);
		

	}

}
