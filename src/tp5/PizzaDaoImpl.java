package tp5;

import java.util.ArrayList;

import fr.pizzeria.dao.IPizzaDao;
import fr.pizzeria.exception.DeletePizzaException;
import fr.pizzeria.model.Pizza;

public class PizzaDaoImpl implements IPizzaDao {

	// private static Pizza[] pizzas=new Pizza[100];

	private ArrayList<Pizza> pizzas = new ArrayList<>();

	public PizzaDaoImpl() {
		this.pizzas.add(new Pizza("PEP", "Pépéroni", 12.50));
		this.pizzas.add(new Pizza("MAR", "Margherita", 14.00));
		this.pizzas.add(new Pizza("REIN", "La Reine", 11.50));
		this.pizzas.add(new Pizza("FRO", "La 4 fromages", 12.00));
		this.pizzas.add(new Pizza("CAN", "La cannibale", 12.50));
		this.pizzas.add(new Pizza("SAV", "La savoyarde", 13.00));
		this.pizzas.add(new Pizza("ORI", "L’orientale", 13.50));
		this.pizzas.add(new Pizza("IND", "L’indienne", 14.00));
	}

	public ArrayList<Pizza> findAllPizzas() {
		return this.pizzas;
	}

	// Insertion d'une pizza
	public void saveNewPizza(Pizza p){
		this.pizzas.add(p);
	}

	public void deletePizza(String codePizza) throws DeletePizzaException {

		boolean trouveCode = false;
		for (int i = 0; i < this.pizzas.size(); i++) {
				if (codePizza.equals(this.pizzas.get(i).getCode())) {
					trouveCode = true;
					this.pizzas.remove(i);
					break;
				}
			
		}
		if (!trouveCode) {
			throw new DeletePizzaException();
		}
	}

}