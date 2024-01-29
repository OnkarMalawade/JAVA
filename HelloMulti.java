package mypack;

import org.springframework.context.support.ClassPathXmlApplicationContext;

//import org.springframework.context.ApplicationContext;

public class HelloMulti {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("greet.xml");
		
		springProgram<String> sp = (springProgram<String>) ctx.getBean("greetBean");
		System.out.println(sp);
		
		springProgram<String> sp2 = new springProgram<String>("Call Me");
		System.out.println(sp2);
		
		springProgram<String> sp3 = (springProgram<String>) ctx.getBean("greetBean2");
		System.out.println(sp3);
		
		ctx.close();
	}

}
