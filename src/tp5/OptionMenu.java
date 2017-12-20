package tp5;

import fr.pizzeria.model.Pizza;

abstract class OptionMenu {
	protected String libele;
	
	public OptionMenu(String libele){
		this.libele=libele;
	}
	
	abstract void execute(Pizza[] pizzas);

	public String getLibele() {
		return libele;
	}

	public void setLibele(String libele) {
		this.libele = libele;
	}
	
}
