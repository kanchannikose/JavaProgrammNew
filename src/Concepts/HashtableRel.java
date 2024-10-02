package Concepts;

import java.util.Hashtable;

public class HashtableRel {

	public static void main(String[] args) {
	
		Hashtable hs=new Hashtable();
		
		hs.put("A", "Hello"); //0
		hs.put("B", "Tom");   //1
		hs.put("C", "Julie"); //2
		
		System.out.println(hs.size());
		
		hs.put(1, 100);  //3
		hs.put(2, 200);  //4
		hs.put(3, 300);  //5
		
		System.out.println(hs.size());
		
		hs.put(4, 400);  //6
		hs.put(5, "Jojo");  //7
		
		System.out.println(hs.size());
		
		
		
		


		
		System.out.println("*************");
		
		
		Hashtable<Integer, Integer> hs1=new Hashtable<Integer, Integer>();
		
		hs1.put(6, 60000);//0
		hs1.put(7, 77777);//1
		hs1.put(8, 8888); //2
		
		System.out.println(hs1.size());
		System.out.println(hs1.get(6));
		System.out.println(hs1.get(7));
		System.out.println(hs1.get(8));
		
		
		

	}

}
