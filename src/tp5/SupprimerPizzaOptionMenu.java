package tp5;

import java.util.Scanner;

public class SupprimerPizzaOptionMenu extends OptionMenu{
	public SupprimerPizzaOptionMenu(String libele) {
		super(libele);
	}
	
	
	@Override
	void execute(PizzaDaoImpl pDaoI){
		
		System.out.println(this.libele);
		String code;
		
		System.out.println("Veuillez saisir le code");
		code = (new Scanner(System.in)).nextLine();
		
		pDaoI.deletePizza(code);
	

	}


	
	
}
