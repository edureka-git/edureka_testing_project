package sample;

public class Prime {

	public static void main(String[] args) {
	/*
	 * To check if a number is prime or not, we need to check for factors less than the squre root of the number. Suppose if 
	 * the number is 18 =2*3*3, the sqrt= 4.243, which will include the factors 2 , 3. So if the number gets divided by 2 or3 then 
	 * it is composite number if not its prime.
	 */
		for (int i=1;1<20;i++)
		{
			for (int j=2; j<Math.sqrt(i);j++ )
			{
				if(j%i!=0)
				System.out.println(i);
			}
			
		}
		
		
		
		
	/*-------------------------------------------------------------------------------
	 * 	int i =0;
		int num =0;
		//Empty String
		String  primeNumbers = "";

		for (i = 1; i <= 100; i++)         
		{ 		  	  
			int counter=0; 	  
			for(num =i; num>=1; num--)
			{
				if(i%num==0)
				{
					counter = counter + 1;
					System.out.print(num+ " ");
				}
				System.out.println();
			}
			if (counter ==2)
			{
				//Appended the Prime number to the String
				primeNumbers = primeNumbers + i + " ";
				System.out.println();
			}	
		}	
		System.out.println("Prime numbers from 1 to 100 are :");
		System.out.println(primeNumbers); */
	//	-----------------------------------------------------------------------------
		
		
		
		
		
		
	}

}


