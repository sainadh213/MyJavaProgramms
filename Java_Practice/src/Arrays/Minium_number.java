package Arrays;

public class Minium_number {

	public static void main(String[] args) {

  int a[]= {25,11,35,86,114};
  int min=a[0];
  for(int i=1;i<a.length;i++)
  {
	  if(a[i]<min)
	  {
		  min=a[i];
	  }
  }
    System.out.println(min);
	}

}
