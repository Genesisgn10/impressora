package entities_classes;

import entities_interface.Flying;

public class Plane implements Flying{

	private Integer flightHours = 0;
	private final Integer hour = 13;
	
	public Plane() {
		super();
	}

	public Plane(Integer flightHours) {
		super();
		this.setFlightHours(flightHours);
	}

	public Integer getFlightHours() {
		return flightHours;
	}

	public void setFlightHours(Integer flightHours) {
		this.flightHours = flightHours;
	}
	
	@Override
	public void voar() {
	 flightHours += hour; 
	 System.out.println("I'm flying like a plane");
	}

}
