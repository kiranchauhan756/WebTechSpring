package kiet.edu.springfirst;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
//this component 


@Component
public class Car implements Vehicle {
	@Value("Maruti")
	String name;
	@Value("2022")
	String model;

	@Override
	public String toString() {
		return "Car [name=" + name + ", model=" + model + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String info() {
		return "Car [name=" + name + ", model=" + model + "]";

	}
}
