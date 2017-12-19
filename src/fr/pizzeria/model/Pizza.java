package fr.pizzeria.model;

public class Pizza {

	private int id=0;
	private String code;
	private String nom;
	private double prix;
	private static int nbPizza;
	
	public Pizza(String code, String nom, double prix)
	{
		this.id=nbPizza;
		Pizza.nbPizza++;
		this.nom=nom;
		this.code=code;
		this.prix=prix;
		
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public double getPrix() {
		return prix;
	}

	public void setPrix(double prix) {
		this.prix = prix;
	}
	
	

}
