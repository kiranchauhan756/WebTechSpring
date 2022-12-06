package kiet.edu.springfirst;

public class Bike implements Vehicle {
	String name;
	String model;

	Bike(String name, String model) {
		this.name = name;
		this.model = model;
	}

	public String info() {
		return "Bike [name=" + name + ", model=" + model + "]";

	}

}
