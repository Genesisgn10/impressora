package entities_classes;

import java.util.ArrayList;
import java.util.List;

import entities_interface.Flying;

public class ControlTower {

	private List<Flying> flyings = new ArrayList<>();
	
	public ControlTower() {
		
	}

	public ControlTower(List<Flying> voadores) {
		super();
		this.flyings = voadores;
	}

	public List<Flying> getVoadores() {
		return flyings;
	}

	public void setVoadores(List<Flying> voadores) {
		this.flyings = voadores;
	}
	
	public void flyAll() {
		for (Flying flying : flyings) {
			flying.voar();
		}
	}
	
	 public void addFlying(Flying umVoador) {
		 flyings.add(umVoador);
	}
}
