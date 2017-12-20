package tp5;

import fr.pizzeria.model.Pizza;

public class ModifierPizzaOptionMenu extends OptionMenu{
	public ModifierPizzaOptionMenu(String libele) {
		super(libele);
	}

	@Override
	void execute(Pizza[] pizzas) {
	
		SupprimerPizzaOptionMenu suppr= new SupprimerPizzaOptionMenu("Supprimer");
		AjouterPizzaOptionMenu ajout= new AjouterPizzaOptionMenu("Ajout");
		
		suppr.execute(pizzas);
		ajout.execute(pizzas);
	
	}
	
}
