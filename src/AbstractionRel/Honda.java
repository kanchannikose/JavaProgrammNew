package AbstractionRel;

public class Honda implements Car {

	@Override
	public void start() {
		System.out.println("Honda--start");

	}

	@Override
	public void stop() {
		System.out.println("Honda--stop");

	}

	@Override
	public void refuel() {
		System.out.println("Honda--refuel");

	}

	// non-Override
	public void insurance() {
		System.out.println("Honda--insurance");
	}

}
