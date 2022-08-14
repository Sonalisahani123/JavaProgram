package interview;

import org.testng.annotations.Test;

public class CountStringNumberFromString {
	
	/*
	 * Ip: String s="abcd123"; 
	 * op:string count 4 
	 * number count 3
	 */
	
	@Test
	public void count()
	{
		String s="abcd12345";
		char[] ch = s.toCharArray();
		int numbercount =0;
		int stringcount=0;
		for(char c:ch)
		{
			if(Character.isDigit(c))
			{
				numbercount++;
			} else
			{
				stringcount++;
			}
		}
		
		System.out.println("string count is :" +stringcount );
		System.out.println("string count is :" + numbercount);
		
	}
	
	/*
	 * String s ="123 abc @ #,?&" 
	 * count number,string,space,symbols
	 */
	@Test
    public void countAll()
    {
    	String s="abc 123  @ #,?&";
    	char[] ch =s.toCharArray();
    	int nubmer=0;
    	int letter=0;
    	int space =0;
    	int other =0;
    	for(char c:ch)
    	{
    		if(Character.isLetter(c))
    		{
    			letter++;
    		}else if(Character.isDigit(c))
    		{
    			nubmer++;
    		}else if(Character.isSpaceChar(c))
    		{
    			space++;
    		}else
    		{
    			other++;
    		}
    	}
    	System.out.println("nubmer " + nubmer);
    	System.out.println("letter " + letter);
    	System.out.println("space " + space);
    	System.out.println("other " + other);
    
    }
	
	@Test
	public void replace1()
	{
		String str="123 abc @ #,?&";
		String s1=str.replaceAll("[^a-zA-Z0-9]", "");
	    System.out.println(s1);
	    //then logic same to find out number and alphabet count
		
	}

	
	
	
	

}
