package tp5;

import java.util.ArrayList;

import fr.pizzeria.model.Pizza;

public class ListerPizzasOptionMenu extends OptionMenu {
	public ListerPizzasOptionMenu(String libele) {
		super(libele);
	}

	@Override
	void execute(PizzaDaoImpl pDaoI) {
		System.out.println(this.libele);
		ArrayList<Pizza> piz = pDaoI.findAllPizzas();

		for (int i = 0; i < piz.size(); i++) {
			System.out.println(piz.get(i).getCode() + "->" + piz.get(i).getNom() + "(" + piz.get(i).getPrix() + ")");
		}
	}
}
