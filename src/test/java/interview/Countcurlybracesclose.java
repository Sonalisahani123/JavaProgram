package interview;

import org.testng.annotations.Test;

public class Countcurlybracesclose {
	
	/* ip: String s= "{{{{}}}}}}}}";
	 * op: count how many curly braces closed
	 *    count=4
	 * */
	
	@Test
	public static void check()
	{
		String s ="{{{{{}}}}}}}}}}}}}";
		int open = 0;
	      int oc =0;
	      int cc=0;
	      int count =0;
			/*
			 * for(int i=0;i<s.length();i++) { if(s.charAt(i)=='{') { count++; } }
			 */
	     
	      for(int i=0;i<s.length();i++)
	      {
	    	  if(s.charAt(i)=='{')
	    	  {
	           oc++;
               }else if(s.charAt(i)=='}')
               {
            	 cc++; 
            	 if(oc == cc)
            	 {
            		 break;
            	 }
               }
	    	 
	      }
	      System.out.println(oc);
	      System.out.println(cc);	
	      System.out.println(count);
	
	}
	
	public static int matchBrackets(String brackets){

	      int open = 0;
	      int count =0;
	      

	     for(int i=0;i<brackets.length();i++){
	        if(brackets.charAt(i)=='('){
	        open++;
	        }else if(brackets.charAt(i)==')'){
	         open--;
	        }
	        if(open<0){
	        count++;
	        open++;
	     }
	  }
	  return count+open;
	}
	
		
		
	}


