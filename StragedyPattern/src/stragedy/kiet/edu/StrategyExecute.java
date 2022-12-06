package stragedy.kiet.edu;

import java.io.*;

public class StrategyExecute {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the two numbers to perform operation");
		float num1 = Float.parseFloat(br.readLine());
		float num2 = Float.parseFloat(br.readLine());
		Context context=new Context(new Multiplication());
		System.out.println("Multiplication " +context.executeStragedy(num1, num2));
		Context context1 =new Context(new Subtraction());
		System.out.println("Subtraction " + context1.executeStragedy(num1, num2));
		
	}

}
