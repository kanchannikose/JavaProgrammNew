package Concepts;

public class TwoDimensionalArray {

	public static void main(String[] args) {
		
		
		/*
		String x[][]=new String[3][5];
		
		System.out.println(x.length);//row
		System.out.println(x[0].length);//column
		
		
		//1st row
		x[0][0]="A";
		x[0][1]="B";
		x[0][2]="C";
		x[0][3]="D";
		x[0][4]="E";
		

		
		
		//2nd row
				x[1][0]="A1";
				x[1][1]="B1";
				x[1][2]="C1";
				x[1][3]="D1";
				x[1][4]="E1";
			
				
				
				
				
				//3rd row
				x[2][0]="A2";
				x[2][1]="B2";
				x[2][2]="C2";
				x[2][3]="D2";
				x[2][4]="E2";
				
				
		System.out.println(x[1][3]);
		System.out.println(x[0][3]);
		System.out.println(x[2][3]);
		
		
		//To print all the values use for loop
		
		for(int r=0; r<x.length; r++)
		{
			for(int c=0; c<x[0].length; c++)
			{
				System.out.println(x[r][c]);
			}
		}
				
	*/
		
		
		
		
		/*
		
		String x[][]=new String[2][3]; 
		System.out.println(x.length);//row
		System.out.println(x[0].length);//column
		
		
		//1st row
		x[0][0]="X";
		x[0][1]="Y";
		x[0][2]="Z";
		
		
		//2nd row
		x[1][0]="X";
		x[1][1]="Y";
		x[1][2]="Z";
			
		
		
		
		System.out.println(x[1][2]);
		System.out.println(x[0][1]);
		
		//To print all the values use for loop
	
		for(int r=0; r<x.length; r++)
		{
			for(int c=0; c<x[0].length; c++)
			{
				System.out.println(x[r][c]);
			}
		}
		
		
		*/
		
		
		char x[][]=new char[2][3];
		System.out.println(x.length);
		System.out.println(x[0].length);
		
		//1st row
		x[0][0]='S';
		x[0][1]='T';
		x[0][2]='U';
		
		//2nd row
		x[1][0]='V';
		x[1][1]='W';
		x[1][2]='X';
		
		System.out.println(x[1][0]);
		System.out.println(x[1][1]);
		System.out.println(x[1][2]);
		System.out.println(x[0][0]);
		System.out.println(x[0][1]);
		System.out.println(x[0][2]);
		
		
		//To print all the values
		System.out.println("print all the value-->use for loop");
		for(int r=0; r<x.length; r++)
		{
			for(int c=0; c<x[0].length; c++)
			{
				System.out.println(x[r][c]);
			}
		}
		
		
		
		

	}

}
