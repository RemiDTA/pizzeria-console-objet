package tp5;

import fr.pizzeria.dao.IPizzaDao;
import fr.pizzeria.exception.AddPizzaException;
import fr.pizzeria.exception.DeletePizzaException;
import static tp5.PizzeriaAdminConsoleApp.LOG;

import java.sql.SQLException;

public class ModifierPizzaOptionMenu extends OptionMenu {
	public ModifierPizzaOptionMenu(String libele) {
		super(libele);
	}

	@Override
	void execute(IPizzaDao pDaoI) throws ClassNotFoundException, SQLException, AddPizzaException {

		SupprimerPizzaOptionMenu suppr = new SupprimerPizzaOptionMenu("Supprimer");
		AjouterPizzaOptionMenu ajout = new AjouterPizzaOptionMenu("Ajout");

		try {
			suppr.execute(pDaoI);
			ajout.execute(pDaoI);

		} catch (DeletePizzaException maj) {
			LOG.info("Probleme lors de la MAJ");
		}

	}

}
