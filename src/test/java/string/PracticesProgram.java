package string;

import java.util.HashMap;
import java.util.Set;

public class PracticesProgram {
	
	public static void main(String[] args) {
	
		String s1="abcxza123kj";
		String s2="kdfjdl14tx";
		/* op:137 */
		
		String str="";
		int value=0;
		int value2=0;
		String str2="";
		
		  char[] ch =s1.toCharArray();
		 
		   for(char c:ch)
		   {
			   if(Character.isDigit(c))
			   {
				  String s=String.valueOf(c);
				 // System.out.println(s);
				  str=str+s;
				 value= Integer.parseInt(str);
				  //System.out.println(str);
			   }
			   
			   System.out.println(value);
		   }
		
		   char[] ch2 =s2.toCharArray();
			
			   for(char c2:ch2)
			   {
				   if(Character.isDigit(c2))
				   {
					  String ss=String.valueOf(c2);
					 // System.out.println(s);
					  str2=str+ss;
					 value= Integer.parseInt(str2);
					  //System.out.println(str);
				   }
				   
				   System.out.println(value2);
			   }
		
		
		
	
}
}



