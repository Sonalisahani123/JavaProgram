package string;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ReverseStringScenario {
	
	/*
	 * public static void main(String[]args) { //reverse_word();
	 * reverse_each_word(); }
	 */
	
	public static void reverse_word()
	{
		/* I/p="i love java" 
		 * O/p="java love i"
		 * */
	   
		String s ="i love java";
		String reverse="";
		String[] word=s.split(" ");
		for(int i=word.length-1; i>=0; i--)
		{
			reverse= reverse+word[i]+" ";
		}
		
		System.out.println(reverse);
		/*
		 * for(String c:ch) { System.out.println(c.toString()); }
		 */
	}
	
	 public static void reverse_each_word()
	 {
		 /* I/p="it is cd" 
			 * O/p="ti si dc"
			 * */
		 
		 String s="it is cd";
		 String[] words=s.split(" ");
		 String reverse="";
		 String finalreverse="";
		 for(int i=0; i<words.length; i++)
		 {
			String word=words[i]; //it is
			for(int j=word.length()-1; j>=0; j--)
			{
				reverse=reverse+ word.charAt(j);//ti
				//System.out.println("reverse:" +reverse );
			}
			
			finalreverse=finalreverse+ reverse+ " ";//ti 
		 }
		 System.out.println("reverse:" +finalreverse );
	 }
	

	 
	 @Test
	 public static void reverse_each_word1()
	 {
		 
		 String s="sonu is good";//unos si doog
		 String finalreverse="";
		 String[]str =s.split(" ");
		 for(String word:str)
		 {
			  String reverse="";
			 for(int i=word.length()-1;i>=0;i--)
			 {
				 reverse=reverse+word.charAt(i);
				 
			 }
			 System.out.println("reverse   " + reverse);
			 finalreverse= finalreverse+reverse+" ";
			 System.out.println("finalreverse  >>>> " + finalreverse);
		 }
		 
		 System.out.println("finalreverse   " + finalreverse);
	 }
	 
	 
	 
	 
}
