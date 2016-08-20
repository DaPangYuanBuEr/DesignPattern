package demo.designPattern.strategy;

public class FlyNoWay implements IFlyBehavior {

	@Override
	public void fly() {
		System.out.println("fly No Way");
	}

}
