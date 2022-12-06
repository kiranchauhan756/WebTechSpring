package AOP.FirstAOP;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

@Aspect
@EnableAspectJAutoProxy
@Component
public class AOPControl {
	
	@Pointcut("execution(public void ATMTransaction.debit())")
	public void forDebit() {}

	@Before("forDebit()")
	public void beforeDebitATM() {
		System.out.println("Welcome to using atm for credit");
	}
	@After("forDebit()")
	public void afterDebitATM() {
		System.out.println("Thank you for using atm for credit");
	}


	@Before("execution(public void ATMTransaction.credit())")
	public void beforeCreditATM() {
		System.out.println("Welcome to using atm for credit");
	}

	@After("execution(public void credit())")
	public void afterCreditATM() {
		System.out.println("Thank You using atm for credit");
	}
}
