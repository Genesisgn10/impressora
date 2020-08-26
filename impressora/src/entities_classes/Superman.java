package entities_classes;

import entities_interface.Flying;

public class Superman implements Flying {

	private Integer experience = 0;
	private final static Integer experienceIncreaseValue = 3;
	
	public Superman() {
		super();
	}
	
	public Superman(Integer experience) {
		super();
		this.setExperience(experience);
	}

	public Integer getExperience() {
		return experience;
	}

	public void setExperience(Integer experience) {
		this.experience = experience;
	}
	
	@Override
	public void voar() {
		experience += experienceIncreaseValue;
		System.out.println("I'm flying like a champion");
	}
}
