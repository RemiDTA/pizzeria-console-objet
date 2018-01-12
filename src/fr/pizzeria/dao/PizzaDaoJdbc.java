package fr.pizzeria.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.ResourceBundle;

import javax.management.RuntimeErrorException;

import fr.pizzeria.exception.AddPizzaException;
import fr.pizzeria.exception.DeletePizzaException;
import fr.pizzeria.model.CategoriePizza;
import fr.pizzeria.model.Pizza;

public class PizzaDaoJdbc implements IPizzaDao {

	ResourceBundle bundle = ResourceBundle.getBundle("jdbc");

	public Connection connexionBase() {
		// On essaie d'ouvrir une connexion a la BDD grace au fichier
		// jdbc.properties
		try {
			String db = "", user = "", pwd = "";

			db = bundle.getString("BDD");
			user = bundle.getString("utilisateur");
			pwd = bundle.getString("mdp");
			java.sql.Connection connect = DriverManager.getConnection(db, user, pwd);

			return connect;
		} catch (SQLException e) {

			throw new RuntimeException("probleme de co a la BDD");
		}

	}

	public PizzaDaoJdbc() throws ClassNotFoundException, SQLException {
		// Chargement du driver 1 seule fois par lancement du programme
		Class.forName(bundle.getString("driver"));

	}

	@Override
	public ArrayList<Pizza> findAllPizzas() {
		try {
			Connection connect = connexionBase();
			java.sql.Statement statement = connect.createStatement();
			ResultSet resultat = statement.executeQuery("SELECT * FROM pizzeria.pizza;");
			ArrayList<Pizza> pizzas = new ArrayList<Pizza>();

			while (resultat.next()) {
				Pizza pizza = new Pizza(resultat.getString("code"), resultat.getString("nom"), resultat.getInt("prix"),
						null);
				pizzas.add(pizza);
			}
			statement.close();
			connect.close();
			return pizzas;
		} catch (Exception e) {
			throw new RuntimeException("probleme a l'affichage de la BDD");
		}
	}

	@Override
	public void saveNewPizza(Pizza pizza) throws AddPizzaException {
		Connection connect = connexionBase();

		try {
			PreparedStatement ajoutPizzaSt = connect
					.prepareStatement("INSERT INTO pizzeria.pizza(code, nom, prix, nbPizza, idcate) VALUES (?,?,?,?,?);");
			ajoutPizzaSt.setString(1, pizza.getCode());
			ajoutPizzaSt.setString(2, pizza.getNom());
			ajoutPizzaSt.setDouble(3, pizza.getPrix());
			ajoutPizzaSt.setInt(4, Pizza.getNbPizza());
			ajoutPizzaSt.setInt(5, 2);
			ajoutPizzaSt.executeUpdate();

			ajoutPizzaSt.close();
			connect.close();
		} catch (SQLException e) {
			throw new AddPizzaException("Probleme de suppression de pizza");
		}
	}

	@Override
	public void deletePizza(String codePizza) throws DeletePizzaException {
		Connection connect = connexionBase();

		try {
			java.sql.Statement statement = connect.createStatement();
			String querry = "DELETE FROM pizzeria.pizza WHERE code='" + codePizza + "';";
			int nbSupr = statement.executeUpdate(querry);
			System.out.println("Vous avez supprimer " + nbSupr + " ligne(s)");
			statement.close();
			connect.close();
		} catch (SQLException e) {
			throw new DeletePizzaException("Probleme de suppression de pizza");
		}
	}

}
