package tp5;

import java.util.Scanner;

import fr.pizzeria.model.Pizza;

public class SupprimerPizzaOptionMenu extends OptionMenu{
	public SupprimerPizzaOptionMenu(String libele) {
		super(libele);
	}
	
	
	@Override
	void execute(Pizza[] piz){
		
		System.out.println(this.libele);
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


	
	
}
