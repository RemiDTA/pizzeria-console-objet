package fr.pizzeria.dao;

import fr.pizzeria.exception.DeletePizzaException;
import fr.pizzeria.model.Pizza;
import fr.pizzeria.exception.SavePizzaException;


public interface IPizzaDao {
	Pizza[] findAllPizzas();
	void saveNewPizza(Pizza pizza) throws SavePizzaException;
	void deletePizza(String codePizza) throws DeletePizzaException;

}
