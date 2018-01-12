package fr.pizzeria.console;

import java.util.Scanner;

import fr.pizzeria.model.Pizza;

public class PizzeriaAdminConsoleApp {

	public static void ListerPizza(Pizza[] piz) {
		System.out.println("Liste des pizzas");
		for (int i=0;i<piz.length;i++)
		{
			if (piz[i]!=null)
			{
				System.out.println(piz[i].getCode()+"->"+piz[i].getNom()+"("+piz[i].getPrix()+")");
			}
		}
	}

	public static void AjoutPizza(Pizza[] piz) {
		String code,nom;
		double prix;

		
		System.out.println("Ajout d’une nouvelle pizza");
		System.out.println("Veuillez saisir le code");
		code = (new Scanner(System.in)).nextLine();
		System.out.println("Veuillez saisir le nom (sans espace)");
		nom = (new Scanner(System.in)).nextLine();
		System.out.println("Veuillez saisir le prix");
		prix = (new Scanner(System.in)).nextDouble();
		
		Pizza p = new Pizza(code, nom, prix, null);
		
		//Insertion de la nouvelle pizza
		for (int i=0; i<piz.length; i++)
		{
			if (piz[i]==null)
			{

				piz[i]=p;
				break;
			}
		}
	}

	public static void SupprimerPizza(Pizza[] piz) {
		ListerPizza(piz);
		String code;
		
		System.out.println("Veuillez saisir le code");
		code = (new Scanner(System.in)).nextLine();
		for (int i=0; i<piz.length; i++)
		{
			if (code.equals(piz[i].getCode()))
			{
				piz[i]=null;
				break;
			}
		}
		
	}

	public static void MAJPizza(Pizza[] piz) {
		SupprimerPizza(piz);
		AjoutPizza(piz);
		
	}

	public static void Sortir() {
		System.out.println("Aurevoir :'(");
		System.exit(0);
	}

	public static void main(String[] args) {

		Pizza[] pizzas = new Pizza[100];
		pizzas[0]=new Pizza("PEP", "Pépéroni", 12.50, null);
		pizzas[1]=new Pizza("MAR", "Margherita", 14.00, null);
		pizzas[2]=new Pizza("REIN", "La Reine", 11.50, null);
		pizzas[3]=new Pizza("FRO", "La 4 fromages", 12.00, null);
		pizzas[4]=new Pizza("CAN", "La cannibale", 12.50, null);
		pizzas[5]=new Pizza("SAV", "La savoyarde", 13.00, null);
		pizzas[6]=new Pizza("ORI", "L’orientale", 13.50, null);
		pizzas[7]=new Pizza("IND", "L’indienne", 14.00, null);	
		
		int nombreChoisit;
		do {

			System.out.println("***** Pizzeria Administration *****");
			System.out.println("1. Lister les pizzas");
			System.out.println("2. Ajouter une nouvelle pizza");
			System.out.println("3. Mettre à jour une pizza");
			System.out.println("4. Supprimer une pizza");
			System.out.println("99. Sortir");

			nombreChoisit = (new Scanner(System.in)).nextInt();
			switch (nombreChoisit) {
			case 1:
				ListerPizza(pizzas);
				break;

			case 2:
				AjoutPizza(pizzas);
				break;

			case 3:
				MAJPizza(pizzas);
				break;

			case 4:
				SupprimerPizza(pizzas);
				break;

			case 99:
				Sortir();
				break;

			}
		} while (nombreChoisit != 99);
		System.out.println("Aurevoir :'(");
		System.exit(0);
	}

}
