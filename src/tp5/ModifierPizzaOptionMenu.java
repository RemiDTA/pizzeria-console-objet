package tp5;

import fr.pizzeria.exception.DeletePizzaException;
import fr.pizzeria.exception.SavePizzaException;

public class ModifierPizzaOptionMenu extends OptionMenu{
	public ModifierPizzaOptionMenu(String libele) {
		super(libele);
	}

	@Override
	void execute(PizzaDaoImpl pDaoI) {
	
		SupprimerPizzaOptionMenu suppr= new SupprimerPizzaOptionMenu("Supprimer");
		AjouterPizzaOptionMenu ajout= new AjouterPizzaOptionMenu("Ajout");
		
		try {
		suppr.execute(pDaoI);
		ajout.execute(pDaoI);
	
		}
		catch (DeletePizzaException | SavePizzaException maj)
		{
			System.out.println("Probleme lors de la MAJ");
		}

	}
	
}
