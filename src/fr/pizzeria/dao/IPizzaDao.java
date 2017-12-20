package fr.pizzeria.dao;

import fr.pizzeria.model.Pizza;

public interface IPizzaDao {
	Pizza[] findAllPizzas();
	void saveNewPizza(Pizza pizza);
	void deletePizza(String codePizza);

}