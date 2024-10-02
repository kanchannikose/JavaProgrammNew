package ArrayRelated;

import java.util.Arrays;

public class MaxAndMinEleCombine {

	public static void main(String[] args) {
		
		
		
		/*
		
		//-------------->Method 1<-------------------
		
		
		
		int a[]= {1,423,6,46,34,23,13,53,4};
		int max=a[0];
		int min=a[0];
		for(int i=0; i<a.length; i++)
		{
			if(a[i]>max)
			{
				max=a[i];
			}
			else if(a[i]<min)
			{
				min=a[i];
			}
		}
		System.out.println("max :- "+ max);
		System.out.println("min :- "+min);
		
		*/
		
		
		
		/*
		
		
		//-------------->Method 2<-------------------
		
		
		int a[]= {1,423,6,46,34,23,13,53,4};
		Arrays.sort(a);
		System.out.println("min:-> "+a[0]+ "   max:-> " +a[a.length-1]);
		
		
		
		*/
		
		
		/*
		
		int a[]= {1,423,6,46,34,23,13,53,4};
		int max=a[0];
		int min=a[0];
		for(int i=0; i<a.length; i++)
		{
			if(a[i]>max)
			{
				max=a[i];
			}
			else if(a[i]<min)
			{
				min=a[i];
			}
		}
		System.out.println("max :- "+ max +" min:- "+min);
		
		
		
		*/
		
		/*
		
		int a[]= {1,423,6,46,34,23,13,53,4};
		Arrays.sort(a);
		
		System.out.println("min :-> "+a[0] + " max:-> "+a[a.length-1]);
		
		
		*/
		
		
		
		
		
		
		
		
		
	/*	
		
		//----------->Method 1<-----------------
		
		int a[]= {10, 20, 30, 40, 50, 60, 70};
		int min=a[0];
		int max=a[0];
		for(int i=0; i<a.length; i++)
		{
			if(a[i]<min)
			{
				min=a[i];
			}
			else if(a[i]>max)
			{
				max=a[i];
			}	
		}
		System.out.println("min:- "+min);
		System.out.println("max:- "+max);
		
		
	*/	
	
		
		/*
		
		int a[]= {8, 20, 30, 90, 50, 60, 70};
		int min=a[0];
		int max=a[0];
		for(int i=0; i<a.length; i++)
		{
			if(a[i]>max)
			{
				max=a[i];
			}
			else if(a[i]<min)
			{
				min=a[i];
			}
		}
		System.out.println("min:- "+min);
		System.out.println("max:- "+max);
		
		*/
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*
		
		
		//----------->Method 2<-----------------
		int a[]= {13, 8, 20, 96, 40, 80, 60, 70};
	    Arrays.sort(a);
	    System.out.println("After sorting:- "+Arrays.toString(a));
	    System.out.println("min :- "+a[0] +"  max:- "+a[a.length-1]);
	


*/
		
		/*
		

		//----------->Method 1<-----------------
		
		int a[]= {13, 8, 20, 96, 40, 80, 60, 70};
		int max=a[0];
		int min=a[0];
		for(int i=0; i<a.length; i++)
		{
			if(a[i]>max)
			{
				max=a[i];
			}
			else if(a[i]<min)
			{
				min=a[i];
			}
		}
		System.out.println(max+" ->max");
		System.out.println(min+" ->min");
		
		*/
		
		
		/*
		
		int a[]= {13, 8, 20, 96, 40, 80, 60, 70};
		Arrays.sort(a);
		System.out.println(Arrays.toString(a));
		System.out.println("min "+a[0]);
		System.out.println("max "+a[a.length-1]);
		
		*/
		/*
		
		int a[]= {13, 8, 20, 96, 40, 80, 60, 70};
		int min=a[0];
		int max=a[0];
		for(int i=0; i<a.length; i++)
		{
			if(a[i]<min)
			{
				min=a[i];
			}
			else if(a[i]>max)
			{
				max=a[i];
			}
		}
		System.out.println(max+" ->max");
		System.out.println(min+" ->min");
		
		*/
		/*
		int a[]= {13, 8, 20, 96, 40, 80, 60, 70};
		int min=a[0];
		int max=a[0];
		for(int i=0; i<a.length; i++)
		{
			if(a[i]>max)
			{
				max=a[i];
			}
			else if(a[i]<min)
			{
				min=a[i];
			}
		}
		System.out.println("max "+ max );
		System.out.println("min "+min);
		
		*/
		
		
		
		
		/*
		
		int a[]= {13, 4, 8, 20, 96,99, 40, 80, 60, 70};
		int max=a[0];
		int min=a[0];
		for(int i=0; i<a.length; i++)
		{
			if(a[i]>max)
			{
				max=a[i];
			}
			else if(a[i]<min)
			{
				min=a[i];
			}
		}
		System.out.println("max "+ max );
		System.out.println("min "+min);
		
		
		*/
		
		
		/*
		
		int a[]= {13, 4, 8, 20, 96, 99, 40, 80, 60, 70};
		int max=a[0];
		int min=a[0];
		for(int i=0; i<a.length; i++)
		{
			if(a[i]>max)
			{
				max=a[i];
			}
			else if(a[i]<min)
			{
				min=a[i];
			}
		}
		System.out.println("max "+ max );
		System.out.println("min "+min);
		
		
		*/
		
		/*
		
		int a[]= {13, 4, 8, 20, 96, 99, 40, 80, 60, 70};
		int max=a[0];
		int min=a[0];
		for(int i=0; i<a.length; i++)
		{
			if(a[i]>max)
			{
				max=a[i];
			}
			else if(a[i]<min)
			{
				min=a[i];
			}
		}
		System.out.println("max "+ max );
		System.out.println("min "+min);
		
		*/
		
		
		/*
		
		
		int a[]= {13, 4, 8, 20, 96, 99, 40, 80, 60, 70};
		int max=a[0];
		int min=a[0];
		for(int i=0;i<a.length; i++)
		{
			if(a[i]>max)
			{
				max=a[i];
			}
			else if(a[i]<min)
			{
				min=a[i];
			}
		}
		System.out.println("max "+ max );
		System.out.println("min "+min);
		
		
		*/
		
		
		
		
		
		/*
		
		int a[]= {13, 4, 8, 20, 96, 99, 40, 80, 60, 70};
		int min=a[0];
	    int max=a[0];
	    for(int i=0; i<a.length; i++)
	    {
	    	if(a[i]>max)
	    	{
	    		max=a[i];
	    	}
	    	else if(a[i]<min)
	    	{
	    		min=a[i];
	    	}
	    }
	    System.out.println("max "+ max );
		System.out.println("min "+min);
		
		
		*/
		
		/*
		
		int a[]= {11, 33, 4, 7, 90, 102, 22, 2};
		int max= a[0];
		int min =a[0];
		for(int i=0; i<a.length; i++)
		{
			if(a[i]<max)
			{
				max=a[i];
			}
			else if(a[i]>min)
			{
				min=a[i];
			}
		}
		System.out.println("max :  "+max);
		System.out.println("min :  "+min);
		
		
		*/
		
		
		
		
		
		
		
		int a[]= {11, 33, 4, 7, 90, 102, 22, 2};
	    Arrays.sort(a);
	    System.out.println(Arrays.toString(a));
	    System.out.println("min : "+a[0]);
	    System.out.println("max : "+a[a.length-1]);
	    System.out.println("second largest : "+a[a.length-2]);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*

		int a[]= {13, 4, 8, 20, 96, 99, 40, 80, 60, 70};
		Arrays.sort(a);
		System.out.println(Arrays.toString(a));
		System.out.println("min   "+a[0]);
		System.out.println("max    "+a[a.length-1]);
		
		*/
		
		
		
		
		
		
		/*
		
		
		
		int a[]= {13, 4, 8, 20, 96, 99, 40, 80, 60, 70};
		Arrays.sort(a);
		System.out.println(Arrays.toString(a));
		System.out.println("max :- "+a[a.length-1]);
		System.out.println("min :- "+a[0]);
		System.out.println("second largest :-  "+a[a.length-2]);
		
		*/
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*
		
		int a[]= {13, 4, 8, 20, 96, 99, 40, 80, 60, 70};
		Arrays.sort(a);
		System.out.println(Arrays.toString(a));
		System.out.println("min :- "+a[0]);
		System.out.println("max:- "+a[a.length-1]);
		
		*/
		
		
		
		
		
		
		
		/*
		
		int a[]= {13,4, 8, 20, 96,99, 40, 80, 60, 70};
		Arrays.sort(a);
		System.out.println(Arrays.toString(a));
		System.out.println("min :- "+a[0]);
		System.out.println("max :- "+a[a.length-1]);
		
		*/
		
		
		/*
		
		
		
		int a[]= {13,4, 8, 20, 96,99, 40, 80, 60, 70};
		Arrays.sort(a);
		System.out.println(Arrays.toString(a));
		System.out.println("min "+a[0]);
		System.out.println("max "+a[a.length-1]);
		
		*/
		
		
		/*
		
		int a[]= {13,4, 8, 20, 96,99, 40, 80, 60, 70};
		Arrays.sort(a);
		System.out.println(Arrays.toString(a));
		System.out.println("min "+a[0]);
		System.out.println("max "+a[a.length-1]);
		
		*/
		/*
		
		int a[]= {13,4, 8, 20, 96,99, 40, 80, 60, 70};
		Arrays.sort(a);
		System.out.println(Arrays.toString(a));
		System.out.println("min:- "+a[0]);
		System.out.println("max:- "+a[a.length-1]);
		
		*/
		/*
		
		int a[]= {13,4, 8, 20, 96,99, 40, 80, 60, 70};
		Arrays.sort(a);
		System.out.println(Arrays.toString(a));
		System.out.println("min:- "+a[0]);
		System.out.println("max:- "+ a[a.length-1]);
		
		
		*/
		
		/*
		
		
		int a[]= {13,4, 8, 20, 96,99, 40, 80, 60, 70};
		Arrays.sort(a);
		System.out.println(Arrays.toString(a));
		System.out.println("min:- "+a[0]);
		System.out.println("max:- "+a[a.length-1]);
		
		*/
	}

}
