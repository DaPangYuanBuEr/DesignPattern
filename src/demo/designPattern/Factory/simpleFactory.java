package demo.designPattern.Factory;

public class simpleFactory {

	public class BMW320 {
		public BMW320() {
			System.out.println("make a 320 car");
		}
	}

	public class BMW523 {
		public BMW523() {
			System.out.println("make a 523 car");
		}
	}

	public static void main(String[] argsStrings) {
		simpleFactory factory = new simpleFactory();
		simpleFactory.BMW320 bmw320 = factory.new BMW320();
		simpleFactory.BMW523 bmw523 = factory.new BMW523();
	}

}
