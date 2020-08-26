package entities_classes;

import entities_interface.Printable;

public class Document implements Printable {

	private String name;
	private String type;
	
	public Document() {
		super();
	}
	
	public Document(String name, String type) {
		super();
		this.name = name;
		this.type = type;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public void imprimir() {
		System.out.println("I'm word document" + getName()+ " " + getType());
	}
}
