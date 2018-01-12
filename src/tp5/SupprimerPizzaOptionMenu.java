package tp5;

import java.sql.SQLException;
import java.util.Scanner;

import fr.pizzeria.dao.IPizzaDao;
import fr.pizzeria.exception.DeletePizzaException;
import static tp5.PizzeriaAdminConsoleApp.LOG;

public class SupprimerPizzaOptionMenu extends OptionMenu {

	public SupprimerPizzaOptionMenu(String libele) {
		super(libele);
	}

	@Override
	void execute(IPizzaDao pDaoI) throws DeletePizzaException, ClassNotFoundException, SQLException {

		LOG.info(this.libele);
		String code;

		LOG.info("Veuillez saisir le code");
		code = (new Scanner(System.in)).nextLine();
		try {
			pDaoI.deletePizza(code);
		} catch (DeletePizzaException del) {
		}

	}

}
