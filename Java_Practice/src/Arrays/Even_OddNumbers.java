package Arrays;

public class Even_OddNumbers {
		public static void main(String[] args) {
			
			//For printing even index
			int a[]= {10,2,3,4,5,6};
			System.out.println("even index values");
			
			for(int i=1;i<a.length;i=i+2)
			{
				System.out.println(a[i]);
			}
			
			System.out.println("odd index values");
			for(int i=0;i<a.length;i=i+2)
			{
				System.out.println(a[i]);
			}
			//For printing even numbers
			/*int a[]= {21,3,92,24,26,1};
			for(int i=0;i<a.length;i++)
			{
				if(a[i]%2==0)
				{
					
					System.out.println("Even values is :"+a[i]);
				}
			/*	else
				{
					
					System.out.println("Odd numbers is : "+a[i]);
				}*/
			
			}

	}


