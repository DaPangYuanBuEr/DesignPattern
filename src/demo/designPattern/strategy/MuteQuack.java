package demo.designPattern.strategy;

public class MuteQuack implements IQuackBehavior {

	@Override
	public void quack() {
		System.out.println("Mute Quack");
	}

}
