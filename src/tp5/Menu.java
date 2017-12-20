package tp5;

import fr.pizzeria.model.Pizza;

public class Menu {
	//public static final OptionMenu OPTION[];
	
	public static OptionMenu[] menu=new OptionMenu[4];

	public Menu() {

		menu[0] = new ListerPizzasOptionMenu("Lister");
		menu[1] = new SupprimerPizzaOptionMenu("Ajout");
		menu[2] = new ModifierPizzaOptionMenu("Modifier");
		menu[3] = new AjouterPizzaOptionMenu("Supprimer");
		

	}
	
}
