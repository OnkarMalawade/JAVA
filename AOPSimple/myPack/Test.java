package myPack;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("appConfig.xml");
		Operations op = (Operations) ctx.getBean("operationBean");
		System.out.println("Calling Displaying Method of displayMsg()...");
		op.displayMsg("Hello AOP");
	}

}
