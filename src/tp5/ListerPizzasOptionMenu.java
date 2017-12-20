package tp5;

import fr.pizzeria.model.Pizza;

public class ListerPizzasOptionMenu extends OptionMenu {
	public ListerPizzasOptionMenu(String libele) {
		super(libele);
	}

	@Override
	void execute(Pizza[] piz) {
		System.out.println(this.libele);

		for (int i = 0; i < piz.length; i++) {
			if (piz[i] != null) {
				System.out.println(piz[i].getCode() + "->" + piz[i].getNom() + "(" + piz[i].getPrix() + ")");
			}
		}
	}

}
