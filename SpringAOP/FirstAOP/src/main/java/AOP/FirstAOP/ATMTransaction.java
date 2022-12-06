package AOP.FirstAOP;

import org.springframework.stereotype.Component;

@Component
public class ATMTransaction {

	public void credit() {
		System.out.println("credit 1000 rs");
	}
	public void debit() {
		System.out.println("debit 1000 rs");
	}
}
