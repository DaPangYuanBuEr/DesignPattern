package demo.designPattern.strategy;

public class MallardDuck extends Duck {

	public MallardDuck()
	{
		flyBehavior = new FlyWithWings();
		quackBehavior = new Quack();
	}
	
	
	@Override
	public void display() {
		System.out.println("this is a mallard duck");
	}

}
