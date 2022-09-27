package Practice;

public class SecondLowestNo {
	public static void min(int[] args) {
		int min=args[0], secondmin=args[0];
		for(int i=1;i<args.length;i++)
		{
			if(args[i]<min)
			{
				secondmin=min;
			min=args[i];
		}
		else if(args[i]<secondmin)
		{
			secondmin=args[i];
		}
		}
		System.out.println("Second Lowest No :"+secondmin);
	}

	public static void main(String[] args) {
		int a[]= {5321,2458,213,5647,8963};
		min(a);
		

	}

}


