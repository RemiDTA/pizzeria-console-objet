package tp5;

import java.sql.SQLException;
import java.util.ArrayList;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import fr.pizzeria.dao.IPizzaDao;
import fr.pizzeria.model.Pizza;

public class ListerPizzasOptionMenu extends OptionMenu {
	private static final Logger LOG = LoggerFactory.getLogger(ListerPizzasOptionMenu.class);

	public ListerPizzasOptionMenu(String libele) {
		super(libele);
	}

	@Override
	void execute(IPizzaDao pDaoI) throws ClassNotFoundException, SQLException {
		LOG.info(this.libele);
		ArrayList<Pizza> piz = pDaoI.findAllPizzas();

		for (int i = 0; i < piz.size(); i++) {
			LOG.info(piz.get(i).toString());
		}
	}
}
