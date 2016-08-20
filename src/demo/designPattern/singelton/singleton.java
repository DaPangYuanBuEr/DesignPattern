package demo.designPattern.singelton;

import java.security.Signature;

public class singleton {

	private static singleton s;

	public static singleton getInstance() {
		if (s == null) {
			s = new singleton();
		}
		return s;
	}
}


class singletonTest{
	public static void  main(String[] argsStrings) {
		singleton s1 = singleton.getInstance();
		singleton s2 = singleton.getInstance();
		if(s1 == s2)
		{
			System.out.println("s1 is the same instance with s2");
		}
		else {
			System.out.println("s1 is not the same instance with s2");
		}
	}
}
