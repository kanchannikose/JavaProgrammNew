package Concepts;
import java.util.ArrayList;

public class ArrayListRel {

	public static void main(String[] args) {
		
		/*
		
		  ArrayList ar = new ArrayList();
		  
		  ar.add(100); //0
		  ar.add(200); //1
		  ar.add(50);  //2
		  
		  System.out.println(ar.size());
		  
		  ar.add('k');     //3
		  ar.add("Tom");     //4
		  ar.add(908979879); //5
		  
		  System.out.println(ar.size());
		  
		  ar.add(888);    //6
		  ar.add(33.33);  //7
		  ar.add("kitti"); //8
		  ar.add(500);  //9
		  
		  ar.remove(9);
		
		  System.out.println(ar.size());
		  
		  System.out.println(ar.get(4));
		  System.out.println(ar.get(8));
		  System.out.println(ar.get(7));
		  System.out.println(ar.get(5));
		
		  System.out.println("************");
		  
		  
		  //To print all the values of arraylist-->Use for loop
		  
		  for(int i=0; i<ar.size(); i++)
		  {
			  System.out.println(ar.get(i));
		  }
		  
		  
		  System.out.println("***********************"); 
		  
		  ArrayList<String> car=new ArrayList<String>();
		  car.add("Volvo"); //0
		  car.add("Bmw"); //1
		  car.add("Ford");//2
		  
		System.out.println(car.get(1));
		for(int i=0; i<car.size(); i++)
		{
			System.out.println(car.get(i));
		}

		
		
		
		 System.out.println("***********************"); 
		 
		 //generic method
		 ArrayList<Integer> num=new ArrayList<Integer>();
		 num.add(123);
		 num.add(6787);
		 System.out.println(num.get(0));
		 
		 
		 
		 
		 System.out.println("***********************"); 
		 ArrayList<Character> ch=new ArrayList<Character>();
		 
		 ch.add('k');
		 ch.add('l');
		 System.out.println(ch.get(1));
		 
		 
		 
		 System.out.println("***********************"); 
		 ArrayList<Boolean> bo=new ArrayList<Boolean>();
		 
		 bo.add(true);
		 bo.add(false);
		 bo.add(true);
		 
		 for(int i=0; i<bo.size(); i++)
		 {
			 System.out.println(bo.get(i));
		 }
		 bo.remove(2);
		 System.out.println(bo.size());
		 
		 
		 
		 */
		
		
		
		ArrayList ar=new ArrayList();
		ar.add(123);  //0
		ar.add("Tom"); //1
		ar.add(true);  //2
		
		System.out.println(ar.size());
		
		ar.add('h'); //3
		ar.add(4.5);  //4
		ar.add(1223444); //5
		
		System.out.println(ar.size());
		
		System.out.println(ar.get(4));
		System.out.println(ar.get(1));
		
		System.out.println("************");
		for(int i=0; i<ar.size(); i++)
		{
			System.out.println(ar.get(i));
		}
		
		System.out.println("************");
		
		ArrayList<Integer> num=new ArrayList<Integer>();
		num.add(123444);
		num.add(98765);
		num.add(23456);
		
		for(int i=0; i<num.size(); i++)
		{
			System.out.println(num.get(i));
		}
		
		
		System.out.println("************");
	
		
		
	}

	
		
}


