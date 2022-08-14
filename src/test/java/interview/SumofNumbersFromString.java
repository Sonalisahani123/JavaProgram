package interview;

public class SumofNumbersFromString {

	public static void main(String[] args) {
		
		/*
		 * ip:"qweRt8255qwe" 
		 * op:qweRtqwe 
		 * op:20
		 */
		String str="qweRt8255qwe";
		char[]ch =str.toCharArray();
		String value="";
		 int sum=0;
		for(char c:ch)
		{
			if(Character.isLetter(c))
			{
				value=value+c;
			}else {

				 String s1=String.valueOf(c);
				int temp= Integer.parseInt(s1);
				 sum=sum+temp;
			}
		}
		System.out.println(value);
		System.out.println(sum);
		

	}
	
	
	public static void otherway()
	{
		String s="qweRt8255qwe";
		char[] ch = s.toCharArray();
		int sum=0;
		String str="";
		 
		for(char c:ch)
		{
			if(Character.isDigit(c))
			{
				
				 String s1=String.valueOf(c);
				int temp= Integer.parseInt(s1);
				 sum=sum+temp;
			}else
			{
				str=str+c;
			
			}
			
		}
		System.out.println(sum);
		System.out.println(str);	
	}

}
