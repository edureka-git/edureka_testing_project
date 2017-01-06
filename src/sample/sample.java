package sample;

public class sample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String cURL ="http://www.edureka.co/?utm_source=Referral_Program&offercode=06419201412332006&amb=m3Mt3wDdktiEf2i2RlneTw%3D%3D&campaignid=3&utm_campaign=ref_3&utm_medium=email";
		//String str[] = cURL.split("/",3);
		//System.out.println(str[0]);
		
		
		String str1 = cURL.replace("http://www.edureka.co","test.edureka.in");
		System.out.println(str1);
				
		System.out.println("Working Directory = " +
	              System.getProperty("user.dir"));
				
		/*for (String retval: cURL.split("/")){
	         System.out.println(retval);
	      }
        */
		int c= 'Z';
		System.out.println(c);
		
		  
		String s1="Full" ,s2="";
		for(int i=0;i<s1.length();i++)
		{
			char chara = s1.charAt((i));
			if(c>97&&c<122)
			s2 += Character.toUpperCase(chara);			
			else if(c>65 && c<90)
			s2 += Character.toLowerCase(chara);	
			
			System.out.println(s2);
		}
		
		  System.out.println(s2);
		  //System.out.println("hello");
		  
	}

}
