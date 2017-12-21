package tp5;

import java.util.Scanner;

import fr.pizzeria.exception.DeletePizzaException;
import fr.pizzeria.model.Pizza;

public class PizzeriaAdminConsoleApp {

	public static void main(String[] args) throws DeletePizzaException {

		Menu men = new Menu();
		PizzaDaoImpl pDaoI = new PizzaDaoImpl();

		int nombreChoisit;
		do {

			System.out.println("***** Pizzeria Administration *****");
			System.out.println("1. Lister les pizzas");
			System.out.println("2. Ajouter une nouvelle pizza");
			System.out.println("3. Mettre à jour une pizza");
			System.out.println("4. Supprimer une pizza");
			System.out.println("99. Sortir");

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
		System.out.println("Aurevoir :'(");
		System.exit(0);
	}

}
