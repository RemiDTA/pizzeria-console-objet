package tp5;

import java.sql.SQLException;

import fr.pizzeria.dao.IPizzaDao;
import fr.pizzeria.exception.AddPizzaException;
import fr.pizzeria.exception.DeletePizzaException;

abstract class OptionMenu {
	protected String libele;

	public OptionMenu(String libele) {
		this.libele = libele;
	}

	abstract void execute(IPizzaDao pDaoI) throws DeletePizzaException, AddPizzaException, ClassNotFoundException, SQLException;

	public String getLibele() {
		return libele;
	}

	public void setLibele(String libele) {
		this.libele = libele;
	}

}
