package fr.pizzeria.exception;

public class DeletePizzaException extends Exception{

	public DeletePizzaException(String mess){
		System.out.println(mess);
	}
}
