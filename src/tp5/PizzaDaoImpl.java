package tp5;

import fr.pizzeria.dao.IPizzaDao;
import fr.pizzeria.model.Pizza;

public class PizzaDaoImpl implements IPizzaDao {

	// private static Pizza[] pizzas=new Pizza[100];

	private Pizza[] pizzas = new Pizza[100];

	public PizzaDaoImpl() {
		this.pizzas[0] = new Pizza("PEP", "Pépéroni", 12.50);
		this.pizzas[1] = new Pizza("MAR", "Margherita", 14.00);
		this.pizzas[2] = new Pizza("REIN", "La Reine", 11.50);
		this.pizzas[3] = new Pizza("FRO", "La 4 fromages", 12.00);
		this.pizzas[4] = new Pizza("CAN", "La cannibale", 12.50);
		this.pizzas[5] = new Pizza("SAV", "La savoyarde", 13.00);
		this.pizzas[6] = new Pizza("ORI", "L’orientale", 13.50);
		this.pizzas[7] = new Pizza("IND", "L’indienne", 14.00);
	}

	public Pizza[] findAllPizzas() {
		return this.pizzas;
	}

	// Insertion d'une pizza
	public void saveNewPizza(Pizza p) {

		for (int i = 0; i < this.pizzas.length; i++) {
			if (this.pizzas[i] == null) {

				this.pizzas[i] = p;
				break;
			}
		}
	}

	public void deletePizza(String codePizza) {

		for (int i = 0; i < this.pizzas.length; i++) {
			if (codePizza.equals(this.pizzas[i].getCode())) {
				this.pizzas[i] = null;
				break;
			}
		}
	}



}