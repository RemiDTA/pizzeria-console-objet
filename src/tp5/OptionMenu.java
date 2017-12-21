package tp5;

import fr.pizzeria.exception.DeletePizzaException;

abstract class OptionMenu{
	protected String libele;
	
	public OptionMenu(String libele){
		this.libele=libele;
	}
	
	abstract void execute(PizzaDaoImpl pDaoI) throws DeletePizzaException;

	public String getLibele() {
		return libele;
	}

	public void setLibele(String libele) {
		this.libele = libele;
	}
	
}
