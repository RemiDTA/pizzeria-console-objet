package fr.pizzeria.dao;

import java.sql.SQLException;
import java.util.ArrayList;

import fr.pizzeria.exception.AddPizzaException;
import fr.pizzeria.exception.DeletePizzaException;
import fr.pizzeria.model.Pizza;


public interface IPizzaDao {
	ArrayList<Pizza> findAllPizzas() throws ClassNotFoundException, SQLException;

	void saveNewPizza(Pizza pizza) throws AddPizzaException;

	void deletePizza(String codePizza) throws DeletePizzaException;

}
