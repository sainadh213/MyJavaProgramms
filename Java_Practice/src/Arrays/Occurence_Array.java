package Arrays;

public class Occurence_Array {

	public static void main(String[] args) {
		int a[]= {20,25,45,49,25,34,24,78,25};
		int n=25;
		int count=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==n)
			{
				count++;
			}
		}
		System.out.println(n+" Occures "+count+" times is Given Array");

	}

}
