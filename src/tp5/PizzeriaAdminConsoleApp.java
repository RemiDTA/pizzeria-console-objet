package tp5;

import java.util.Scanner;

import fr.pizzeria.model.Pizza;

public class PizzeriaAdminConsoleApp {

	public static void main(String[] args) {

		Pizza[] pizzas = new Pizza[100];
		//On alimente le tableau de pizza au lancement de l'appli
		pizzas[0] = new Pizza("PEP", "Pépéroni", 12.50);
		pizzas[1] = new Pizza("MAR", "Margherita", 14.00);
		pizzas[2] = new Pizza("REIN", "La Reine", 11.50);
		pizzas[3] = new Pizza("FRO", "La 4 fromages", 12.00);
		pizzas[4] = new Pizza("CAN", "La cannibale", 12.50);
		pizzas[5] = new Pizza("SAV", "La savoyarde", 13.00);
		pizzas[6] = new Pizza("ORI", "L’orientale", 13.50);
		pizzas[7] = new Pizza("IND", "L’indienne", 14.00);
		
		Menu men=new Menu();
		

		
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
				men.menu[0].execute(pizzas);
				break;

			case 2:
				men.menu[3].execute(pizzas);
				break;

			case 3:
				men.menu[2].execute(pizzas);
				break;

			case 4:
				men.menu[1].execute(pizzas);
				break;

			}
		} while (nombreChoisit != 99);
		System.out.println("Aurevoir :'(");
		System.exit(0);
	}

}
