package tp5;



public class ModifierPizzaOptionMenu extends OptionMenu{
	public ModifierPizzaOptionMenu(String libele) {
		super(libele);
	}

	@Override
	void execute(PizzaDaoImpl pDaoI) {
	
		SupprimerPizzaOptionMenu suppr= new SupprimerPizzaOptionMenu("Supprimer");
		AjouterPizzaOptionMenu ajout= new AjouterPizzaOptionMenu("Ajout");
		
		suppr.execute(pDaoI);
		ajout.execute(pDaoI);
	
	}
	
}
