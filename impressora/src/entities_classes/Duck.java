package entities_classes;

import entities_interface.Flying;

public class Duck implements Flying{

	private Integer energy;
	private final static Integer points = 5;
	
	public Duck() {
		super();
	}
	
	public Duck(Integer energy) {
		super();
		this.energy = energy;
	}

	public Integer getEnergy() {
		return energy;
	}

	public void setEnergy(Integer energy) {
		this.energy = energy;
	}

	@Override
	public void voar() {
		energy -= points;
		System.out.println("I'm flying like a duck");
	}

}
