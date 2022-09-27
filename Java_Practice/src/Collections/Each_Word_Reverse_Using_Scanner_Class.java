package Collections;

import java.util.ArrayList;
import java.util.Scanner;

public class Each_Word_Reverse_Using_Scanner_Class {

	public static void main(String[] args) {
		ArrayList<String>al=new ArrayList<>();
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter values");
		for(int i=0;i<5;i++)
		{
			String val = sc.nextLine();
			
			al.add(val);
		}
		for(String st:al)
		{
			String rev="";
			//int l=st.length();
			for(int i=st.length()-1;i>=0;i--)
			{
				rev=rev+st.charAt(i);
			}
			System.out.print(rev+" ");
		}
		System.out.println();
		System.out.println(al);

	}

}
