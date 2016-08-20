package demo.designPattern.Factory;

public class FactoryMethod {
	
	public static void main(String[] args) {
		Factory factory = new  Factory();
		BMW bmw320 = factory.creaeBMW(320);
		BMW bmw523 = factory.creaeBMW(523);
	}

}

abstract class BMW {
	public BMW() {

	}
}

class BMW320 extends BMW {
	public  BMW320() {
		System.out.println("BMW 320");
	}
}

class BMW523 extends BMW{
	public BMW523(){
		System.out.println("BMW 523");
	}
}


class Factory{
	public BMW creaeBMW(int type)
	{
		switch (type) {
		case 320:
			return new BMW320();
		case 523:
			return new BMW523();
		default:
			break;
		}
		return null;
	}
}
