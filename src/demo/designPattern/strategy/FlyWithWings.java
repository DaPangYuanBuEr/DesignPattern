package demo.designPattern.strategy;

public class FlyWithWings  implements IFlyBehavior{

	@Override
	public void fly() {
		System.out.println("fly with wings");
	}

}
