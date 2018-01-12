package fr.pizzeria.model;

public class Pizza {


	@ToString
	private String code;
	@ToString
	private String nom;
	@ToString
	private double prix;
	private static int nbPizza;
	@ToString
	private CategoriePizza cate;
	
	public Pizza(String code, String nom, double prix, CategoriePizza cate)
	{
		Pizza.nbPizza++;
		this.nom=nom;
		this.code=code;
		this.prix=prix;
		this.cate=cate;
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
	public String toString(){
		
		return this.code +" "+ this.nom +" " + this.prix;
	}

	public static int getNbPizza() {
		return nbPizza;
	}

	public static void setNbPizza(int nbPizza) {
		Pizza.nbPizza = nbPizza;
	}

	public CategoriePizza getCate() {
		return cate;
	}

	public void setCate(CategoriePizza cate) {
		this.cate = cate;
	}
	
}
