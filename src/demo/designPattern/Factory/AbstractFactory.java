package demo.designPattern.Factory;

public class AbstractFactory {
	public static void main(String[] args){
		FactoryBMW factoryBMW320 = new FactoryBMW320();
		factoryBMW320.createBmw();
		
		FactoryBMW factoryBMW523 = new FactoryBMW523();
		factoryBMW523.createBmw();
	}
}



interface FactoryBMW{
	BMW createBmw();
}


class FactoryBMW320 implements FactoryBMW
{

	@Override
	public BMW createBmw() {
		return new BMW320();
	}
	
}


class FactoryBMW523 implements FactoryBMW
{

	@Override
	public BMW createBmw() {
		return new BMW523();
	}
	
}

