package kiet.edu.springfirst;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class App {
	public static void main(String[] args) {
		// tightly coupling not allowed dont use new keyword
		// Car c=new Car();
		//it works is to keep all container in memory
//		ApplicationContext context =new ClassPathXmlApplicationContext("kiet/edu/springfirst/Config.xml");
//		//Vehicle c = new Car();// upcasting loosely coupling
//		Vehicle c=context.getBean(Car.class);
//		
//		//Vehicle c=context.getBean(Car.class);
//		Vehicle b=context.getBean(Bike.class);
//
//		System.out.println(c.info());
//		System.out.println(b.info());
		ApplicationContext context1 =new ClassPathXmlApplicationContext("kiet/edu/springfirst/Config.xml");
		Vehicle c1=context1.getBean(Car.class);
		Vehicle b1=context1.getBean(Bike.class);
		System.out.println(c1.info());
		System.out.println(b1.info());

		
	}
}
