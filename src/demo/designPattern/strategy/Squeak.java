package demo.designPattern.strategy;

public class Squeak  implements IQuackBehavior{

	@Override
	public void quack() {
		System.out.print("Squeak");
	}

}
