package CollectionConcept;
import java.util.HashMap;
import java.util.Map.Entry;

public class HashMapConcept {

	public static void main(String[] args) {
		/*
		
		
		HashMap <Integer, String> hm= new HashMap<Integer, String>();
		
		hm.put(1, "pqr");
		hm.put(2, "stu");
		hm.put(3, "uvw");
		hm.put(4, "xyz");
		hm.put(5, "mno");
		
		System.out.println(hm.get(3));
		System.out.println(hm.get(5));
		
		
		
		
		
		//To print all the valus
		for(Entry<Integer, String> hmm : hm.entrySet())
		{
			System.out.println(hmm.getKey() +" "+ hmm.getValue());
		}
		
		hm.remove(5);
		System.out.println(hm);
		
		
		
		//Creating object of Employee class
		Employee e1=new Employee("Geeta", 45,"Space");
		Employee e2=new Employee("Raji", 33,"Raw");
		Employee e3= new Employee("Vinita", 35, "Research");
		
		
		//Create HasMap
		HashMap<Integer, Employee> emp=new HashMap<Integer, Employee>();
		emp.put(1, e1);
		emp.put(2, e2);
		emp.put(3, e3);
		
		for( Entry<Integer, Employee> empp: emp.entrySet())
		{
			int key = empp.getKey();
			Employee valu = empp.getValue();
			System.out.println("Employee "+ key +":");
			System.out.println(valu.name +" "+ valu.age+" "+valu.org);
		}
		

*/
		
		
		/*
		
		
		HashMap <Integer, String> map=new HashMap <Integer, String>();
		
		map.put(1, "geeta");
		map.put(2, "govinda");
		map.put(3, "babita");
		map.put(4, "baban");
		
		System.out.println(map.get(2));
		
		for(Entry<Integer, String> mm: map.entrySet())
		{
			System.out.println(mm.getKey()+ " :" +mm.getValue());
		}
		*/
		
		
		System.out.println("**********");
		
		
		HashMap <Integer, String> map=new HashMap <Integer, String>();
		map.put(1, "kisan");
		map.put(2, "simran");
		map.put(3, "sayali");
		map.put(4, "sagar");
		
		System.out.println(map.get(3));
		
		for(Entry<Integer, String> mm: map.entrySet())
		{
			System.out.println(mm.getKey() +" "+ mm.getValue());
		}
		
		
		
		
		
		
	}

}
