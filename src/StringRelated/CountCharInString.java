package StringRelated;

public class CountCharInString {
	public static void main (String [] args)
	{
		String str="ag b c d e f";
		int len=str.length();
		int count=0;
		for(int i=0; i<len; i++)
		{
			if(str.charAt(i)!=' ')
			{
				count++;
			}
		}
		System.out.println("Number of char is "+count);
		

	}
	
}
