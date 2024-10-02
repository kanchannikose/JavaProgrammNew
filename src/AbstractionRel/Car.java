package AbstractionRel;

public interface Car {

	// interface abstract in nature
	// no need to write abstract keyword
	// 100% abstraction
	// var by default static and final in nature
	// can not create object of interfce


	
	int wheel = 4;
	String engine = "automatic";

	public void start();

	public void stop();

	public void refuel();

}
