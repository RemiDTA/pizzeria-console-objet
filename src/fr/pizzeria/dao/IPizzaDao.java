package fr.pizzeria.dao;

import java.util.ArrayList;

import fr.pizzeria.exception.DeletePizzaException;
import fr.pizzeria.model.Pizza;


public interface IPizzaDao {
	ArrayList<Pizza> findAllPizzas();

	void saveNewPizza(Pizza pizza);

	void deletePizza(String codePizza) throws DeletePizzaException;

}
