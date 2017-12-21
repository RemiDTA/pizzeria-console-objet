package fr.pizzeria.exception;

public class DeletePizzaException extends Exception{

	public DeletePizzaException(){
		System.out.println("Probleme lors de la suppression");
	}
}
