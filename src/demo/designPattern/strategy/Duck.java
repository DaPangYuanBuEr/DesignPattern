package demo.designPattern.strategy;

public abstract class Duck {

	IFlyBehavior flyBehavior;
	IQuackBehavior quackBehavior;

	public Duck() {
	}
	
	 public abstract void display();
	 
	 public void swim(){
		 
	 }
	 
	 public void performFly(){
		 flyBehavior.fly();
	 }
	 
	 public void performQuack() {
		quackBehavior.quack();
	}
	
}
