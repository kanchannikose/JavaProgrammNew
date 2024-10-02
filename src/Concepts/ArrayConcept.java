package Concepts;

public class ArrayConcept {

	public static void main(String[] args) {
	/*	
		// Array :-> To store similar data type values in array variable
		
		
	//	Disadvantages:-> 1) Size is fixed, To overcome of this proble , we use collections- Arraylist, Hashtable-dynamic array
	//                   2)  Store only similar data type- to overcome use- object array 
		
		int a[]=new int[4];
		a[0]=10;
		a[1]=20;
		a[2]=30;
		a[3]=40;
		System.out.println(a[0]);
		System.out.println(a[1]);
		System.out.println(a[2]);
		System.out.println(a[3]);
	//	System.out.println(a[4]);  //ArrayIndexOutOfBoundsException
		
		System.out.println("Size of array "+a.length); //length of array

		
		
		
		
		//2) To print all the value of array use for loop
		for(int j=0; j<a.length; j++)
		{
			System.out.println(a[j]);
		}
		
		
		
		
		//3) Double array
		double d[]=new double[3];
		d[0]=22.22;
		d[1]=33.33;
		d[2]=44.44;
		System.out.println(d[0]);
		
		
		
		
		//4) Char array
		char ch[]=new char[3];
		ch[0]='d';
		ch[1]='#';
		ch[2]='k';
		System.out.println(ch[1]);
		System.out.println(ch[2]);
		
		
		
		//5) boolean array
		boolean status[] =new boolean[2];
		status[0]=true;
		status[1]=false;
		System.out.println(status[1]);
		
		
		
		//6) String array
		String s[]=new String[3];
		s[0]="Hello";
		s[1]="world";
		s[2]="java";
		System.out.println(s.length);
		System.out.println(s[2]);
		
		
		//7) Object array
		//To store diff data type values
		
		Object ob[]=new Object[6];
		ob[0]="Tom";
		ob[1]='j';
		ob[2]=36;
		ob[3]="20/3/1994";
		ob[4]=12.33;
		ob[5]="london";
		
		System.out.println(ob.length);
		System.out.println(ob[2]);
		System.out.println(ob[3]);
		System.out.println(ob[4]);
		System.out.println(ob[5]);
		
		
		
		*/
		
		
		
		
		
		
		//1) int array
		
		int a[]=new int[3];
		a[0]=100;
		a[1]=200;
		a[2]=300;
		System.out.println(a[0]);
		System.out.println(a[1]);
		System.out.println(a[2]);
		System.out.println("size of array :-> "+a.length);
		
		//2) To print all the values
		for(int i=0; i<a.length; i++)
		{
			System.out.println(a[i]);
		}
		
		//3)Double array
		
		System.out.println("********double array");
		double d[]=new double[3];
		d[0]=12.22;
		d[1]=34.56;
		d[2]=7.34;
		
		System.out.println(d[0]);
		System.out.println(d[2]);
		
		
		//4)char array
		System.out.println("*********char array");
		char ch[]=new char[2];
		ch[0]='k';
		ch[1]='s';
		
		System.out.println(ch[0]);
		System.out.println(ch[1]);
		
		//5)String array
		
		System.out.println("**********String array");
		
		String str[]=new String[4];
		str[0]="Tom";
		str[1]="Julie";
		str[2]="Bella";
		str[3]="Peter";
		
		//to print all the value-->while loop
		int i=0;
		while(i<str.length)
		{
			System.out.println(str[i]);
			i++;
		}
		
		
		//6) boolean array
		
		System.out.println("**********boolean  array");
		
		boolean bo[]=new boolean[2];
		bo[0]=false;
		bo[1]=true;
		
		System.out.println(bo[0]);
		System.out.println(bo[1]);
		
		
		//7) object array
		System.out.println("**********Object  array");
		Object ob[]=new Object[6];
		ob[0]="Edward";
		ob[1]=100;
		ob[2]=45.67;
		ob[3]='k';
		ob[4]=true;
		ob[5]="22/08/1995";
		
		for(int j=0; j<ob.length; j++)
		{
			System.out.println(ob[j]);
		}
		
		}

}
