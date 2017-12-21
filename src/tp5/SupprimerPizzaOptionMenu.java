package tp5;

import java.util.Scanner;

import fr.pizzeria.exception.DeletePizzaException;

public class SupprimerPizzaOptionMenu extends OptionMenu{
	public SupprimerPizzaOptionMenu(String libele) {
		super(libele);
	}
	
	
	@Override
	void execute(PizzaDaoImpl pDaoI) throws DeletePizzaException{
		
		System.out.println(this.libele);
		String code;
		
		System.out.println("Veuillez saisir le code");
		code = (new Scanner(System.in)).nextLine();
		try{
		pDaoI.deletePizza(code);
		}
		catch(DeletePizzaException del)
		{}
		

	}


	
	
}
