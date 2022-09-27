package Arrays;

public class Chracter_Array {

	public static void main(String[] args) {
		char ch[]= {'s','a','i','n','a','d','h'};
		System.out.print("Printing of Character Array :");
		  for(int i=0;i<ch.length;i++)
		  {
			  System.out.print(ch[i]+" ");
		  }
		  System.out.println();
		  System.out.print("printing of Character Array in Reverse Order :");
		  for(int l=ch.length-1;l>=0;l--)
		  {
			  System.out.print(ch[l]+" ");
		  }

	}

}
