package tp5;

import java.sql.SQLException;
import java.util.Scanner;

import static tp5.PizzeriaAdminConsoleApp.LOG;

import fr.pizzeria.dao.IPizzaDao;
import fr.pizzeria.exception.AddPizzaException;
import fr.pizzeria.exception.DeletePizzaException;
import fr.pizzeria.model.CategoriePizza;
import fr.pizzeria.model.Pizza;

public class AjouterPizzaOptionMenu extends OptionMenu {
	public AjouterPizzaOptionMenu(String libele) {
		super(libele);
	}

	void execute(IPizzaDao pDaoI) throws AddPizzaException, DeletePizzaException {
		String code, nom;
		CategoriePizza cate1 = CategoriePizza.VIANDE;
		CategoriePizza cate2 = CategoriePizza.POISSON;
		CategoriePizza cate3 = CategoriePizza.SANS_VIANDE;
		double prix;

		LOG.info(this.libele);

		LOG.info("Ajout d’une nouvelle pizza");
		LOG.info("Veuillez saisir le code");
		code = (new Scanner(System.in)).nextLine();
		LOG.info("Veuillez saisir le nom (sans espace)");
		nom = (new Scanner(System.in)).nextLine();
		LOG.info("Veuillez saisir le prix");
		prix = (new Scanner(System.in)).nextDouble();
		LOG.info("Quelle catégorie ? (1 pour \"Viande\" 2 pour \"Poisson\" 3 pour \"Sans Viande\")");
		int idCate = (new Scanner(System.in)).nextInt();

		switch (idCate) {
		case 1:
			pDaoI.saveNewPizza(new Pizza(code, nom, prix, cate1));
			break;
		case 2:
			pDaoI.saveNewPizza(new Pizza(code, nom, prix, cate2));
			break;
		case 3:
			pDaoI.saveNewPizza(new Pizza(code, nom, prix, cate3));
			break;
		}
		// Insertion de la nouvelle pizza

	}

}
