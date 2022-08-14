package string;

import org.testng.annotations.Test;

public class ReverseAString {
	
	@Test
	  public void reverse()
	  {
		  String s ="sonali";
		  String reverse ="";
		  for(int i=s.length()-1;i>=0;i--)
		  {
			  reverse = reverse+s.charAt(i);
		  
		  
		  System.out.println("reverse of string:" + reverse);
	  }
	}
	
	
	public static void doreverse()
	{
		String reverse="";
		String s="sonali";
		char [] ch=s.toCharArray();
		
		for(int i=ch.length-1;i>=0;i--){
			//System.out.println("i length:"+i);
			System.out.println(ch[i]);
		}
				
		
	}

	private static void doreverse1() {
	 String s="sonali";
	 String rev="";
	 for(int i=s.length()-1;i>=0;i--)
	 {
		 rev=rev+s.charAt(i);
		
	 }
	 System.out.println("reverse of a string:"+ rev);
		
	}

}

	
	

