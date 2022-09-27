package Arrays;

public class Second_Minium {

	public static void main(String[] args) {
		int a[]={51,88,94,24,57,14};
		int min=a[0];
		int secmin=a[0];
		for(int i=1;i<a.length;i++)
		{
			if(a[i]<min)
			{
				secmin=min;
				min=a[i];
			}
			else if(a[i]<secmin)
			{
				secmin=a[i];
			}
		}
		System.out.println(secmin);

	}

	}


