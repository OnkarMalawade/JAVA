package myPack;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class AOPClass {
	@Pointcut("execution(public void Operations.displayMsg(..))")
	public void pointcutMethod() {
		
	}
	
	@AfterReturning("execution(public void Operations.*(..))")
	public void callMe(JoinPoint jp) {
		System.out.println("Hello");
	}
}
