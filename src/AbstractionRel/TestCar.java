package AbstractionRel;

public class TestCar {

	public static void main(String[] args) {
		
		System.out.println("wheel:-> "+ Car.wheel);
		System.out.println("engine:-> "+Car.engine);
		
		Honda hd=new Honda();
		hd.start();
		hd.stop();
		hd.refuel();
		hd.insurance();
		
		//dynamic polymorphism--top casting
		Car cr=new Honda();
		cr.start();
		cr.stop();
		cr.refuel();
		
		
		

	}

}
