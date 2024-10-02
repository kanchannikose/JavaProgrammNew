package CollectionConcept;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Set;

public class HashtableConcept {

	public static void main(String[] args) {
		
		/*
		Hashtable h1=new Hashtable();
		
		h1.put(1, "Economics");
		h1.put(2, "Biology");
		h1.put(3, "Physics");
		
		
		//1) clone/copy
		
		Hashtable h2=new Hashtable();
		
		h2=(Hashtable) h1.clone();
		
		System.out.println("The value of h1 "+h1);
		System.out.println("The value of h2 "+h2);
		
		
		
		
		//2)clear 
		
		h2.clear();
		System.out.println("The value of h1 "+h1);
		System.out.println("The value of h2 "+h2);
		
		
		
		//3) Contains Value
		Hashtable ht1=new Hashtable();
		ht1.put("M", "Math");
		ht1.put("S", "Science");
		ht1.put("H", "History");
	//	ht1.put("H", "History");   It contain only unique value	
		//Not accept null key and null value
		
		if(ht1.containsValue("Math"))
		{
			System.out.println("Value is found");
		}
		
		
		
		//4) To print all the values--->Enumeration
		Enumeration enu = ht1.elements();
		while(enu.hasMoreElements())
		{
			System.out.println(enu.nextElement());
		}
		
		
		//5)To print all the values---->Entry Set
		Set ent = ht1.entrySet();
		System.out.println(ent);
		
		
		
		
		//6)Check both array are equal
		Hashtable t1=new Hashtable();
		t1.put("A", "One");
		t1.put("B", "two");
		t1.put("C", "three");
		
		Hashtable t2=new Hashtable();
		t2.put("A", "One");
		t2.put("B", "two");
		t2.put("C", "three");
		if(t2.equals(t1))
		{
			System.out.println("both are equal");
		}
		
		
		System.out.println(t1.get("B"));
		System.out.println(t2.get("C"));
		
		System.out.println("The value of hashcode "+ t1.hashCode());
		System.out.println("The value of hashcode "+ t2.hashCode());
		System.out.println("The value of hashcode "+ht1.hashCode());
	*/
		
		
		
		
		
		
		
		
		
		
		
		/*
		
		
		Hashtable ht=new Hashtable();
		ht.put(1, "Nagpur");
		ht.put(2, "Chndrapur");
		ht.put(3, "Nanded");
		ht.put(4, "Bhandara");
		
		System.out.println("The value of ht:-> "+ht);
		
		Hashtable ht1=new Hashtable();
		
		ht1=(Hashtable) ht.clone();
		
		System.out.println("The value of ht1:-> "+ht1);
	
		ht1.clear();
		System.out.println("The value of ht1:-> "+ht1);
		
		//Contains value
		if(ht.containsValue("Chndrapur"))
		{
			System.out.println("Value found");
		}
		
		
		//To print all the value--->Enumeration
		System.out.println("print all the value:--> Enumeration");
		Enumeration emm = ht.elements();
		while(emm.hasMoreElements())
		{
			System.out.println(emm.nextElement());
		}
		
		//To print all the value--->Entry set
		System.out.println("print all the value:--> Entry set");
		Set s = ht.entrySet();
		System.out.println(s);
		
		
		//Check both array equal
		Hashtable ht2=new Hashtable();
		ht2.put(1, "Nagpur");
		ht2.put(2, "Chndrapur");
		ht2.put(3, "Nanded");
		ht2.put(4, "Bhandara");
		
		if(ht2.equals(ht))
		{
			System.out.println("both array are equal");
		}
		
		System.out.println(ht2.get(3));
		System.out.println(ht2.get(4));
		
		System.out.println("the value of hashcode:-> "+ht.hashCode());
		System.out.println("the value of hashcode:-> "+ht2.hashCode());
	
		*/
		
		
		
		
		
		
		
		
		
		
		/*
		
		Hashtable ht=new Hashtable();
		ht.put(1, "Betti");
		ht.put(2, "Ketti");
		ht.put(3, "Lilli");
		
		System.out.println(ht.get(2));
		
		
		Set httt = ht.entrySet();
		System.out.println(httt);
		
		
		
		Enumeration ht1 = ht.elements();
		while(ht1.hasMoreElements())
		{
			System.out.println(ht1.nextElement());
		}
		
		*/
	}

}
