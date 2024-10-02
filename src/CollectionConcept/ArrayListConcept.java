package CollectionConcept;
import java.util.ArrayList;
import java.util.Iterator;
public class ArrayListConcept {

	public static void main(String[] args) {
		
		
		/*
		ArrayList ar= new ArrayList();  //Dynamic array
		
		ar.add(100);
		ar.add("Tom");
		ar.add('k');
		ar.add(1234566);
		ar.add(true);
		
		for(int i=0; i<ar.size(); i++)
		{
			System.out.println(ar.get(i));
		}
		
		System.out.println("**************");
		
		
		ArrayList<Integer> ar2=new ArrayList<Integer>();
		
		ar2.add(122);//0
		ar2.add(122);//1
		ar2.add(1234);//2
		System.out.println(ar2.size());
		

		System.out.println("**************");	
		
		
		
		
		
		//To print all the values--->
		//1) Use for loop   2)Use interator
		
		
		
		
		
		
		//1) Employee class object
		Employee e1=new Employee("Kanchan",26, "QA");
		Employee e2=new Employee("Kia", 23, "developer");
		Employee e3=new Employee("Caren", 28, "BA");
		
		
		//2) Create ArrayList
		
		ArrayList<Employee> ar3=new ArrayList<Employee>();
		ar3.add(e1);
		ar3.add(e2);
		ar3.add(e3);
		
		
		//3) Iterator to traverse the values
		Iterator<Employee> it = ar3.iterator();
		while(it.hasNext())
		{
			Employee emp = it.next();
			System.out.println(emp.name);
			System.out.println(emp.age);
			System.out.println(emp.org);
		}
		
		
		
		System.out.println("********************");
		
		
		
		
		
		
		
		//AddAllMethod
		
		ArrayList ar4= new ArrayList();
		
		ar4.add("Selenium");
		ar4.add("Cucumber");
		ar4.add("Postman");
		
		ArrayList ar5= new ArrayList();
		
		ar5.add("Rest Assured");
		ar5.add("Appium");
		ar5.add("Jmeter");
		
		ar4.addAll(ar5);
		
		for(int i=0; i<ar4.size(); i++)
		{
			System.out.println(ar4.get(i));
		}



*/
		
		
	/*	
		
		
		
		ArrayList ar1=new ArrayList();
		ar1.add("kanchan");
		ar1.add(100);
		ar1.add('k');
		ar1.add(true);
		ar1.add("kanchan");
		
		System.out.println(ar1.get(0));
		
		//To print all the values
		for(int i=0; i<ar1.size(); i++)
		{
			System.out.println(ar1.get(i));
		}
		
		System.out.println("***********");
		
		ArrayList<Integer> ar2=new ArrayList<Integer>();
		ar2.add(1223); //0
		ar2.add(1344); //1
		ar2.add(3456); //2
		ar2.add(4567); //3
		
		System.out.println(ar2.get(1));
		System.out.println(ar2.get(2));
		System.out.println(ar2.get(3));
		
		
		System.out.println("***********");
		//To print all the values--->1)use for loop  2) Use Iterator
		
	
		
		//1)to create employee class object
		Employee2 e1=new Employee2("Ravina","CS123", 26);
		Employee2 e2 =new Employee2("Shashi", "IN345", 28);
		Employee2 e3=new Employee2("Bindu", "RT789", 30);
		
		//2) create arrayList
		ArrayList<Employee2> arr=new ArrayList<Employee2>();
		arr.add(e1);
		arr.add(e2);
		arr.add(e3);
		
		
		//3)Iterator to traverse the values
		
		Iterator<Employee2> it = arr.iterator();
		while(it.hasNext())
		{
			Employee2 itt = it.next();
			System.out.println("name "+itt.name);
			System.out.println("id "+itt.id);
			System.out.println("age "+itt.age);
		}
		
		System.out.println("************");
		
		//AddAll
		
		ArrayList ar6= new ArrayList();
		ar6.add("Selenium");
		ar6.add("Java");
		ar6.add("Cucumber");
		
		ArrayList ar7=new ArrayList();
		ar7.add("Rest Assured");
		ar7.add("Postman");
		ar7.add("Javasript");
		
		ar6.addAll(ar7);
		
		for(int i=0; i<ar6.size(); i++)
		{
			System.out.println(ar6.get(i));
		}
		
		*/
		
		
		
		
		ArrayList ar1=new ArrayList();
		ar1.add("kanchan");
		ar1.add(100);
		ar1.add('k');
		ar1.add(true);
		
		System.out.println(ar1.get(0));
		System.out.println(ar1.get(2));
		
		for(int i=0; i<ar1.size(); i++)
		{
			System.out.println(ar1.get(i));
		}
		
		System.out.println("**********");
		
		
		ArrayList<Integer> ar2=new ArrayList<Integer>();
		ar2.add(12);
		ar2.add(14);
		ar2.add(16);
		

		System.out.println("**********");
	
		ar1.addAll(ar2);
		
		for(int i=0; i<ar1.size(); i++)
		{
			System.out.println(ar1.get(i));
		}
		
		
		
		
		
		
		
		
		
		
		
	}

}
