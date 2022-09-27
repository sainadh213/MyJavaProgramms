package Arrays;

public class Remove_Duplicates {

	public static void main(String[] args) {
		
		//REMOVE DUPLICATES
						int arr[]= {4,5,2,1,5,3,2,1};
					//output= 4,5,2,1,3
						for (int i =0;i< arr.length;i++)
						{
							for (int j=i+1; j<arr.length;j++) 
							{
				
								if(arr[i]==arr[j]) 
								{
								arr[j]=0;	
							}
						}
							if(arr[i]!=0)
								System.out.println(arr[i]);
						}	
				
				//DUPLICATE REMOVE FROM STRING


				//		String str= "testyantra";
				//
				//		char[] arr = str.toCharArray();
				//
				//		for (int i = 0; i < arr.length; i++) 
				//		{
				//			for (int j = i+1; j < arr.length; j++) 
				//			{
				//				if(arr[i]==arr[j]) {
				//					arr[j]='0';
				//				}
				//			}	
				//
				//			if(arr[i]!='0')
				//				System.out.print(arr[i]);
				//		}
		

		
	}
}
