package interview;

public class Patterna4b16 {

	public static void main(String[] args) {
	print(5);

	}
	
	
	public static void print(int printUpto)
	{
		//a4c16e36g64
		StringBuilder sb = new StringBuilder();
		int j=1;
		int k=1;
		
		for(int i=97;i<=122;i++)
		{
			if(i % 2 != 0)
			{
				sb.append((char)i);
			}
			else {
				sb.append(j*j);	
			}
			
			j = j+1;
			k++;
			if(k== printUpto)
			{
				break;
			}
				
		}
		System.out.println(sb);
	}
	

}
