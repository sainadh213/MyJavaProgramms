package Arrays;

import java.util.LinkedHashSet;

public class Duplicates {

public static void main(String args[])
{      
   int a[]= {24,16,54,42,24,49,41,16,87,49,16,47,54,24};  
    
   /* System.out.print("Duplicate elements in given Array:"+" ");  
    
    for(int i=0;i<a.length;i++) 
    {  
        for(int j=i+1;j<a.length;j++) 
        {  
            if(a[i]==a[j])  
                System.out.print(a[i]+" ");  
        }  
    } */
   LinkedHashSet<Integer>aa=new LinkedHashSet();
   for(int i=0;i<a.length;i++)
   {
	   aa.add(a[i]);
   }
   for(int aaa:aa)
   {
	   int count=0;
	   for(int j=0;j<a.length;j++)
	   {
		   if(a[j]==aaa)
		   {
			   count++;
		   }
	   }
   
	   if(count==1)
	   {
		   System.out.println(aaa+" - "+count);
	   }
   
 }
	
	}
}
 
