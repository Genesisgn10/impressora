package entities_classes;

import java.util.ArrayList;
import java.util.List;

import entities_interface.Printable;

public abstract class Printer{
	
	private List<Printable> printable = new ArrayList<>();
	
	public List<Printable> getImprimiveis() {
		return printable;
	}

	public void setPrintable(List<Printable> imprimiveis) {
		this.printable = imprimiveis;
	}

	public void printAll() {
		for (Printable printable : printable) {
			System.out.println(printable);
		}
	}
	
	public void addPrintable(Printable umImprimivel) {
		printable.add(umImprimivel);
	}
}
