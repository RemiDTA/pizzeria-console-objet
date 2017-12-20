package tp5;

import java.util.Scanner;

import fr.pizzeria.model.Pizza;

public class AjouterPizzaOptionMenu extends OptionMenu {
	public AjouterPizzaOptionMenu(String libele) {
		super(libele);
	}

	void execute(PizzaDaoImpl pDaoI) {
		String code, nom;
		double prix;

		System.out.println(this.libele);

		System.out.println("Ajout d’une nouvelle pizza");
		System.out.println("Veuillez saisir le code");
		code = (new Scanner(System.in)).nextLine();
		System.out.println("Veuillez saisir le nom (sans espace)");
		nom = (new Scanner(System.in)).nextLine();
		System.out.println("Veuillez saisir le prix");
		prix = (new Scanner(System.in)).nextDouble();

		Pizza p = new Pizza(code, nom, prix);

		// Insertion de la nouvelle pizza
		pDaoI.saveNewPizza(p);
	}

}
