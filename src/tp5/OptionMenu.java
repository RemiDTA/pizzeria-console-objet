package tp5;

import fr.pizzeria.exception.DeletePizzaException;
import fr.pizzeria.exception.SavePizzaException;

abstract class OptionMenu{
	protected String libele;
	
	public OptionMenu(String libele){
		this.libele=libele;
	}
	
	abstract void execute(PizzaDaoImpl pDaoI) throws DeletePizzaException, SavePizzaException;

	public String getLibele() {
		return libele;
	}

	public void setLibele(String libele) {
		this.libele = libele;
	}
	
}
