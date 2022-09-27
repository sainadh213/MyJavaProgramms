package String;

public class Remove_andfirstletteruppercase {

	public static void main(String[] args) {
		 
				String s="WELCOME_TO_INDIA_TYSS";
				String s1 =s.replace("_", " ");
				String[] sp = s1.split(" ");
				String s2="";
				for(String s3:sp)
				{
					String fl=s3.substring(0,1);
					String rem=s3.substring(1).toLowerCase();
					s2=s2+" "+fl+rem;
					
				}
				 String s3=s2.trim();
				System.out.println(s3);

			}

		


	}


