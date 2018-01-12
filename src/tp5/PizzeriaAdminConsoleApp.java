package tp5;

import static tp5.PizzeriaAdminConsoleApp.LOG;

import java.sql.SQLException;
import java.util.Scanner;

import fr.pizzeria.dao.IPizzaDao;
import fr.pizzeria.dao.PizzaDaoJdbc;
import fr.pizzeria.exception.AddPizzaException;
import fr.pizzeria.exception.DeletePizzaException;
import fr.pizzeria.model.Pizza;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class PizzeriaAdminConsoleApp {

	public static final Logger LOG = LoggerFactory.getLogger(PizzeriaAdminConsoleApp.class);

	public static void main(String[] args) throws DeletePizzaException, AddPizzaException, ClassNotFoundException, SQLException {

		Menu men = new Menu();
		IPizzaDao pDaoI = new PizzaDaoJdbc();

		int nombreChoisit;
		do {
			LOG.info("***** Pizzeria Administration *****");
			LOG.info("1. Lister les pizzas");
			LOG.info("2. Ajouter une nouvelle pizza");
			LOG.info("3. Mettre à jour une pizza");
			LOG.info("4. Supprimer une pizza");
			LOG.info("99. Sortir");

			nombreChoisit = (new Scanner(System.in)).nextInt();
			switch (nombreChoisit) {
			case 1:
				men.menu[0].execute(pDaoI);
				break;

			case 2:
				men.menu[3].execute(pDaoI);
				break;

			case 3:
				men.menu[2].execute(pDaoI);
				break;

			case 4:
				men.menu[1].execute(pDaoI);
				break;

			}

		} while (nombreChoisit != 99);
		LOG.info("Aurevoir :'(");
		System.exit(0);
	}

}
