package tp5;

import fr.pizzeria.model.Pizza;

public class ListerPizzasOptionMenu extends OptionMenu {
	public ListerPizzasOptionMenu(String libele) {
		super(libele);
	}

	@Override
	void execute(PizzaDaoImpl pDaoI) {
		System.out.println(this.libele);
		Pizza[] piz=pDaoI.findAllPizzas();
		
		for (int i = 0; i < piz.length; i++) {
			if (piz[i] != null) {
				System.out.println(piz[i].getCode() + "->" + piz[i].getNom() + "(" + piz[i].getPrix() + ")");
			}
		}
	}

}
