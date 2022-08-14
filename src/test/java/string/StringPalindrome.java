package string;

import org.testng.annotations.Test;

public class StringPalindrome {
public static void main(String[] args) {
		
		System.out.println(StringPalindrome.palindromecheck());
		
		}
	
	  public static boolean palindromecheck() {
		String s="nitin";
		String reverse="";
		for(int i=s.length()-1;i>=0;i--)
		{
			reverse=reverse+s.charAt(i);
		}
		
		 if(s.equalsIgnoreCase(reverse)){  
		        return true;  
		    }else{  
		        return false;  
		    }  
		
	}
	  
	  @Test
		public  void main() {
			String s="jatin";
	        String reverse="";
	        for(int i=s.length()-1;i>=0;i--)
	        {
	         reverse=reverse+ s.charAt(i);
	         //System.out.println("Reverse:"+reverse);
	        }
	   
	        if(s.equals(reverse))
	        {
	        System.out.println("given String is palindrome:"+ reverse);
	        }
	        else {
	        	System.out.println("given string is not palindrome:"+reverse);
	        }
	        }
	     

}
